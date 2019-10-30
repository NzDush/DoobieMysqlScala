//package com.doobie.dao
//
//import com.doobie.connection.MysqlConnection
//import com.doobie.models.{Asset, Employee, EmployeeProjects, Manufacturer, Project}
//import scala.concurrent.Future
//
//trait ManufacturerDAO extends //AbstractDAO[Manufacturer] with
//                              EmployeeModel with
//                              EmployeeProjectsModel with
//                              ProjectModel with
//                              AssetModel with
//                              ManufacturerModel with
//                              MysqlConnection {
//
//  def employeeAssetManufacturer: Future[List[((Employee, Asset), Manufacturer)]] ={
//
//  }
//
//  def projectEmployeeAssetManufacturer: Future[List[((((Project, EmployeeProjects), Employee), Asset), Manufacturer)]] ={
//
//  }
//
//  //  def insert(project: List[Project]): Future[List[Project]] ={
//  //
//  //  }
//  //
//  //  def viewAll: Future[List[Project]] ={
//  //
//  //  }
//  //
//  //  def update(project_id: Int, newProject: Project): Future[Project]={
//  //
//  //  }
//  //
//  //  def delete(project_id: Int): Future[Int]={
//  //
//  //  }
//
//}
