package gtm

import play.api.libs.json.{ JsObject, Json }

trait Writable {
  def toJson: JsObject

  def toJsonString = Json.stringify(toJson)
}
