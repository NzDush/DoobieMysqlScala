package com.doobie.dao

import com.doobie.connection.MysqlConnection
import scala.concurrent.Future

trait AbstractDAO[T] extends MysqlConnection{

  def insert(row: List[T]): Future[List[T]]

  def viewAll: Future[List[T]]

  def update(id: Int, data: T): Future[T]

  def delete(id: Int): Future[Int]

}
