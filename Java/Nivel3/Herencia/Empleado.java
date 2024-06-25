package Java.Nivel3.Herencia;

public class Empleado extends Persona{

    private int salario;

    public Empleado(String nombre, int edad, int salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void imprimir() {
        System.out.println("Informacion de Empleado");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Salario: "+this.getSalario());
    }
    
}
