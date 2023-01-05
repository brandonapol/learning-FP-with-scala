import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

// this is bad, as it mutates the original `word` list
// made obvious by the return `void`
class wordScore {
    static int score(String word) {
        return word.replaceAll("a", "").length();
    }

    static Comparator<String> scoreComparator = 
        new Comparator<String>() {
            public int compare(String w1, String w2) {
                return Integer.compare(score(w2), score(w1));
            }
        };

    static List<String> rankedWords(List<String> words) {
        words.sort(scoreComparator);
        return words;
    }

    List<String> words = Arrays.asList("ada", "haskell", "java", "scala", "rust");
    List<String> ranking = rankedWords(words);
    public void execute() {
        System.out.println(ranking);
    }
}