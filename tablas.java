import java.util.*;
public class tablas {
    public static void main(String[] args) {
        int numero,resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa muestra la tabla de multiplicar del número ingresado");
        System.out.println("Ingrese un numero");
        numero=entrada.nextInt();
        for (int i = 1; i < 11; i++) {
            resultado=numero*i;
            System.out.println(numero+"*"+i+"="+resultado);
        }
    }    
}
