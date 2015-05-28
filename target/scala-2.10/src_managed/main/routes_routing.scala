// @SOURCE:D:/Projects/Bapet/play/Scala ToDoList git/ScalaToDoList/conf/routes
// @HASH:f1dc79e991c6766daf470ea0016e58ba5eadeb0a
// @DATE:Thu May 28 16:19:00 ICT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_ToDoController_allToDoItems1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("todo"))))
private[this] lazy val controllers_ToDoController_allToDoItems1_invoker = createInvoker(
controllers.ToDoController.allToDoItems,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ToDoController", "allToDoItems", Nil,"GET", """ To Do List""", Routes.prefix + """todo"""))
        

// @LINE:10
private[this] lazy val controllers_ToDoController_addToDoItem2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("todo"))))
private[this] lazy val controllers_ToDoController_addToDoItem2_invoker = createInvoker(
controllers.ToDoController.addToDoItem,
HandlerDef(this.getClass.getClassLoader, "", "controllers.ToDoController", "addToDoItem", Nil,"POST", """""", Routes.prefix + """todo"""))
        

// @LINE:11
private[this] lazy val controllers_ToDoController_deleteToDoItem3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("todo/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_ToDoController_deleteToDoItem3_invoker = createInvoker(
controllers.ToDoController.deleteToDoItem(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ToDoController", "deleteToDoItem", Seq(classOf[Int]),"POST", """""", Routes.prefix + """todo/$id<[^/]+>/delete"""))
        

// @LINE:12
private[this] lazy val controllers_ToDoController_editToDoItem4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("todo/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
private[this] lazy val controllers_ToDoController_editToDoItem4_invoker = createInvoker(
controllers.ToDoController.editToDoItem(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.ToDoController", "editToDoItem", Seq(classOf[Int]),"POST", """""", Routes.prefix + """todo/$id<[^/]+>/edit"""))
        

// @LINE:15
private[this] lazy val controllers_Assets_versioned5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
controllers.Assets.versioned(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """todo""","""controllers.ToDoController.allToDoItems"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """todo""","""controllers.ToDoController.addToDoItem"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """todo/$id<[^/]+>/delete""","""controllers.ToDoController.deleteToDoItem(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """todo/$id<[^/]+>/edit""","""controllers.ToDoController.editToDoItem(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.versioned(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_ToDoController_allToDoItems1_route(params) => {
   call { 
        controllers_ToDoController_allToDoItems1_invoker.call(controllers.ToDoController.allToDoItems)
   }
}
        

// @LINE:10
case controllers_ToDoController_addToDoItem2_route(params) => {
   call { 
        controllers_ToDoController_addToDoItem2_invoker.call(controllers.ToDoController.addToDoItem)
   }
}
        

// @LINE:11
case controllers_ToDoController_deleteToDoItem3_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ToDoController_deleteToDoItem3_invoker.call(controllers.ToDoController.deleteToDoItem(id))
   }
}
        

// @LINE:12
case controllers_ToDoController_editToDoItem4_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ToDoController_editToDoItem4_invoker.call(controllers.ToDoController.editToDoItem(id))
   }
}
        

// @LINE:15
case controllers_Assets_versioned5_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(controllers.Assets.versioned(path, file))
   }
}
        
}

}
     