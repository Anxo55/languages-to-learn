package Java.PracticaBasica;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[10];

        for(int i = 0; i <=numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
            // numeros[i] = (int)(Math.random()*100);
            // System.out.println(numeros[i]);
        }

        

        int cuentaPositivo = 0;
        int cuentaNegativo = 0;
        int cuentaCero = 0;

        for(int i = 0; i<numeros.length; i++) {
            if (numeros[i] > 0) {
                cuentaPositivo++;
            }else if(numeros[i] < 0) {
                cuentaNegativo++;
            }else{
                cuentaCero++;
            }
        }

        System.out.println("El total de numeros positivos es: "+cuentaPositivo);
        System.out.println("El numero total de numeros negativos es: "+cuentaNegativo);
        System.out.println("El numero total de ceros es: "+cuentaCero);
        
    }
    
}
