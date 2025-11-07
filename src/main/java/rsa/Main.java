package rsa;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("======== xx ===============");

        int N = Integer.parseInt(args[0]);

        RSA rsa = new RSA(N);

        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter the message ");
        System.out.println();

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        BigInteger message = new BigInteger(br.readLine());

        BigInteger encrypt = rsa.encrypt(message);
        BigInteger decrypt = rsa.deCrypt(encrypt);

        System.out.println("message = " + message);
        System.out.println("enCrpyted = " + encrypt);
        System.out.println("decrypted = " + decrypt);
    }
}
