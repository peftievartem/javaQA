package hw7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw7 {

    public static void main(String[] args) {
        String sentence = "Enter sentence of five words";
        int longest = 0;
        String longestWord = "";

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() > longest){
                longest = word.length();
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
        System.out.println("Longest word size: " + longest);
        System.out.println("Second word from end:" + words[words.length - 2]);

        String sentence2 = "Enter    sentence     of   five      words";
        System.out.println("Sentence2 without : " + sentence2.replaceAll("\\s+"," "));

        String priceSentence = "First price: $234.43. Second Price: $98.99";
        for (String price : getPricesList(priceSentence)) {
            System.out.println("Price: " + price);
        }

    }

    public static List<String> getPricesList(String sentence){
        String pattern = "\\$\\d+\\.\\d\\d";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);

        List<String> result = new ArrayList();
        while (m.find()) {
            result.add(sentence.substring(m.start(),m.end()));
        }
        return result;
    }

}
