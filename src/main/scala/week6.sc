import forcomp.Anagrams._

wordOccurrences("skata")

def sentenceOccurrences(s: Sentence): Occurrences = wordOccurrences(s.mkString(""))

sentenceOccurrences(List("skata", "aposkata", "sta"))