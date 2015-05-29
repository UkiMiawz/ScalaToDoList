package services

import repository.AnormToDoItemRepository
import models.ToDoItem

class ToDoItemService() {

  val todoitemRepository = new AnormToDoItemRepository

  def all() : List[ToDoItem] = {
    todoitemRepository.all()
  }

  def create(note: String) = {
    todoitemRepository.create(note)
  }

  def delete(id: Int) = {
    todoitemRepository.delete(id)
  }

  def edit(id: Int, note: String){
    todoitemRepository.edit(id, note)
  }
}
