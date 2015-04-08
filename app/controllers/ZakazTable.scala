package controllers

import models._
import play.api.Logger
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import play.api.mvc._

import scala.slick.lifted.TableQuery

/**
 * Created by 
    ABDURASULOFF RASULBEK 
    (mr.abdurasuloff@gmail.com)
    on 14.03.2015.
 */
class ZakazTable extends Controller{
    val ordertable = TableQuery[OrderList]

    def list = DBAction{ implicit rs =>
        Logger.info(s"SHOW_ALL = ${ordertable.list}")
        Ok(views.html.orderslist(ordertable.list))
    }

}
