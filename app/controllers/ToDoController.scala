package controllers

import play.api.libs.json._
import play.api.mvc._
import services.ToDoItemService
import repository.AnormToDoItemRepository

object ToDoController extends Controller {

  val toDoItemService = new ToDoItemService

  def allToDoItems = Action {
      Ok(Json.toJson(toDoItemService.all()))
  }

  def addToDoItem = Action(BodyParsers.parse.json) { request =>
    val b = request.body.validate[String]
    b.fold(
      errors => {
        BadRequest(Json.obj("status" -> "OK", "message" -> JsError.toFlatJson(errors)))
      },
      todoitem => {
        toDoItemService.create(todoitem)
        Ok(Json.obj("status" -> "OK"))
      }
    )
  }

  def deleteToDoItem(id: Int) = Action {
    toDoItemService.delete(id)
    Ok(Json.obj("status" -> "OK"))
  }

  def editToDoItem(id: Int) = Action(BodyParsers.parse.json) { request =>
    val b = request.body.validate[String]
    b.fold(
      errors => {
        BadRequest(Json.obj("status" -> "OK", "message" -> JsError.toFlatJson(errors)))
      },
      todoitem => {
        toDoItemService.edit(id, todoitem)
        Ok(Json.obj("status" -> "OK"))
      }
    )
  }
}
