/*imprima el salario semanal de un empleado a partir de horas trabajadas en la semaqna y salario por hora*/
package ejerciciosprogats;
import java.util.Scanner;
public class EjerciciosProgATS {
    public static void main(String[] args) {
    int HorasTrabajadas;
    float ValorHora,Pago;
    Scanner Datos = new Scanner(System.in);
        System.out.print("Ingrese el numero de horas trabajadas esta semana: ");
        HorasTrabajadas = Datos.nextInt();
        System.out.print("\nIngrese el pago de cadad hora de trabajo: ");
        ValorHora =  Datos.nextFloat();
        Pago=HorasTrabajadas*ValorHora;
        System.out.print("\nLa cantidad a pagar es: "+Pago);
    }  
}
