import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String[] files = {"TestSrc/input05.txt"};

        System.out.println(returnSentences(files));
    }

    public static String returnSentences(String[] files) throws FileNotFoundException {
        StringBuffer stringBuffer = new StringBuffer(1000);
        for (String filename : files) {
            String[] text = FindTheSame.readTextFromFile(filename);
            List<String> result = FindTheSame.FindTheSameSymbol(text);
            for (String sent : result)  {
                stringBuffer.append(sent.trim());
                stringBuffer.append(". ");
            }
        }
        return String.valueOf(stringBuffer);
    }

}