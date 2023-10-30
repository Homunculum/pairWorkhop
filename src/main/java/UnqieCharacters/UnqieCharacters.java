package UnqieCharacters;

import java.util.Scanner;

public class UnqieCharacters {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir kelime girin: ");
            String metin = scanner.nextLine();
            scanner.close();

            if (hasAllUniqueCharacters(metin)) {
                System.out.println("Kelime tüm benzersiz karakterlere sahiptir.");
            } else {
                System.out.println("Kelime tüm benzersiz karakterlere sahip değildir.");
            }
        }

        static boolean hasAllUniqueCharacters(String str) {
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                    return false;
                }
            }
            return true;
        }
    }



