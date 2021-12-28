package controllers

import javax.inject._
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

@Singleton
class HomeController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {
  private val itemStore = List(
    Item(1, "プリンター", 10000),
    Item(2, "パソコン", 50000)
  )

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def items = Action { implicit request =>
    Ok(views.html.items(itemStore))
  }

  def itemDetail(id: Long) = Action {
    itemStore.find(_.id == id).fold {
      NotFound(views.html.not_found())
    } { item =>
      Ok(views.html.item_detail(item))
    }
  }
}

case class Item(
    id: Long,
    name: String,
    value: BigDecimal
)
