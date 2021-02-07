import java.util.*;
public class rectangulo {
    public static void main(String[] args) {
        int base,altura,area,perimetro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Este programa calcula el area y el perimetro de un rectangulo");
        System.out.println("Ingrese la base del rectangulo");
        base=entrada.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura=entrada.nextInt();
        area=base*altura;
        perimetro=2*(base+altura);
        System.out.println("El area del rectangulo es : " + area);
        System.out.println("El perimetro del rectangulo es : "+ perimetro);
    }    
}
