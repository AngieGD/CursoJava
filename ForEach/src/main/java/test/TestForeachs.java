package test;
import domain.Persona;
/**
 *
 * @author Angie
 */
public class TestForeachs {

    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 4, 7, 4};
        for (int edad : edades) {
            System.out.println("La edad: " + edad);
        }
        Persona personas[] = {new Persona("Juan") , new Persona("Carla") , new Persona("Angie")};
        
        for (Persona persona:personas){
            System.out.println("Nombre: " + persona);
        }
               
    }
}
