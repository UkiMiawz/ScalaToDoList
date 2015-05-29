// @SOURCE:D:/Projects/Bapet/play/Scala ToDoList git/ScalaToDoList/conf/routes
// @HASH:ce7088483d38e6a6a7fd4bf55baf0498f00bb6bb
// @DATE:Fri May 29 10:47:15 ICT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {


// @LINE:15
def versioned(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseToDoController {


// @LINE:9
def allToDoItems(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "todo")
}
                        

// @LINE:12
def editToDoItem(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "todo/" + implicitly[PathBindable[Int]].unbind("id", id) + "/edit")
}
                        

// @LINE:11
def deleteToDoItem(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "todo/" + implicitly[PathBindable[Int]].unbind("id", id) + "/delete")
}
                        

// @LINE:10
def addToDoItem(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "todo")
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:15
class ReverseAssets {


// @LINE:15
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseToDoController {


// @LINE:9
def allToDoItems : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ToDoController.allToDoItems",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
      }
   """
)
                        

// @LINE:12
def editToDoItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ToDoController.editToDoItem",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todo/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:11
def deleteToDoItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ToDoController.deleteToDoItem",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todo/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:10
def addToDoItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ToDoController.addToDoItem",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {


// @LINE:15
def versioned(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseToDoController {


// @LINE:9
def allToDoItems(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ToDoController]).allToDoItems(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ToDoController", "allToDoItems", Seq(), "GET", """ To Do List""", _prefix + """todo""")
)
                      

// @LINE:12
def editToDoItem(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ToDoController]).editToDoItem(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ToDoController", "editToDoItem", Seq(classOf[Int]), "POST", """""", _prefix + """todo/$id<[^/]+>/edit""")
)
                      

// @LINE:11
def deleteToDoItem(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ToDoController]).deleteToDoItem(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ToDoController", "deleteToDoItem", Seq(classOf[Int]), "POST", """""", _prefix + """todo/$id<[^/]+>/delete""")
)
                      

// @LINE:10
def addToDoItem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.ToDoController]).addToDoItem(), HandlerDef(this.getClass.getClassLoader, "", "controllers.ToDoController", "addToDoItem", Seq(), "POST", """""", _prefix + """todo""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    