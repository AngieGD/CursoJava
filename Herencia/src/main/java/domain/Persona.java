 
package domain;

/**
 *
 * @author Angie
 */
/**
 * 
 */
public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion ;
    
    public Persona(){
        
    }
   

    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * 
     * @param nombre
     * @param genero
     * @param edad
     * @param direccion 
     */
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
    
}
