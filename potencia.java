import java.util.*;
public class potencia {
    public static void main(String[] args) {
        int potencia, numero;
        int resultado=1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa calcula un numero elevado a una potencia");
        System.out.println("Ingrese el numero");
        numero=entrada.nextInt();
        System.out.println("Ingrese la potencia");
        potencia=entrada.nextInt();
        for (int i = 1; i < potencia ; i++) {
           resultado=resultado*numero; 
        }
        System.out.println("El resultado es : " + resultado);
    }    
}
