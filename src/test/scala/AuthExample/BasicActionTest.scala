package AuthExample


import org.mockito.Mockito._
import org.mockito.Matchers._
import org.scalatest.{Matchers, WordSpecLike}

class BasicActionTest extends WordSpecLike with Matchers {

  val testBasicAction = new BasicAction {
    override def basicAuth: basicAuthenticator = new basicAuthenticator
  }

  "Basic action" should {
    "should return 10 when " in {

      testBasicAction.result(10) shouldBe "20AndrewTest"
    }

    "should return not autheticated " in {

      val wrongUser = mock(classOf[basicAuthenticator])
      when(wrongUser.getUser).thenReturn("UnauthorisedUser")
      when(wrongUser.authenticate(anyInt)(any())).thenReturn("Not Authenticated")
      val testBasicAction = new BasicAction {
        override def basicAuth =  wrongUser
      }
      println(testBasicAction)
      testBasicAction.result(10) shouldBe "Not Authenticated"
    }
  }


}

