package WordScorer.com

/**
  * Created by User on 22/05/2016.
  */
class SpellChecker {
  def checkSpelling(word: String) = {
    println("HITTING REAL SPELL CHECKER!")
    word match {
      case "Andrew" => true
      case "Ellen" => true
      case "EllenB" => false
      case "AndrewB" => false
      case _ => true
    }
  }


}
