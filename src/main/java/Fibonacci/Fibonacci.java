package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100;  // Kaçıncı Fibonacci sayısını alacağımız
        long[] fibonacci = new long[n];  // Fibonacci sayılarını saklamak için bir dizi oluşturuyoruz 
        //long[n] dizi içinde n kadar sayı olacağını belirtiyor
        //ilk iki değeri vermek zorunda kaldık
        fibonacci[0] = 0;  // İlk Fibonacci sayısı
        fibonacci[1] = 1;  // İkinci Fibonacci sayısı

        // Fibonacci sayısını oluşturuyoruz
        for (int i = 2; i < n; i++) {
            // Bir sonraki Fibonacci sayısını hesaplamak için bir önceki iki sayıyı topluyoruz
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // İlk 100 Fibonacci sayısını yazdırıyoruz
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
