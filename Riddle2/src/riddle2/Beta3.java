/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riddle2;

/**
 *
 * @author Krausser
 */
public class Beta3 {

    public static void main(String[] args) {
        int num = 1;

        while (true) {
            System.out.println(num);
            int rotated = rotateNumber(num);
            if (rotated == num * 9) {
                System.out.println("El número es: " + num);
                break;
            }
            num++;
        }
    }

    public static int rotateNumber(int n) {
        String numStr = Integer.toString(n);
        int len = numStr.length();
        char lastDigit = numStr.charAt(len - 1);
        String rotatedStr = lastDigit + numStr.substring(0, len - 1);
        return Integer.parseInt(rotatedStr);
    }

}
