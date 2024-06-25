package Java.Nivel1;

import java.util.Scanner;

public class OperacionesBasicas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int numero2;

        System.out.println("Dame el primer numero: ");
        numero = sc.nextInt();

        System.out.println("Dame el segundo numero: ");
        numero2 = sc.nextInt();

        int suma = numero + numero2;
        int resta = numero - numero2;
        int multiplicacion = numero * numero2;
        int division = numero / numero2;

        System.out.println();

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

    }
    
}
