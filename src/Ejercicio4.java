import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner figura= new Scanner(System.in);


        String triangulo;
        String rectangulo;
        String pentagono;
        String hexagono;

        System.out.println("Elija una figura"+"\nTriángulo"+"\nRectángulo"+"\nPentágono"+"\nHexágono"+"\n"+"\nElección:");
        String eleccion= figura.nextLine();

        if (eleccion.contains("Triángulo")){
            System.out.println("Cuál es la base del Triángulo?");
            double b_t= figura.nextDouble();
            System.out.println("Cuál es la altura del Triángulo?");
            double h_t= figura.nextDouble();
            double a_t= b_t * h_t / 2;
            System.out.println("El área del Triángulo es "+a_t);
        }else if (eleccion.contains("Rectángulo")){
            System.out.println("Cuál es la base del Rectángulo?");
            double b_r= figura.nextDouble();
            System.out.println("Cuál es la altura del Rectángulo?");
            double h_r= figura.nextDouble();
            double a_r= b_r * h_r;
            System.out.println("El área del rectángulo es "+a_r);
        }else if (eleccion.contains("Pentágono")){
            System.out.println("Cuál es el lado del Pentágono?");
            double l_p= figura.nextDouble();
            double p_p= l_p * 5;
            System.out.println(p_p);
            System.out.println("Cuál es el apotema del pentágono?");
            double ap_p= figura.nextDouble();
            double a_p= p_p * ap_p /2;
            System.out.println("El área del Pentágono es: "+ a_p);
        }else if (eleccion.contains("Hexágono")){
            System.out.println("Cuál es el lado del Hexágono?");
            double l_hex= figura.nextDouble();
            double p_hex= l_hex * 6;
            System.out.println("Cuál es apotema del Hexágono?");
            double ap_hex= figura.nextDouble();
            double are_hex = p_hex * ap_hex /2;
            System.out.println("El área del Heágono es: "+are_hex);
        }else {
            System.out.println("No coincide con nunguna figura, revise la ortografía");
        }
    }
}
