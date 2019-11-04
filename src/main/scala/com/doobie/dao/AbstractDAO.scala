package com.doobie.dao

import com.doobie.connection.MysqlConnection

trait AbstractDAO[T] extends MysqlConnection{

  def insert(row: List[T]): doobie.ConnectionIO[Int]

  def viewAll: doobie.Query0[T]

  def update(id: Int, data: T): doobie.Update0

  def delete(id: Int): doobie.Update0

}
