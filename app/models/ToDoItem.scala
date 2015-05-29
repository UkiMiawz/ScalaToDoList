package models

import play.api.libs.json.Json

case class ToDoItem(id: Int, note: String)

object ToDoItem {
  implicit val todoitemWrites = Json.writes[ToDoItem]
  implicit val todoitemReads = Json.reads[ToDoItem]
}
