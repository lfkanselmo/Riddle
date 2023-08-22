/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Krausser
 */
public class riddl2_01 {

    public static void main(String[] args) {
        long num = 10, num2 = 0;
        int n = 9;
        boolean found = true;

        

        do {
            if (num % n == 0) {
                num2 = num / n;
                if (transform(num2) == num) {
                    found = false;
                }

                System.out.println(num2);
            }

            num++;

        } while (found);

        System.out.println("Encontrado: " + num2);

    }

    //tranform number funtion
    public static long transform(long num) {

        long mod = num % 10;
        int cantiDig = digitCounter(num);
        num = Math.round(num / 10);

        long number = powInt(cantiDig);

        number = (number * mod) + num;

        return number;

    }

    //pow with integers
    public static int powInt(int cDig) {
        int number = 1;
        for (int i = 1; i < cDig; i++) {
            number *= 10;
        }
        return number;
    }

    //Digit counter funtion
    public static int digitCounter(long number) {

        long count = number;
        int cont = 0;
        while (count > 0) {
            count = Math.round(count / 10);
            cont++;
        }
        return cont;

    }
}
