package com.doobie.models

case class Asset(asset_id: Int, name: String, value: Option[Double], employee_id: Int, manufacturer_id: Int)