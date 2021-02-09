import java.util.*;
public class mayoroMenor {
    public static void main(String[] args) {
        int numero1,numero2;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Este programa define cual de dos numeros es el mayor");
        System.out.println("Ingrese el priemr número");
        numero1=entrada.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2=entrada.nextInt();
        if (numero1>numero2) {
            System.out.println("El primer número es mayor que el segundo");
        }
        if (numero2>numero1){
            System.out.println("El segundo número es mayor que el primero");
        }
        if (numero1==numero2) {
            System.out.println("Los números son iguales");
        }
    }
}
