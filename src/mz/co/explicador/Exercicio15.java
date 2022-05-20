
package mz.co.explicador;

/**
 *
 * @author joseseie
 */
public class Exercicio15 {
    
    public static void main(String[] args) {
        
        int minInt = 100;
        int maxInt = 10000;
        
        for (int i = minInt; i < maxInt; i++) {
            
            // Verificar se o numero é multiplo de 5
            int restoDiv5 = i % 5;
            
            // Verificar se o número é multiplo de 3
            int restoDiv3 = i % 3;
           
            if (restoDiv5 == 0 && restoDiv3 != 0) {
                
                System.out.println("Nr. Multiplo de 5 e não multiplo de 3: " + i);
                
            }
            
            
            
        }
       
        
    }
    
}
