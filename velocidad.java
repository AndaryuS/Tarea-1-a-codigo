import java.util.*;

public class velocidad {
    public static void main(String[] args) {
        double distancia;
        double tiempo;
        double velocidad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa calcula la velocidad");
        System.out.println("Ingres el tiempo en segundos"); 
        tiempo=entrada.nextInt();
        System.out.println("Ingrese la distancia en metros");
        distancia=entrada.nextInt();
        System.out.println("Opciones de respuseta 1.m/s 2.k/m");
        int seleccion=entrada.nextInt();
        velocidad=distancia/tiempo;
        if (seleccion==1) {
            System.out.println("La velocidad es: "+velocidad +" m/s");
        } else {
            velocidad=velocidad*3.6;
            System.out.println("la velocidad es : " + velocidad + " k/h");
        }
    }




















    
}
