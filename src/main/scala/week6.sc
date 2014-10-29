import forcomp.Anagrams._
def sentenceAnagrams(sentence: Sentence): List[Sentence] = {
  if (sentence.isEmpty) List(Nil)
  else  {
    //for (word <- combinations(sentence) )
    List(sentence)
  }
}
sentenceAnagrams(List("I", "love", "you"))
def testakas(sentence: Sentence): List[Sentence] = {
  def loop(occ: Occurrences): List[Sentence] = {
    if (occ.isEmpty) List(Nil)
    else {
      for {
        word <- combinations(occ)
        validWord <- dictionaryByOccurrences.getOrElse(word, Nil)
        loopSentence <- loop(subtract(occ, wordOccurrences(validWord)))
      } yield validWord :: loopSentence
    }
  }

  loop(sentenceOccurrences(sentence))
}
testakas(List("I", "love", "you", "fucking","bastard"))