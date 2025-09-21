package org.example;

import java.util.Scanner;

public class CeaserCipher {

    private String plainText;
    private int key;

    public CeaserCipher() {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Your Message: ");

        this.plainText = scanner.next();

        System.out.printf("Enter Key: ");
        this.key = scanner.nextInt();

        String encryptedMessage = encrypt(plainText, key);

        System.out.printf("Your encrypted Message: " + " " + encryptedMessage);
        System.out.printf(" Your decrypted Message: " + "  " + encrypt(encryptedMessage, -key));

    }
    public static String encrypt(String text, int key) {
        char[] messageChars = text.toCharArray();

        for (int i = 0; i < messageChars.length; i++) {
            messageChars[i] = (char) (messageChars[i] + key);
        }


        return new String(messageChars);
    }
}
