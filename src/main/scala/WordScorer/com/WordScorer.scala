package WordScorer.com

/**
  * Created by User on 21/05/2016.
  */
class WordScorer() {
  private val VOWELS=List('a','e','i','o','u')

  def score(word:String)={
    word.foldLeft(0){(total, letter)=> total + (if(VOWELS.contains(letter)) 1 else 2)}
  }
}
