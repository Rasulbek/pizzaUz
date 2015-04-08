package models

/**
 * Created by 
    ABDURASULOFF RASULBEK 
    (mr.abdurasuloff@gmail.com)
    on 14.03.2015.
 */

import play.api.db.slick.Config.driver.simple._

case class Pizza (id: Option[Int],
                 name: String,
                 desc: String,
                 image: String,
                 price: Int)

class ProductTable(tag: Tag) extends Table[Pizza](tag, "PRODUCTS") {

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def name = column[String]("NAME", O.Default(""))

  def description = column[String]("DESCRIPTION", O.Default(""))

  def image = column[String]("IMAGE", O.Default("logo.png"))

  def price = column[Int]("PRICE", O.Default(0))

  def * = (id.?, name, description, image, price) <> (Pizza.tupled, Pizza.unapply _)

}
