import forcomp.Anagrams._









wordOccurrences("skata")
wordOccurrences("aposkata")
def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString(""))
sentenceOccurrences(List("skata", "aposkata", "sta"))

//wordAnagrams("elvis")
val test1 = combinations(sentenceOccurrences(List("aabb")))
val test2 = sentenceOccurrences(List("aabb"))
def combinations(occurrences: Occurrences): List[Occurrences] = {
  occurrences.toSet[(Char,Int)].subsets.map(_.toList).toList
}
//val test3 = combinations(test2)
def subtract(x: Occurrences, y: Occurrences): Occurrences = {
  def subtractTerm(innerMap: Map[Char, Int], term: (Char, Int)): Map[Char, Int] = {
    val (c, i) = term
    if (innerMap(c) - i > 0)
      innerMap + (c -> (innerMap(c) - i))
    else innerMap - c
  }

  def subtr(xm: Map[Char, Int], ym: Map[Char, Int]) = {
    (ym foldLeft xm)(subtractTerm)
  }

  subtr(x.toMap,y.toMap).toList.sorted
}
val finass = subtract(wordOccurrences("aposkata"), wordOccurrences("skata"))

