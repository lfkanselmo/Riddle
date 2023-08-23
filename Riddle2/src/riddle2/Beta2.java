/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riddle2;

/**
 *
 * @author Krausser
 */
public class Beta2 {

    public static void main(String[] args) {
        int n = 9, m = 1;
        long result = 9;
        int aux = 0;
        int decSave = 0;
        long digits = 1;

        while (decSave != 0 || m != 9) {
            aux = (9 * n) + decSave;

            n = (aux % 10);

            decSave = (aux / 10);
            

            digits = digits * 10;

            result += digits * n;

            System.out.println("resultado: " + result);
            
            m = n;
            
            System.out.println();
            System.out.println();
        }

    }
}
