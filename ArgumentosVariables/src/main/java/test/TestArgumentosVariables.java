
package test;

/**
 *
 * @author Angie
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirnumeros(5,8,6,4,7);
    }
    
    private static void imprimirnumeros(int... numeros){
        for(int i = 0 ; i < numeros.length ; i++){
            System.out.println("Elemento " + i + ": " + numeros[i]);
            
        }
         
    }
    
}
