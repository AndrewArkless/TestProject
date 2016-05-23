package WordScorer.com

/**
  * Created by User on 21/05/2016.
  */
class WordScorer(spellChecker:SpellChecker) {
  private val VOWELS=List('a','e','i','o','u')

  def score(word:String)={
    if (spellChecker.checkSpelling(word)) word.foldLeft(0){(total, letter)=> total + (if(VOWELS.contains(letter)) 1 else 2)}
    else 0
  }
}
