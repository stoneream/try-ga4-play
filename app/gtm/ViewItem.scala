package gtm

import play.api.libs.json.Json

case class ViewItem(
    currencyCode: String = "JPY",
    items: List[EcommerceItem]
) extends GTM {
  val event = "view_item"

  def toJson = {
    Json.obj(
      "event" -> event,
      "ecommerce" -> Json.obj(
        "currencyCode" -> currencyCode,
        "items" -> items.map(_.toJson)
      )
    )
  }
}