import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner producto= new Scanner(System.in);

         int leche= 1;
         int cacao=2;
         int avellanas=3;

        System.out.println("Elija un producto"+"\n"+"\nLeche"+"\nCacao"+"\nAvellanas"+"\n"+"\nElección:");
        String eleccion= producto.nextLine();

        if (eleccion.contains("Leche")){
            System.out.println(leche+"€");
        }else if (eleccion.contains("Cacao")){
            System.out.println(cacao+"€");
        }else if (eleccion.contains("Avellanas")){
            System.out.println(avellanas+"€");
        }else{
            System.out.println("No es un producto registrado");
        }






    }
}
