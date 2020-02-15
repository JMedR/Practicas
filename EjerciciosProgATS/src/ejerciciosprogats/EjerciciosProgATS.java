/*Suma de 3 notas e imprimir resultado*/
package ejerciciosprogats;
import java.util.Scanner;
public class EjerciciosProgATS {

    public static void main(String[] args) {
    float nota1,nota2,nota3,suma;
    Scanner Entrada = new Scanner(System.in);
        System.out.print("Digite las tres calificaciones: ");
        nota1 = Entrada.nextFloat();
        nota2 = Entrada.nextFloat();
        nota3 = Entrada.nextFloat();//guardado de las notas
        suma=nota1+nota2+nota3;
        System.out.println("\nLa suma de las notas es: "+suma);
           
    }  
}
