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
public class Test1 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("10112359550561797752808988764044943820224719");
        
        BigInteger result = new BigInteger("0");
        
        result = num.multiply(BigInteger.valueOf(9));
        System.out.println("Numero original: ");
        System.out.println(num);
        System.out.println("Resultado: ");
        System.out.println(result);
    }
}
