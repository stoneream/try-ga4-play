package gtm

import play.api.libs.json.Json

case class EcommerceItem(
    itemName: String,
    itemId: Long,
    price: Long
) extends Writable {
  def toJson = Json.obj(
    "item_id" -> itemId,
    "item_name" -> itemName,
    "price" -> price
  )
}
