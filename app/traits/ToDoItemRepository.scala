package traits

import models.ToDoItem

trait ToDoItemRepository{
  def all(): List[ToDoItem]
  def create(note: String)
  def delete(id: Int)
  def edit(id: Int, note: String)
}
