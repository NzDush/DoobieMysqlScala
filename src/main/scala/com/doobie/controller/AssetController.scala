package com.doobie.controller

import com.doobie.connection.MysqlConnection
import com.doobie.dao.AssetDAO

object AssetController extends  AssetDAO with
                                MysqlConnection{
  import y._

  def employeeAssetsWithFilterSalary(lowerSalaryLimit: Double): Unit ={
    val result = employeeAssetFilterSalary(lowerSalaryLimit).quick.unsafeRunSync
  }

}
