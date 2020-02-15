/*1000 mensuales a trabajador, 150 comision por carro + 5% del valor de carro*/
package ejerciciosprogats;
import java.util.Scanner;
public class EjerciciosProgATS {
    public static void main(String[] args) {
    int Carros,b;
    float Pago=1000,Vcarro;
        System.out.print("Cuantos carros vendió en el mes? ");
        Scanner Entrada = new Scanner(System.in);
        Carros = Entrada.nextInt();
        for(int a=0;a<Carros;a++){
        b=a+1;
        System.out.print("Ingrese el valor del carro "+b);
        System.out.print(" : ");
        Vcarro= Entrada.nextFloat();
        Pago+=(Vcarro*0.05)+150;
    }
        System.out.print("\n\n\n\n\n\n\n\nEl ago final es de: "+Pago);
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
    }  
}