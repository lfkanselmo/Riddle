/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package riddle2;

/**
 *
 * @author Krausser
 */
public class Riddle2 {

    public static void main(String[] args) {
        long num = 1, num2 = 0;
        int n = 9;
        boolean found = true;

        do {
            num2 = transform(num);

            if (num * n == num2) {
                found = false;
            } else {
                num++;
            }

        } while (found);

        System.out.println("Encontrado: " + num);

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

        System.out.println(number);
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
