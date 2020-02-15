/*Guillermo tiene N dolares, Luis la mitad de Guillermo,Juan la mitad de Guillermo y Luis juntos--Calcule e Imprima la cantidad de todos*/
package ejerciciosprogats;
import java.util.Scanner;
public class EjerciciosProgATS {
    public static void main(String[] args) {
    Double Guillermo, Juan, Luis;
    Scanner Dinero = new Scanner(System.in);
        System.out.print("Cuanto dinero tiene Guillermo?: ");
        Guillermo = Dinero.nextDouble();
        Juan=Guillermo/2;
        Luis=(Guillermo+Juan)/2;
        System.out.println("\n\n\n\n\n\n\n\n\n\nGuillermo Tiene: "+Guillermo);
        System.out.println("Juan Tiene: "+Juan);
        System.out.println("Luis Tiene: "+Luis);
        System.out.println("\n\n\n\n\n\n\n\n");
    }  
}