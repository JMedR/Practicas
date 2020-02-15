/*1000 mensuales a trabajador, 150 comision por carro + 5% del valor de carro*/
package ejerciciosprogats;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EjerciciosProgATS {
    public static void main(String[] args) {
        int numero, dato=5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Diguite un numero: "));
        
        if(numero!=dato){
            JOptionPane.showMessageDialog(null, "EL numero es diferente de 5");
        }
        else{
            JOptionPane.showMessageDialog(null,"EL numero es 5");
        }
 
    }  
}