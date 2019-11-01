package com.doobie.dao

import doobie._
import doobie.implicits._
import doobie.util.ExecutionContexts
import cats._
import cats.data._
import cats.effect._
import cats.implicits._
import com.doobie.models.Employee
import scala.concurrent.Future

trait EmployeeDAO //extends AbstractDAO[Employee]
          {

  def insertOne(employee: Employee): doobie.Update0 ={
    sql"""
         |INSERT INTO Employee (employee_id, name, address, salary)
         |VALUES (${employee.id}, ${employee.name}, ${employee.address}, ${employee.salary})
         |""".stripMargin.update
  }

  def insert(employees: List[Employee]): doobie.ConnectionIO[Int] = {
    val queryString ="""
                       |INSERT INTO Employee (employee_id, name, address, salary)
                       |VALUES (?, ?, ?, ?)
                       |""".stripMargin
    Update[Employee](queryString).updateMany(employees)
  }

  def viewAll: doobie.Query0[Employee] ={
    sql"""
         |SELECT * FROM Employee
         |""".stripMargin.query[Employee]
  }

  def update(employee_id: Int, newEmployee: Employee): doobie.Update0 ={
    sql"""
         |UPDATE Employee
         |SET name = ${newEmployee.name}, address = ${newEmployee.address}, salary = ${newEmployee.salary}
         |WHERE employee_id = $employee_id
         |""".stripMargin.update
  }

  def delete(employee_id: Int): doobie.Update0 ={
    sql"""
         |DELETE FROM Employee
         |WHERE employee_id = $employee_id
         |""".stripMargin.update
  }

  def groupByAddress: doobie.Query0[(String, Long)] ={
    sql"""
         |SELECT address, COUNT(employee_id)
         |FROM Employee
         |GROUP BY Address
         |""".stripMargin.query[(String, Long)]
  }

//  def sortBySalary: Future[List[Employee]] ={
//
//  }

}
