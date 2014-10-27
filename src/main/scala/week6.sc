import forcomp.Anagrams._

wordOccurrences("skata")

def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString(""))

sentenceOccurrences(List("skata", "aposkata", "sta"))

//wordAnagrams("elvis")

def combinations(occurrences: Occurrences): List[Occurrences] = {

  val sequence = Seq[Occurrences](List())
  for ( occurence <- occurrences) {
    val tempList = ((1 to occurence._2) map( j=> {
      (occurence._1, j)
    } )).toList
    println(tempList)
  }
  sequence.toList
}
combinations(sentenceOccurrences(List("aabb")))
sentenceOccurrences(List("aabb"))