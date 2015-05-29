package repository

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

import models.ToDoItem
import traits.ToDoItemRepository

class AnormToDoItemRepository extends ToDoItemRepository {

  val todoitem = {
    get[Int]("id") ~
    get[String]("note") map {
      case id~note => ToDoItem(id, note)
    }
  }

  def all(): List[ToDoItem] = DB.withConnection { implicit c =>
    SQL("select * from todoitem").as(todoitem *)
  }

  def create(note: String) {
    DB.withConnection { implicit c =>
      SQL("insert into todoitem (note) values ({note})").on(
        'note -> note
      ).executeUpdate()
    }
  }

  def delete(id: Int) {
    DB.withConnection { implicit c =>
      SQL("delete from todoitem where id = {id}").on(
        'id -> id
      ).executeUpdate()
    }
  }

  def edit(id: Int, note: String) {
    DB.withConnection { implicit c =>
      SQL("update todoitem set note = {note} where id = {id}").on(
        'id -> id,
        'note -> note
      ).executeUpdate()
    }
  }

}
