import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int n1= calculo.nextInt();
        int resto= n1%2;

        if (resto==0){
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
    }
}
