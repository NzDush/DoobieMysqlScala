package com.doobie.controller

import com.doobie.connection.MysqlConnection
import com.doobie.dao.ProjectDAO

object ProjectController extends  ProjectDAO with
                                  MysqlConnection {
  import y._

  def employeeWithProjects: Unit ={
    val result = employeeProjects.quick.unsafeRunSync
  }

}
