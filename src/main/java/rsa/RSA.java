package rsa;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {

    private final static BigInteger one = new BigInteger("1");
    private final static SecureRandom random = new SecureRandom();

    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger nTotal;


    public RSA(int N) {

        BigInteger p = BigInteger.probablePrime(N / 2, random);
        BigInteger q = BigInteger.probablePrime(N / 2, random);


        BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));

        nTotal = p.multiply(q);

        publicKey = new BigInteger("65537"); // common value in practice = 2^16 + 1

        privateKey = publicKey.modInverse(phi);

    }

    public BigInteger encrypt(BigInteger message){
        return message.modPow(publicKey, nTotal);
    }

    public BigInteger deCrypt(BigInteger cipherText){
        return cipherText.modPow(privateKey, nTotal);
    }
}
