package modules

import scaldi.Module
import repositories._
import services._
import controllers._

class  ServiceModule  extends  Module  {
  bind  [ AnormToDoItemRepository ]   to  new  AnormToDoItemRepository
  bind  [ ToDoItemService ]           to  new  ToDoItemService ( inject [ AnormToDoItemRepository ])
}

class  ControllerInjector  extends  Module  {
  binding  to  new  ToDoController
}
