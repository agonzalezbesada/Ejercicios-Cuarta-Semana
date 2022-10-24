import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);

        System.out.println("Introduzca una frase");
        String frase = letras.nextLine();

        if (frase.contains("b")){
            System.out.println("Contiene b");
            if (frase.contains("p")){
                System.out.println("Contiene p");
                if (frase.contains("v")){
                    System.out.println("Contiene v");
                    if (frase.contains("u")){
                        System.out.println("Contiene u");
                    }
                }
            }
        } else if (frase.contains("v")) {
            System.out.println("Contiene v");
            if (frase.contains("u")){
                System.out.println("Contiene u");
                if (frase.contains("b")){
                    System.out.println("Contiene b");
                    if (frase.contains("p")){
                        System.out.println("Contiene p");
                    }
                }
            }
            
        }

    }
}