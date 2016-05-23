package AuthExample

/**
  * Created by User on 22/05/2016.
  */

object BasicAction extends BasicAction with authConnector

trait BasicAction {
  def basicAuth: basicAuthenticator
  def result(i:Int) = basicAuth.authenticate(i)((userName:String) => Int => i*2 + userName + "Test")

}
