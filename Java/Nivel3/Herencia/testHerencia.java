package Java.Nivel3.Herencia;

public class testHerencia {

    public static void main(String[] args) {

        Persona persona = new Persona("Pepe", 40);
        Empleado empleado = new Empleado("Pedro", 45, 1500);

        persona.imprimir();
        System.out.println();
        empleado.imprimir();
        
    }
    
}
