import java.util.*;
public class paroimpar {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa determina si el número ingresado es par o impar");
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        if (numero%2==0) {
            System.out.println("el número es par");
        } else {
            System.out.println("el número es impar");
        }
    }    
}
