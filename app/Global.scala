import  modules._
import play.api.GlobalSettings
import scaldi.play.ScaldiSupport

object  Global  extends  GlobalSettings  with  ScaldiSupport  {
  def  applicationModule  =  new  ControllerInjector  ::  new  ServiceModule
}
