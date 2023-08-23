package riddle2;

/*
 */
/**
 *
 * @author Krausser
 */
public class Riddle2_01 {

    public static void main(String[] args) {
        long numIni = 0;
        int n = 9;
        long numFin = 10 * n;
        boolean found = true;

        while (found) {
            numIni = numFin / n;
            if (numIni % 10 >= n && digitCounter(numFin) == digitCounter(numIni)) {
                if (transform(numIni) == numFin) {
                    found = false;
                    break;
                }
                System.out.println(numIni);
            }

            numFin += n;
        }

        System.out.println("Encontrado: " + numIni);
        System.out.println("El número encontrado * " + n + ": " + numFin);

    }

    //tranform number funtion
    public static long transform(long num) {

        long mod = num % 10;
        int cantiDig = digitCounter(num);
        num = num / 10;

        long number = powInt(cantiDig);

        number = (number * mod) + num;

        return number;

    }

    //pow with integers
    public static long powInt(int cDig) {
        long number = 1;
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
            count = count / 10;
            cont++;
        }
        return cont;

    }
}
