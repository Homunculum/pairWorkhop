package characterCounts;

import java.util.Scanner;

public class characterCounts {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String metin = scanner.nextLine();
        scanner.close();

        // Küçük harflere dönüştürerek, büyük ve küçük harfleri eşit hale getiriyoruz
      metin = metin.toLowerCase();

        int[] karakterSayilari = new int[26]; // 26 ingilizce harfi bir dizi oluşturuyoruz

        // Her karakterin sayısını sayma
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i); // Stringin her bir karakteri tek tek alınır.
            if (Character.isLetter(karakter)) {
               int index = karakter - 'a'; // Karakterin alfabe içindeki konumunu hesaplıyoruz
                karakterSayilari[index]++;
            }
        }

        // Her karakterin sayısını ekrana yazdırma
        for (int i = 0; i < karakterSayilari.length; i++) {
            if (karakterSayilari[i] > 0) {
                char karakter = (char) (i + 'a');
                System.out.println(karakter + ": " + karakterSayilari[i]);
            }
        }
    }
   /*public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Bir string girin: ");
       String metin = scanner.nextLine();
       scanner.close();

       metin = metin.toLowerCase();

       int[] karakterSayilari = new int[29]; // Türkçe karakterlerin olduğu bir dizi oluşturuyoruz.

       for (int i = 0; i < metin.length(); i++) {
           char karakter = metin.charAt(i);
           if (isTurkishCharacter(karakter)) {
               int index = getTurkishCharacterIndex(karakter);
               karakterSayilari[index]++;
           }
       }

       char[] turkishAlphabet = {'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'};

       for (int i = 0; i < karakterSayilari.length; i++) {
           if (karakterSayilari[i] > 0) {
               System.out.println(turkishAlphabet[i] + ": " + karakterSayilari[i]);
           }
       }
   }
    // Verilen karakterin Türkçe bir karakter olup olmadığını kontrol eden metod
    public static boolean isTurkishCharacter(char c) {//c a-z arasında ya da türkçe harf ise
        return (c >= 'a' && c <= 'z') || c == 'ç' || c == 'ğ' || c == 'ı' || c == 'i' || c == 'ö' || c == 'ş' || c == 'ü';
    }
    // Verilen Türkçe karakterin dizideki indeksini döndüren metod.
    public static int getTurkishCharacterIndex(char c) {
        char[] turkishAlphabet = {'a', 'b', 'c', 'ç', 'd', 'e', 'f', 'g', 'ğ', 'h', 'ı', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'};
        for (int i = 0; i < turkishAlphabet.length; i++) {
            if (c == turkishAlphabet[i]) {
                return i;
            }
        }
        return -1; // Eğer karakter Türkçe bir karakter değilse -1 döndürür.
    }*/
}



