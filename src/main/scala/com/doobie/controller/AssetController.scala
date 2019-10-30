//package com.doobie.controller
//
//import com.doobie.dao.AssetDAO
//import com.doobie.models.{Asset, Employee}
//import scala.concurrent.Future
//
//object AssetController extends AssetDAO{
//
//  def employeeAssetsWithFilterSalary(lowerSalaryLimit: Double): Future[List[(Employee, Asset)]] ={
//    val result = employeeAssetFilterSalary(lowerSalaryLimit)
//    result
//  }
//
//}
