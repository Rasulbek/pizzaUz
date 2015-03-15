package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index(""))
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