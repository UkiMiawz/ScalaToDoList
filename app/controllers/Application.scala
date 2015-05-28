package controllers

import play.api.libs.json._
import play.api.mvc._

object Application extends Controller {

  def index = Action{
    Ok("This is index")
  }

}
