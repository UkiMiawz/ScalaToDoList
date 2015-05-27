package models

import play.api.libs.json.Json

object ToDoItem {

  case class ToDoItem(note: String)

  implicit val todoitemWrites = Json.writes[ToDoItem]
  implicit val todoitemReads = Json.reads[ToDoItem]

  var todoitems = List(ToDoItem("Testing"), ToDoItem("Testing2"))

  def addToDoItem(t: ToDoItem) = todoitems = todoitems ::: List(t)
}
