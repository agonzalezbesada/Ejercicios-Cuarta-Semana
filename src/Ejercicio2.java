import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);



        System.out.println("Introduzca un texto");
        String texto = letra.nextLine();
        System.out.println(texto.contains("b"));
    }
}
