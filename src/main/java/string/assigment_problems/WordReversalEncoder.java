package string.assigment_problems;

public class WordReversalEncoder {

    public static void reverseWords(String sentence) {

        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) {

        String sentence = "Java is very easy";

        reverseWords(sentence);
    }
}