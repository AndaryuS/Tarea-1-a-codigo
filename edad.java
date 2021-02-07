import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa determina la categoria en que se encuentra segun su edad");
        System.out.println("Ingrese su edad");
        edad=entrada.nextInt();
        if (edad<=15) {
            System.out.println("Es un infante");
        } 
        if (edad>15&&edad<=20) {
            System.out.println("Es un adolecente");
        }
        if (edad>20&&edad<=55) {
            System.out.println("Es un adulto");
        }
        if (edad>55) {
            System.out.println("Es un adulto mayor");
        }
    }
}
