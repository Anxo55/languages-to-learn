package Java.Nivel2;

import java.util.Scanner;

public class BuscarElementoArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int numeroABuscar;
        boolean encontrado = false;

        System.out.println("Dame el numero a buscar en el Array: ");
        numeroABuscar = sc.nextInt();

        for(int i = 0; i<numeros.length; i++) {
            if(numeros[i] == numeroABuscar) {
                System.out.println("El numero esta en la lista");
                encontrado=true;
                break;
            }
        }

        if(!encontrado) {
            System.out.println("El numero no se encuentra dentro de la lista.");
        }

    }
    
}
