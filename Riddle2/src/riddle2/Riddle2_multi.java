/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riddle2;

import java.math.BigInteger;

/**
 *
 * @author Krausser
 */
public class Riddle2_multi {
    public static void main(String[] args) {
        int n = 9, m = 1;
        int number = 9;
        BigInteger result = new BigInteger("0");
        int aux = 0;
        int decSave = 0;
        BigInteger digits = new BigInteger("1");
        BigInteger otherNum = new BigInteger("0");

        System.out.println(result);

        while (decSave != 0 || m < number) {
            aux = (number * n) + decSave;

            n = (aux % 10);

            decSave = (aux / 10);

            otherNum = digits.multiply(BigInteger.valueOf(n));

            digits = digits.multiply(BigInteger.valueOf(10));

            result = result.add(otherNum);

            m = n;
        }

        System.out.println();

        BigInteger originalNumber = new BigInteger("0");

        originalNumber = result.divide(BigInteger.valueOf(number));

        System.out.println("Original: " + originalNumber);

        System.out.println("Resultado de multiplicar el original por " + number + ": " + result);

    }
}
