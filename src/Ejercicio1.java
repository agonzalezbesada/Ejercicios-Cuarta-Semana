import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int n1;

        System.out.println("Introduzca un número");
        n1= numero.nextInt();


        if (n1 < 10){
            System.out.println("Es menor que 10");
        }
        else{
            System.out.println("El número es mayor que 10");
        }
    }
}
