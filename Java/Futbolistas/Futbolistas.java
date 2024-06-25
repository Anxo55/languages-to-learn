package Java.Futbolistas;

public class Futbolistas {

    private int id;
    private String nombre;
    private String apellido;
    private String edad;
    private String posicion;
    private String equipo;
    
    public Futbolistas() {
        
    }
    
    public Futbolistas(int id, String nombre, String apellido, String edad, String posicion, String equipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    
    public String toString() {
       
        String cadena = "\n------------------------------------------";
      cadena += "\nId: " + this.id;
      cadena += "\nNombre: " + this.nombre;
      cadena += "\nApellido: " + this.apellido;
      cadena += "\nEdad: " + this.edad;
      cadena += "\nPosicion: " + this.posicion;
      cadena += "\nEquipo: " + this.equipo;
      cadena += "\n------------------------------------------";

      return cadena;
    }
}
