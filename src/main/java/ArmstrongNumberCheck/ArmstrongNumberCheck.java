package oopWithNLayeredApp;

import java.util.Scanner;

public class ArmstrongNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {//aşağıdaki number doğru ise if değilse else çalışır ve number'ı verir
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
    }

    // Armstrong sayısı kontrolü için bir fonksiyon
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        // Sayının basamak sayısını bulma
        for (originalNumber = number; originalNumber != 0; originalNumber /= 10) {
            ++n;// sayıyı tekrar tekrar 10'a bölüp basamak sayısını buluyor n: basamak sayısı
        }

        originalNumber = number;

        // Armstrong sayısı olup olmadığını kontrol etme
        while (originalNumber != 0) {
            remainder = originalNumber % 10; // verdiğimiz sayının 10 a bölümünden kalanı hesaplıyor remainder: kalan
            result += Math.pow(remainder, n); // kalan sayıyı basamak sayısıyla çarpar
            originalNumber /= 10; // sayıyı 10 a bölüp int olduğundan sadece tam kısmı alıp tekrar işleme sokuyor
        }

        return result == number;
    }
}
