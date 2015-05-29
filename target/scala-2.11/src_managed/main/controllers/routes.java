// @SOURCE:D:/Projects/Bapet/play/Scala ToDoList git/ScalaToDoList/conf/routes
// @HASH:ce7088483d38e6a6a7fd4bf55baf0498f00bb6bb
// @DATE:Fri May 29 10:47:15 ICT 2015

package controllers;

public class routes {
public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets();
public static final controllers.ReverseToDoController ToDoController = new controllers.ReverseToDoController();
public static final controllers.ReverseApplication Application = new controllers.ReverseApplication();

public static class javascript {
public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets();
public static final controllers.javascript.ReverseToDoController ToDoController = new controllers.javascript.ReverseToDoController();
public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication();
}
          

public static class ref {
public static final controllers.ref.ReverseAssets Assets = new controllers.ref.ReverseAssets();
public static final controllers.ref.ReverseToDoController ToDoController = new controllers.ref.ReverseToDoController();
public static final controllers.ref.ReverseApplication Application = new controllers.ref.ReverseApplication();
}
          
}
          