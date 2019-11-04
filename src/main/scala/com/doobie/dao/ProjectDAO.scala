package com.doobie.dao

import doobie.implicits._
import com.doobie.connection.MysqlConnection
import com.doobie.models.{Employee, EmployeeProjects, Project}

trait ProjectDAO extends  //AbstractDAO[Project] with
                          MysqlConnection {
  //  import y._

  def employeeProjects: doobie.Query0[(Employee, EmployeeProjects, Project)] ={
    sql"""
         |SELECT *
         |FROM Employee
         |INNER JOIN Employee_has_Project
         |  ON Employee.employee_id = Employee_has_Project.employee_id
         |INNER JOIN Project
         |  ON Employee_has_Project.project_id = Project.project_id
         |ORDER BY Employee_has_Project.project_id
         |ASC
         |""".stripMargin.query[(Employee, EmployeeProjects, Project)]
  }

  //  def insert(project: List[Project]): Future[List[Project]] ={
  //
  //  }
  //
  //  def viewAll: Future[List[Project]] ={
  //
  //  }
  //
  //  def update(project_id: Int, newProject: Project): Future[Project]={
  //
  //  }
  //
  //  def delete(project_id: Int): Future[Int]={
  //
  //  }

}
