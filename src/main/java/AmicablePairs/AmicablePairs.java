package AmicablePairs;

import java.util.HashSet;
import java.util.Scanner;

public class AmicablePairs {

    public static void main(String[] args) {
        // İlk ve ikinci sayıları saklamak için değişkenler tanımlanıyor.
        int ilkSayi, ikinciSayi;
        int sayac = 0;

        for (int sayi1 = 1; sayac < 2; sayi1++) {
            int sayi2 = bolenlerinToplami(sayi1);

            // İki sayı dost sayı mı diye kontrol ediliyor.
            if (sayi1 != sayi2 && sayi2 != 0 && sayi1 == bolenlerinToplami(sayi2) && sayi1<sayi2) {
                sayac++;

                if (sayac == 1) {
                    ilkSayi = sayi1;
                    ikinciSayi = sayi2;
                    System.out.println("1-> " + ilkSayi + "-" + ikinciSayi);
                } else if (sayac == 2) {
                    ilkSayi = sayi1;
                    ikinciSayi = sayi2;
                    System.out.println("2: " + ilkSayi + "-" + ikinciSayi);
                }
            }
        }
    }
    // Toplamı saklamak için bir değişken oluşturuluyor.
    public static int bolenlerinToplami(int sayi) {
        int toplam = 0;
        // 1'den sayının yarısına kadar olan tüm sayılara bölünüp bölünmediği kontrol ediliyor.
        for (int i = 1; i <= sayi / 2; i++) {
            // Eğer sayı, i'ye tam bölünüyorsa, i sayıya bir bölen olarak ekleniyor.
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        // Toplam değeri döndürülüyor.
        return toplam;
    }
}


