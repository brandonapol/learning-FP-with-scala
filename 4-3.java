import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.*;

class tellStory {
    static int score(String word) {
        return word.replaceAll("a", "").length();
    }

    static Comparator<String> scoreComparator = 
        new Comparator<String>() {
            public int compare(String w1, String w2) {
                return Integer.compare(score(w2), score(w1));
            }
        };

    static List<String> rankedWords(Comparator<String> comparator, List<String> words) {
        return words.stream().sorted(comparator).collect(Collectors.toList());
    }

    //* Function call */
    List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");
    List<String> ranking = rankedWords(scoreComparator, words);
    // System.out.println(ranking);
}