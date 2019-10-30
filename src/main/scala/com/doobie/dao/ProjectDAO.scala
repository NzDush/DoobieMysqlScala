//package com.doobie.dao
//
//import com.doobie.connection.MysqlConnection
//import com.doobie.models.{Employee, EmployeeProjects, Project}
//import scala.concurrent.Future
//
//trait ProjectDAO extends  //AbstractDAO[Project] with
//                          EmployeeModel with
//                          ProjectModel with
//                          EmployeeProjectsModel with
//                          MysqlConnection {
//
//  def employeeProjects: Future[List[((Employee, EmployeeProjects), Project)]] ={
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
