import java.util.*;


public class promedio {
    public static void main(String[] args) {
        int nota0,nota1,nota2,nota3,nota4;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa calcula el promedio de 5 notas que ingrese");
        System.out.println("Ingrese 5 notas");         
        nota0=entrada.nextInt();
        nota1=entrada.nextInt();
        nota2=entrada.nextInt();
        nota3=entrada.nextInt();
        nota4=entrada.nextInt();
        double promedio = (nota0+nota1+nota2+nota3+nota4)/5;        
        System.out.println("El promedio de las notas es : " + promedio);
    }
}
