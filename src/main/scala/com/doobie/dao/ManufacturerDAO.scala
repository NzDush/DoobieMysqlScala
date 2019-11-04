package com.doobie.dao

import doobie.implicits._
import com.doobie.connection.MysqlConnection
import com.doobie.models.{Asset, Employee, EmployeeProjects, Manufacturer, Project}

trait ManufacturerDAO extends //AbstractDAO[Manufacturer] with
                              MysqlConnection {
  //  import y._

  def employeeAssetManufacturer: doobie.Query0[(Employee, Asset, Manufacturer)] ={
    sql"""
         |SELECT *
         |FROM Employee
         |INNER JOIN Asset
         |  ON Employee.employee_id = Asset.employee_id
         |INNER JOIN Manufacturer
         |  ON Asset.manufacturer_id = Manufacturer.manufacturer_id
         |""".stripMargin.query[(Employee, Asset, Manufacturer)]
  }

  def projectEmployeeAssetManufacturer: doobie.Query0[(Project, EmployeeProjects, Employee, Asset, Manufacturer)] ={
    sql"""
         |SELECT *
         |FROM Project p
         |INNER JOIN Employee_has_Project ep
         |  ON p.project_id = ep.project_id
         |INNER JOIN Employee e
         |  ON ep.employee_id = e.employee_id
         |INNER JOIN Asset a
         |  ON e.employee_id = a.employee_id
         |INNER JOIN Manufacturer m
         |  ON a.manufacturer_id = m.manufacturer_id
         |""".stripMargin.query[(Project, EmployeeProjects, Employee, Asset, Manufacturer)]
  }

///*  "projectEmployeeAssetManufacturer" with only required columns. In Doobie, this type problems can easily solve.  */
//  def projectEmployeeAssetManufacturer: doobie.Query0[(Project, (String, String, Double), (String, Double), Manufacturer)] ={
//    sql"""
//         |SELECT p.project_id, p.name, p.start, p.end,
//         |       e.name, e.address, e.salary,
//         |       a.name, a.asset_value,
//         |       m.manufacturer_id, m.name, m.country
//         |FROM Project p
//         |INNER JOIN Employee_has_Project ep
//         |  ON p.project_id = ep.project_id
//         |INNER JOIN Employee e
//         |  ON ep.employee_id = e.employee_id
//         |INNER JOIN Asset a
//         |  ON e.employee_id = a.employee_id
//         |INNER JOIN Manufacturer m
//         |  ON a.manufacturer_id = m.manufacturer_id
//         |""".stripMargin.query[(Project, (String, String, Double), (String, Double), Manufacturer)]
//  }

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
