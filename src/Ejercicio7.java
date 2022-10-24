import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner texto= new Scanner(System.in);

        System.out.println("Introduzca un texto");
        String t1= texto.nextLine();

        int length= t1.length();
        int resto= length%2;

        if (resto==0){
            System.out.println("El número de letras es par");
        }
        else{
            System.out.println("El número de letras es impar");
        }
    }
}
