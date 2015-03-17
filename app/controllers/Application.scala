package controllers

import play.api.mvc._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import models._
import play.api.Logger

import scala.slick.lifted.TableQuery

object Application extends Controller {
  val products = TableQuery[ProductTable]
  def index = DBAction{ implicit rs =>
    Logger.info(s"SHOW_ALL = ${products.list}")
    Ok(views.html.index(products.list))
  }
  def about = Action {
    Ok(views.html.about(""))
  }
  def vacancy = Action {
    Ok(views.html.vacancy(""))
  }
  def order = Action {
    Ok(views.html.order(""))
  }
}