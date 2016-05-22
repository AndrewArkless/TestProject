package WordScorer.com

import org.scalatest.{FlatSpec, Matchers}
import org.mockito.Mockito._
import org.mockito.Matchers.anyString
import org.scalatest.mock.MockitoSugar

/**
  * Created by User on 21/05/2016.
  */
class WordScorerTest extends FlatSpec with Matchers {


  def withWordScorer(test: WordScorer=>Unit)={
    val spellChecker=mock(classOf[SpellChecker])
    when(spellChecker.checkSpelling(anyString)).thenReturn(true)
    val ws=new WordScorer(spellChecker)
    test(ws)
  }

  def withFalseSpellChecker(test:WordScorer=>Unit)={
    val falseSpellCheck=mock(classOf[SpellChecker])
    when(falseSpellCheck.checkSpelling(anyString())).thenReturn(false)
    val falseWordScorer=new WordScorer(falseSpellCheck)
    test(falseWordScorer)

  }
  "calling word scorer" should "return 2 when ai passed " in {
      withWordScorer(w => w.score("ai") shouldBe 2)
    }

  "calling false spelling word scorer" should "return 0 when spell check returns false" in {
    withFalseSpellChecker((misspeltWord:WordScorer)=>misspeltWord.score("AndrewB") shouldBe 0)
  }
  "calling word scorer" should "return 0 when AndrewB is passed " in {
    val falseSpellCheck=mock(classOf[SpellChecker])
    when(falseSpellCheck.checkSpelling(anyString)).thenReturn(false)
    val wordScorer=new WordScorer(falseSpellCheck)
    wordScorer.score("AndrewB") shouldBe 0
  }
}
