package com.doobie.dao

import doobie.implicits._
import com.doobie.connection.MysqlConnection
import com.doobie.models.{Asset, Employee}

trait AssetDAO extends //AbstractDAO[Asset] with
                        MysqlConnection {
//  import y._

  def employeeAssetFilterSalary(lowerSalaryLimit: Double): doobie.Query0[(Employee, Asset)] ={
    sql"""
         |SELECT *
         |FROM Employee
         |INNER JOIN Asset
            |ON Employee.employee_id = Asset.employee_id
         |WHERE Employee.salary > 50.0
         |""".stripMargin.query[(Employee, Asset)]
  }

//    def insert(asset: List[Asset]): Future[List[Asset]] ={
//
//    }
//
//    def viewAll: Future[List[Asset]] ={
//
//    }
//
//    def update(asset_id: Int, newAsset: Asset): Future[Asset]={
//
//    }
//
//    def delete(asset_id: Int): Future[Int]={
//
//    }

}
