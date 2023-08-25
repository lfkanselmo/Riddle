/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riddle2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Krausser
 */
public class Riddle2_multi {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        boolean pass = false;

        //input number, not 1
        do {
            System.out.println("Please write number to multiply and find the "
                    + "smallest natural multiple: ");
            System.out.println("Just numbers between 1 - 9");
            n = read.nextInt();

            if (n >= 1 && n <= 9) {
                pass = true;
            }
        } while (pass == false);

        if (n == 1) {
            System.out.println("Original number: " + 11);
            System.out.println(n + " * original number" + ": " + 11);
        } else {
            //Call search function 
            search(n);
        }

    }

    //Search the numbers
    public static void search(int n) {
        int itera = 2;
        boolean founded = false;
        ArrayList<BigInteger> numbersFound = new ArrayList<BigInteger>();
        BigInteger numOriginPro = new BigInteger("0");
        BigInteger numEvalua = new BigInteger("0");
        BigInteger originalNumber = new BigInteger("0");
        BigInteger option = new BigInteger("0");

        while (itera <= 9) {
            numEvalua = found(n, itera);

            originalNumber = numEvalua.divide(BigInteger.valueOf(n));

            //how many digits have the numbers to compare
            int digitsOriginal = numEvalua.toString().length();
            int digitsNumEvalua = originalNumber.toString().length();

            //compare and add the original numbers to array
            if (numEvalua.equals(originalNumber.multiply(BigInteger.valueOf(n)))
                    && digitsNumEvalua == digitsOriginal) {
                numbersFound.add(originalNumber);
                founded = true;
            }

            itera++;

        }

        //Validation if some number was found. Search for the smallest and print
        if (!founded) {
            System.out.println("No found, no exist");
        } else {
            option = numbersFound.get(0);
            for (int i = 1; i < numbersFound.size(); i++) {
                if (option.compareTo(numbersFound.get(i)) == 1) {
                    option = numbersFound.get(i);
                }
            }

            System.out.println("Original number: " + option);
            numOriginPro = option.multiply(BigInteger.valueOf(n));
            System.out.println(n + " * original number" + ": " + numOriginPro);
        }

    }

    //function for found the number
    public static BigInteger found(int numb, int itera) {
        int n = itera, m = 1;
        int number = numb;
        BigInteger result = new BigInteger("0");
        int aux = 0;
        int decSave = 0;
        BigInteger digits = new BigInteger("1");
        BigInteger otherNum = new BigInteger("0");

        //Build number
        while (decSave != 0 || m != itera) {
            aux = (number * n) + decSave;

            n = (aux % 10);

            decSave = (aux / 10);

            otherNum = digits.multiply(BigInteger.valueOf(n));

            digits = digits.multiply(BigInteger.valueOf(10));

            result = result.add(otherNum);

            m = n;

        }

        return result;
    }
}
