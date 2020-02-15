package ejerciciosprogats;

import java.util.Scanner;

public class EjerciciosProgATS {

    public static void main(String[] args) {
    double base,esponente;
    Scanner EntradaDatos = new Scanner(System.in);
    System.out.print("Ingrese el nuemro base para la potencia: ");
    base = EntradaDatos.nextDouble();
    System.out.print("\nIngrese el esponente: ");
    esponente = EntradaDatos.nextDouble();
    double resultado = Math.pow(base,esponente);
    System.out.println("\n\nEl resultado es: " + resultado);
    }  
}
