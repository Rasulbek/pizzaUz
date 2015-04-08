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
    val orders = TableQuery[OrderList]

    def list = DBAction{ implicit rs =>
        Logger.info(s"SHOW_ALL = ${products.list}")
        Ok(views.html.index(products.list))
    }

    def newzakaz = DBAction{ implicit rs =>
        Logger.info(s"SHOW_ALL = ${products.list}")
        Ok(views.html.order(products.list,0))
    }
    def add = DBAction{ implicit req =>
      val formParam = req.body.asFormUrlEncoded
        val name = formParam.get("name")(0)
        val quan = formParam.get("quantity")(0)
        val address = formParam.get("address")(0)
        val contact = formParam.get("contact")(0)
        val pizzaId: Int =  formParam.get("pizza")(0).toInt
      val timeis = System.currentTimeMillis()
      println("Name: " + name)
        val orderId = (orders returning orders.map(_.id)) += Order(None, name, contact,address, pizzaId,timeis.toString,false)
      Redirect(routes.ZakazTable.list())
    }
    def pizza(id: Int) = DBAction{ implicit  rc =>
        Ok(views.html.order(products.withFilter(_.id === id).list,id))
    }
}
