import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestReturnSentencesTest {

    @Test
    public void returnSentencesTest1() throws FileNotFoundException {
        String[] files = {"TestSrc/input01.txt"};
        String expectedResult = "Я сделал задание, я очень старался. ";
        String factualResult = Main.returnSentences(files);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void returnSentencesTest2() throws FileNotFoundException {
        String[] files = {"TestSrc/input02.txt"};
        String expectedResult = "Qwerty qwerty 1234567. ";
        String factualResult = Main.returnSentences(files);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void returnSentencesTest3() throws FileNotFoundException {
        String[] files = {"TestSrc/input03.txt"};
        String expectedResult = "";
        String factualResult = Main.returnSentences(files);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void returnSentencesTest4() throws FileNotFoundException {
        String[] files = {"TestSrc/input04.txt"};
        String expectedResult = "РАЗ ДВА РАЗ ДВА. ";
        String factualResult = Main.returnSentences(files);

        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void returnSentencesTest5() throws FileNotFoundException {
        String[] files = {"TestSrc/input05.txt"};
        String expectedResult = "Я вас любил: любовь еще, быть может,В душе моей угасла не совсем;Но пусть она вас больше не тревожит;Я не хочу печалить вас ничем. ";
        String factualResult = Main.returnSentences(files);

        Assert.assertEquals(expectedResult, factualResult);
    }

}