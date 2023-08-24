/*

 */
package riddle2;

import java.math.BigInteger;

/**
 *
 * @author Krausser
 */
public class Riddle2 {

    public static void main(String[] args) {
        int n = 9, m = 1;
        BigInteger result = new BigInteger("0");
        int aux = 0;
        int decSave = 0;
        BigInteger digits = new BigInteger("1");
        BigInteger otherNum = new BigInteger("0");

        while (decSave != 0 || m != 9) {
            aux = (9 * n) + decSave;

            n = (aux % 10);

            decSave = (aux / 10);

            otherNum = digits.multiply(BigInteger.valueOf(n));

            digits = digits.multiply(BigInteger.valueOf(10));

            result = result.add(otherNum);

            m = n;
        }

        System.out.println();

        BigInteger originalNumber = new BigInteger("0");

        originalNumber = result.divide(BigInteger.valueOf(9));

        System.out.println("Original: " + originalNumber);

        System.out.println("resultado: " + result);

    }
}
