package p2024_07_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Babbling1 {
    static void generateCombinations(String[] words, String current, List<String> result) {
        if (!current.isEmpty()) {
            result.add(current);
        }

        for (int i = 0; i < words.length; i++) {
            String[] remainingWords = new String[words.length - 1];
            int k = 0;
            for (int j = 0; j < words.length; j++) {
                if (j != i) {
                    remainingWords[k++] = words[j];
                }
            }
            generateCombinations(remainingWords, current + words[i], result);
        }
    }
    static int solution(String[] babbling) {
        String[] speak = {"aya", "ye", "woo", "ma"};
        List<String> allCombinations = new ArrayList<>();
        generateCombinations(speak, "", allCombinations);

        int sum = 0;
        for(int i=0; i< allCombinations.size(); i++){
            for(int j=0; j< babbling.length; j++){
                if(allCombinations.get(i).equals(babbling[j])) sum +=1;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        String[] arr1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] arr2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(arr2));



    }

}
