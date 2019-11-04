package com.doobie.controller

import com.doobie.connection.MysqlConnection
//import com.doobie.models.Employee
//import scala.concurrent.Future
//import doobie._
import doobie.implicits._
//import doobie.util.ExecutionContexts
//import cats._
//import cats.data._
//import cats.effect._
//import cats.implicits._
import com.doobie.models.Employee
import com.doobie.dao.EmployeeDAO

object EmployeeController extends EmployeeDAO with
                                  MysqlConnection{
  import y._

  def insertOneEmployee1(employee: Employee): Int ={
    val result = insertOne(employee).run.transact(xa).unsafeRunSync
    result
  }

  def insertOneEmployee2(employee: Employee): Unit ={
    val result = insertOne(employee).quick.unsafeRunSync
  }

  def insertManyEmployees(employees: List[Employee]): Unit ={
    val result = insert(employees).quick.unsafeRunSync
  }

  def viewAllEmployees: Unit ={
    val result = viewAll.quick.unsafeRunSync
  }

  def updateEmployeeViaId(employee_id: Int, newEmployee: Employee): Unit ={
    val result = update(employee_id, newEmployee).quick.unsafeRunSync
  }

  def deleteEmployeeViaId(employee_id: Int): Unit ={
    val result = delete(employee_id).quick.unsafeRunSync
  }

  def groupEmployeesByAddress: Unit ={
    val result = groupByAddress.quick.unsafeRunSync
  }

  def sortEmployeeBySalary: Unit ={
    val result = sortBySalary.quick.unsafeRunSync
  }

    def sortEmployeeNamesBySalaryWithMapping: Unit ={
      val result = sortBySalaryWithMapping.unsafeRunSync.foreach{
        employee => {
          println(employee.name)
        }
      }
    }

}
