import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheSame {

    public static String[] readTextFromFile(String filename) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(new File(filename));
            String text = "";
            while (scanner.hasNextLine()) {
                text = text + scanner.nextLine();
            }
            scanner.close();
            String[] sentences = text.split("[.!?]");
            return sentences;
        } catch (Exception e) {
            return null;
        }
    }

    public static List<String> FindTheSameSymbol(String[] sentences) {
        List<String> list = new ArrayList<>();
        for (String sentence : sentences) {
            String[] words = sentence.split("[ (),;:\"-]+");
            for (int i = 0; i < words.length; i++) {
                int k = 0;
                for (int j = 0; j < words.length; j++) {
                    if (i == j) {
                        continue;
                    } else if (words[i].equalsIgnoreCase(words[j])) {
                        k++;
                    }
                }
                if ((k > 0) && !(list.contains(sentence))) {
                    list.add(sentence);
                }
            }
        }
        return list;
    }
}