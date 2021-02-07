import java.util.*;
public class productos {
    public static void main(String[] args) {
        double cuenta=0;
        double total;
        int seleccion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a su canaste de compras");
        System.out.println("Si realiza una comrpa de 500 se le aplica un descuento \n del 10%, si realiza una compra mayor se le aplicar un descuento de 15% ");
        do {
            System.out.println("Su cuenta actual es : "+ cuenta);
            System.out.println("1.Pagar cuenta 2.Seguir comprando");  
            seleccion = entrada.nextInt();
            if (seleccion==2) {
                System.out.print("Ingrese el precio: ");
                int precio = entrada.nextInt();
                cuenta=cuenta+precio;
            }
        } while (seleccion==2);
        if (seleccion==1) {
            if (cuenta<500) {
                total=cuenta-(cuenta*0.10);
                System.out.println("Su total a pagar es : " + total);
            } else {
                total=cuenta-(cuenta*0.15);
                System.out.println("Su total a pagar es : " + total);
            }
        }        
    }    
}
