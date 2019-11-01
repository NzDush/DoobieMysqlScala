package com.doobie.main

import com.doobie.connection.MysqlConnection
import com.doobie.controller.EmployeeController
import com.doobie.models.Employee
import doobie.util.query.Query
import doobie.util.transactor
import doobie._
import doobie.implicits._
import doobie.util.ExecutionContexts
import cats._
import cats.data._
import cats.effect._
import cats.implicits._


object Main extends App with MysqlConnection{

  import com.doobie.controller.EmployeeController.{ insertOneEmployee1, insertOneEmployee2, insertManyEmployees, viewAllEmployees,
                                                    updateEmployeeViaId, deleteEmployeeViaId, groupEmployeesByAddress}

//  insertOneEmployee1(Employee(22,"MMM","Galle",86.3))
//
//  insertManyEmployees(List(Employee(32,"MMM","Galle",86.3), Employee(33,"MMM","Galle",86.3), Employee(34,"MMM","Galle",86.3)))
//
//  viewAllEmployees

//  updateEmployeeViaId(32, Employee(22,"NNN","Nuwara-Eliya",65.2))

//  deleteEmployeeViaId(34)

  groupEmployeesByAddress








}
