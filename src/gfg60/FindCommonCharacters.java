package gfg60;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public static void main(String[] args) {

        String[] inputs = {"bella", "label", "roller"};
        List<String> output = commonChars(inputs);
        System.out.println("Output: "+ output);

    }
        public static List<String> commonChars(String[] words) {

            int[] minFrequencies = new int[26];

            String firstWord = words[0];
            for(int i = 0; i < firstWord.length(); i++) {
                char c = firstWord.charAt(i);
                minFrequencies[c - 'a']++;
            }

            for(int i = 1; i < words.length; i++) {
                int[] currentFrequencies = new int[26];
                String currentWord = words[i];

                for(int j = 0; j < currentWord.length(); j++) {
                    char c = currentWord.charAt(j);
                    currentFrequencies[c - 'a']++;
                }

                for(int k = 0; k < 26; k++) {
                    if(minFrequencies[k] > currentFrequencies[k]) {
                        minFrequencies[k] = currentFrequencies[k];
                    }
                }
            }

            List<String> result = new ArrayList<>();
            for(int k = 0; k < 26; k++) {
                while(minFrequencies[k] > 0) {
                    char commonChar = (char) (k + 'a');
                    result.add(String.valueOf(commonChar));
                    minFrequencies[k]--;
                }
            }
            return result;
        }
    }


