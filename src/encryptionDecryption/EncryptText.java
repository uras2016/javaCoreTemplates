package encryptionDecryption;

import java.util.Scanner;

public class EncryptText {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Текст, который нужно зашифровать: ");
        String enc = sc.nextLine();
        System.out.print("Текст, который нужно расшифровать: ");
        String dec = sc.nextLine();
        System.out.println("---Результаты---");
        System.out.println(caesar(enc, false));
        System.out.println(caesar(dec, true));
    }
    public static String caesar(String message, boolean decrypt){
        String vystup = "";

        if (decrypt = true)
            for (int i = 0; i < message.length(); i++){
                char c = message.charAt(i);
                if      (c >= 'd' && c <= 'z') c -= 3;
                else if (c >= 'D' && c <= 'Z') c -= 3;
                else if (c >= 'a' && c <= 'c') c += 23;
                else if (c >= 'A' && c <= 'C') c += 23;
                vystup += c;
            }
        else if (decrypt = false)
            for (int i = 0; i < message.length(); i++){
                char c = message.charAt(i);
                if      (c >= 'x' && c <= 'z') c -= 23;
                else if (c >= 'X' && c <= 'Z') c -= 23;
                else if (c >= 'a' && c <= 'w') c += 3;
                else if (c >= 'A' && c <= 'W') c += 3;
                vystup += c;
            }
        return vystup;
    }
}


