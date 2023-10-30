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
            char karakter = metin.charAt(i); // Metin her bir karakteri tek tek alınır.
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

}



