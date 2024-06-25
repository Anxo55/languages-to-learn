package Java.Futbolistas;

import java.util.Scanner;

public class ColeccionFutbolistas {

    public static void main(String[] args) {

        final int N = 3;

        Futbolistas[] futbolistas = new Futbolistas[N]; 

        for(int i=0; i<N; i++) {
            futbolistas[i] = new Futbolistas();
        }

       futbolistas[0] = new Futbolistas(1, "Lionel", "Messi", "37", "Extremo derecho", "Inter Miami");
       futbolistas[1] = new Futbolistas(2, "Cristiano", "Ronaldo", "39", "Extremo Izquierdo", "All Nassr");
       futbolistas[2] = new Futbolistas(3, "Luis", "Suarez", "36", "Delantero Centro", "Inter Miami");
        
       int opcion;
       Scanner sc = new Scanner(System.in);
       String idIntroducio;
       String nombreIntroducido;
       String apellidoIntroducido;
       String edadIntroducida;
       String posicionIntroducida;
       String equipoIntroducido;

       do {
        
       System.out.println("COLECCION DE FUTBOLSITAS");
       System.out.println("1. Listado");
       System.out.println("2. Modificar");
       System.out.println("3. Elimiar Futbolsita");
       System.out.println("4. Salir");
       opcion = Integer.parseInt(sc.nextLine());

       switch (opcion) {
        case 1:
        System.out.println("\nLISTADO");
            for(Futbolistas f: futbolistas) {
                System.out.println(f);
            }
            break;

        case 2:
        System.out.println("\nMODIFICAR");
        
        System.out.println("Introducir el id del jugador que deseas modificar.");
        idIntroducio = sc. nextLine();
       
        default:
            
       }

    } while (opcion !=4);
        
    }
    
}
