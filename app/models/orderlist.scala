package models

/**
 * Created by 
    ABDURASULOFF RASULBEK 
    (mr.abdurasuloff@gmail.com)
    on 14.03.2015.
 */

import play.api.db.slick.Config.driver.simple._

case class Order (id: Option[Int],
                 name: String,
                 email: String,
                 address: String,
                 product: Int,
                 time: String,
                 delivered: Boolean)

class OrderList(tag: Tag) extends Table[Order](tag, "ORDERS") {

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def name = column[String]("CLIENTNAME", O.Default(""))

  def email = column[String]("EMAIL", O.Default(""))

  def address = column[String]("ADDRESS", O.Default(""))

  def product = column[Int]("PRODUCTID", O.Default(0))

  def time = column[String]("TIME", O.Default(""))

  def delivered = column[Boolean]("ISDELIVERED", O.Default(false))

  def * = (id.?, name, email, address, product, time, delivered) <> (Order.tupled, Order.unapply _)

}
