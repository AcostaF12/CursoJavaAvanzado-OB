import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException, FileNotFoundException {
        
        int resultadoDivision = dividirNumeroPor(3, 0);
        int[] numeros = new int[] {12, 34, 9, 120, 450, 91};

        System.out.println("El resultado de la division es: " + resultadoDivision);

        try {
            System.out.println(numeros[8]);    
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No es posible obtener el elemento, el Array solo cuenta con " + numeros.length + " elementos.");
        }

        try {
            File mifichero = new File ("C:/Users/feder/fichero.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int dividirNumeroPor(int dividendo, int divisor) throws ArithmeticException {

        int resultadoDivision = 0;

        try {
            resultadoDivision = dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Hay una excepcion aritmetica, no es posible dividir un numero por " + divisor);
        }

        return resultadoDivision;
    }


}

