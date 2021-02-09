import java.util.*;

public class numerosRomanos {

    public static void main(String[] args) {
        String a,b,c,d,e,f,g,h,i,j;
        a="I";
        b="II";
        c="III";
        d="IV";
        e="V";
        f="VI";
        g="VII";
        h="VIII";
        i="IX";
        j="X";

        System.out.println("Este programa le muestr en números romanos el número que ingrese");
        System.out.println("Ingrese un número del 1 al 10");
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        if (entrada==1) {
            System.out.println("El número que ingreso es el " + a);
        }
        if (entrada==2) {
            System.out.println("El número que ingreso es el " + b);
        }
        if (entrada==3) {
            System.out.println("El número que ingreso es el " + c);
        }
        if (entrada==4) {
            System.out.println("El número que ingreso es el " + d);
        }
        if (entrada==5) {
            System.out.println("El número que ingreso es el " + e);
        }
        if (entrada==6) {
            System.out.println("El número que ingreso es el " + f);
        }
        if (entrada==7) {
            System.out.println("El número que ingreso es el " + g);
        }
        if (entrada==8) {
            System.out.println("El número que ingreso es el " + h);
        }
        if (entrada==9) {
            System.out.println("El número que ingreso es el " + i);
        }
        if (entrada==10) {
            System.out.println("El número que ingreso es el " + j);
        }
    }
}