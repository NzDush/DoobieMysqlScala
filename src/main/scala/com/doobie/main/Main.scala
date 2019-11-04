package com.doobie.main

import com.doobie.connection.MysqlConnection
import com.doobie.models.Employee

object Main extends App with MysqlConnection{

  import com.doobie.controller.EmployeeController.{ insertOneEmployee1, insertOneEmployee2, insertManyEmployees, viewAllEmployees,
                                                    updateEmployeeViaId, deleteEmployeeViaId, groupEmployeesByAddress, sortEmployeeBySalary,
                                                    sortEmployeeNamesBySalaryWithMapping}
  import com.doobie.controller.AssetController.employeeAssetsWithFilterSalary
  import com.doobie.controller.ManufacturerController.{connectionBetweenEmployeeAssetManufacturer, connectionBetweenProjectEmployeeAssetManufacturer}
  import com.doobie.controller.ProjectController.employeeWithProjects

  insertOneEmployee1(Employee(22,"MMM","Galle",86.3))

  insertManyEmployees(List(Employee(32,"MMM","Galle",86.3), Employee(33,"MMM","Galle",86.3), Employee(34,"MMM","Galle",86.3)))

  viewAllEmployees

  updateEmployeeViaId(32, Employee(22,"NNN","Nuwara-Eliya",65.2))

  deleteEmployeeViaId(34)

  groupEmployeesByAddress

  sortEmployeeBySalary

  sortEmployeeNamesBySalaryWithMapping

  employeeAssetsWithFilterSalary(50)

  connectionBetweenEmployeeAssetManufacturer

  connectionBetweenProjectEmployeeAssetManufacturer

  employeeWithProjects

}
