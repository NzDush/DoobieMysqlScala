package com.doobie.controller

import com.doobie.connection.MysqlConnection
import com.doobie.dao.ManufacturerDAO

object ManufacturerController extends ManufacturerDAO with
                                      MysqlConnection{
  import y._

  def connectionBetweenEmployeeAssetManufacturer: Unit ={
    val result = employeeAssetManufacturer.quick.unsafeRunSync
  }

  def connectionBetweenProjectEmployeeAssetManufacturer: Unit ={
    val result = projectEmployeeAssetManufacturer.quick.unsafeRunSync
  }

}
