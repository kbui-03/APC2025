package Homework4;

import java.util.Scanner;

public class AnagramChecker {

    public static boolean isAnagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        int [] countA = countLetters(a);
        int [] countB = countLetters(b);
        for (int i = 0; i < 26; i++){
            if (countA[i] != countB[i]){
                return false;
            }
        }
        return true;
    }

    public static int [] countLetters(String s){
        int [] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z'){
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z'){
                count[c - 'A']++;
            }
        }
        return count;
    }

    public static void printLetterCounts(String s){
        int [] count = countLetters(s);
        for (int i = 0; i < 26; i++){
            if (count[i] > 0){
                System.out.println((char)(i + 'a') + ": " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
            // Get two strings from the user
            System.out.print("Enter the first string: ");
            String word1 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase
            System.out.print("Enter the second string: ");
            String word2 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase
            
            // Check if the strings are anagrams
             System.out.println("Are they anagrams? " + isAnagram(word1, word2));
            
            // Print letter counts for the first string
            System.out.println("Letter counts for the first string:");
            printLetterCounts(word1);
            }
    }
}
