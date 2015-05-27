package controllers

import play.api.libs.json._
import play.api.mvc._
import models.Book._
import models.ToDoItem._

object Application extends Controller {

//GET area

  def listBooks = Action {
    Ok(Json.toJson(books))
  }

  def listToDoItems = Action {
    Ok(Json.toJson(todoitems))
}

  def saveBook = Action(BodyParsers.parse.json) { request =>
    val b = request.body.validate[Book]
    b.fold(
      errors => {
        BadRequest(Json.obj("status" -> "OK", "message" -> JsError.toFlatJson(errors)))
      },
      book => {
        addBook(book)
        Ok(Json.obj("status" -> "OK"))
      }
    )
  }

  def saveToDoItem = Action(BodyParsers.parse.json) { request =>
    val b = request.body.validate[ToDoItem]
    b.fold(
      errors => {
        BadRequest(Json.obj("status" -> "OK", "message" -> JsError.toFlatJson(errors)))
      },
      todoitem => {
        addToDoItem(todoitem)
        Ok(Json.obj("status" -> "OK"))
      }
    )
  }

}
