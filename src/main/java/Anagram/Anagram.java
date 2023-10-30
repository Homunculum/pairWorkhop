package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    // İki kelimenin anagram olup olmadığını kontrol eden metot
    public static boolean areAnagrams(String word1, String word2) {
        // Küçük/küçük harf farkını ortadan kaldırmak için giriş kelimeleri küçük harfe dönüştürülüyor
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        // Her kelimenin harfleri ayrılıyor
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        // Harfleri alfabetik sıraya göre sıralama
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);
        // Sıralanmış harflerin eşitliğini kontrol ederek anagram olup olmadığını belirleme
        return Arrays.equals(word1Array, word2Array);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk kelimeyi girin: ");
        String word1 = scanner.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        String word2 = scanner.nextLine();

        scanner.close();
        // İki kelimenin anagram olup olmadığını kontrol etme
        boolean result = areAnagrams(word1, word2);

        System.out.println("Kelime 1: " + word1);
        System.out.println("Kelime 2: " + word2);

        if (result) {
            System.out.println(word1+ " ve "+ word2+ " birbirinin anagramıdır.");
        } else {
            System.out.println(word1+ " ve "+ word2+" birbirinin anagramı değildir.");
        }
    }
}
