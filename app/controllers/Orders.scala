package controllers


import play.api.mvc._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import models._
import play.api.Logger

import scala.slick.lifted.TableQuery

/**
 * Created by 
    ABDURASULOFF RASULBEK 
    (mr.abdurasuloff@gmail.com)
    on 14.03.2015.
 */
class Orders extends Controller{
    val products = TableQuery[ProductTable]

    def list = DBAction{ implicit rs =>
        Logger.info(s"SHOW_ALL = ${products.list}")
        Ok(views.html.index(products.list))
    }

    def pizza(id: Int) = DBAction{ implicit  rc =>
        Ok(views.html.order(products.withFilter(_.id === id).list,id))
    }
}
