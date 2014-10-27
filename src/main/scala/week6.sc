import forcomp.Anagrams._

wordOccurrences("skata")

def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString(""))

sentenceOccurrences(List("skata", "aposkata", "sta"))

//wordAnagrams("elvis")
val test1 = combinations(sentenceOccurrences(List("aabb")))
val test2 = sentenceOccurrences(List("aabb"))

def combinations(occurrences: Occurrences): List[Occurrences] = {
 val combs = List(List(), occurrences)
 for (occ <- occurrences) {
   println(occ)
   println(subsequences(occ))
 }
 def subsequences(occurence: (Char, Int)): Occurrences = {
   val tempList = List()
   for (cCount <- 1 to occurence._2) {
      println((occurence._1, cCount))
   }
   tempList
 }
 combs
}

val test3 = combinations(test2)