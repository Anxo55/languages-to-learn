package Java.Nivel2;

public class SumarElementosArray {

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;

        for(int i =0; i<numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println(suma);


    }
    
}
