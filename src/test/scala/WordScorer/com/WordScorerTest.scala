package WordScorer.com

import org.scalatest.{FlatSpec, Matchers}
import org.mockito.Mockito._
import org.mockito.Matchers.anyString
import org.scalatest.mock.MockitoSugar

/**
  * Created by User on 21/05/2016.
  */
class WordScorerTest extends FlatSpec with Matchers with MockitoSugar {


  def withWordScorer(test: WordScorer=>Unit)={
    val ws=new WordScorer
    test(ws)
  }

  def withNumber(myTest:Int=>Unit)={
    val b=4
    myTest(b)
  }
  "calling word scorer" should "return 2 when ai passed " in {
      withWordScorer(w => w.score("ai") shouldBe 2)
    }

  "call" should "return" in {
    withNumber(Int=>3 shouldBe 3)

  }
}
