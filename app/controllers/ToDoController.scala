package controllers

import play.api.libs.json._
import play.api.mvc._
import models.ToDoItem

object ToDoController extends Controller {

  def allToDoItems = Action {
      Ok(Json.toJson(ToDoItem.all()))
  }

  def addToDoItem = Action(BodyParsers.parse.json) { request =>
    val b = request.body.validate[String]
    b.fold(
      errors => {
        BadRequest(Json.obj("status" -> "OK", "message" -> JsError.toFlatJson(errors)))
      },
      todoitem => {
        ToDoItem.create(todoitem)
        Ok(Json.obj("status" -> "OK"))
      }
    )
  }

  def deleteToDoItem(id: Int) = Action {
    ToDoItem.delete(id)
    Ok(Json.obj("status" -> "OK"))
  }

  def editToDoItem(id: Int) = Action(BodyParsers.parse.json) { request =>
    val b = request.body.validate[String]
    b.fold(
      errors => {
        BadRequest(Json.obj("status" -> "OK", "message" -> JsError.toFlatJson(errors)))
      },
      todoitem => {
        ToDoItem.edit(id, todoitem)
        Ok(Json.obj("status" -> "OK"))
      }
    )
  }
}
