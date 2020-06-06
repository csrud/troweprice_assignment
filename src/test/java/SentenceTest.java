import org.junit.Assert;
import org.junit.Test;

public class SentenceTest {

    @Test
    public void getLongestWordForEmptySentence() {
        String s = "";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "Empty Sentence");
    }

    @Test
    public void getLongestWordForRegularSentence() {
        String s = "The cow jumped over the moon.";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "jumped, 6");
    }

    @Test
    public void getLongestWordForSentenceWithMoreSpaces() {
        String s = "The cow jumped   over   the moon.";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "jumped, 6");
    }

    @Test
    public void getLongestWordForSentenceWithSpecialCharacters() {
        String s = "The cow@#^*+=~`{}<> jumped over$ the moon.";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "jumped, 6");
    }

    @Test
    public void getLongestWordForSentenceWithNumbers() {
        String s = "The largest nine digit number is 999999999";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "largest, 7");
    }

    @Test
    public void getLongestWordForSentenceWithDollarAmount() {
        String s = "Jane has $1000 with her.";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "Jane, 4");
    }

    @Test
    public void getLongestWordForOneWordSentence() {
        String s = "Thecowjumpedoverthemoon.";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "Thecowjumpedoverthemoon, 23");
    }

    @Test
    public void getLongestWordForSentenceHavingWordsWithSameLength() {
        String s = "Very good";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "Very, 4");
    }

    @Test
    public void getLongestWordForSentenceHavingOnlySpecialCharacters() {
        String s = "@#$%^&*+{}_|\\/";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "Invalid Sentence");
    }

    @Test
    public void getLongestWordForSentenceHavingOnlyNumbers() {
        String s = "012345678903246387683";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "Invalid Sentence");
    }

    @Test
    public void getLongestWordForSentenceHavingApostrophe() {
        String s = "Isn't it fun to play";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "Isn't, 5");
    }

    @Test
    public void getLongestWordForSentenceHavingHyphen() {
        String s = "Sam is thirty-two years old.";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "thirty-two, 10");
    }

    @Test
    public void getLongestWordForSentenceHavingLongestWordAtEndWithPunctuation() {
        String s = "Can you sing with Jane?";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "sing, 4");
    }

    @Test
    public void getLongestWordForSentenceWithAPhrase() {
        String s = "I like your brother; he's a good friend.";
        Assert.assertEquals(Sentence.getLongestWordAndLength(s), "brother, 7");
    }

    @Test
    public void getShortestWordForEmptySentence() {
        String s = "";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "Empty Sentence");
    }

    @Test
    public void getShortestWordForRegularSentence() {
        String s = "The cow jumped over the moon.";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "The, 3");
    }

    @Test
    public void getShortestWordForSentenceWithMoreSpaces() {
        String s = "The cow jumped   over   the moon.";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "The, 3");
    }

    @Test
    public void getShortestWordForSentenceWithSpecialCharacters() {
        String s = "The cow@#^*+=~`{}<> jumped over$ the moon.";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "The, 3");
    }

    @Test
    public void getShortestWordForSentenceWithNumbers() {
        String s = "The largest one digit number is 9";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "is, 2");
    }

    @Test
    public void getShortestWordForSentenceWithDollarAmount() {
        String s = "Joe only has $1 with him to spend.";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "to, 2");
    }

    @Test
    public void getShortestWordForOneWordSentence() {
        String s = "Thecowjumpedoverthemoon.";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "Thecowjumpedoverthemoon, 23");
    }

    @Test
    public void getShortestWordForSentenceHavingWordsWithSameLength() {
        String s = "Very good";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "Very, 4");
    }

    @Test
    public void getShortestWordForSentenceHavingOnlySpecialCharacters() {
        String s = "@#$%^&*+{}_|\\/";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "Invalid Sentence");
    }

    @Test
    public void getShortestWordForSentenceHavingOnlyNumbers() {
        String s = "012345678903246387683";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "Invalid Sentence");
    }

    @Test
    public void getShortestWordForSentenceHavingApostrophe() {
        String s = "Let's party today!";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "Let's, 5");
    }

    @Test
    public void getShortestWordForSentenceHavingHyphen() {
        String s = "up-to-date";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "up-to-date, 10");
    }

    @Test
    public void getShortestWordForSentenceHavingShortestWordAtEndWithPunctuation() {
        String s = "Harry said. Can I?";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "I, 1");
    }

    @Test
    public void getShortestWordForSentenceWithAPhrase() {
        String s = "I like your brother; he's a good friend.";
        Assert.assertEquals(Sentence.getShortestWordAndLength(s), "I, 1");
    }
}
