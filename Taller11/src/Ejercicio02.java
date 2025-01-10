
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("QUE DESEA CALCULAR");
        System.out.println("(1) area del cuadrado");
        System.out.println("(2) area del triangulo");
        System.out.println("(3) area del rectangulo");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.print("Ingresa el lado : ");
                double lado = teclado.nextDouble();
                System.out.println("El area es: " + obtenerAreaCuadrado(lado));
                break;
            case 2:
                System.out.print("Ingresa la base : ");
                double baseTriangulo = teclado.nextDouble();
                System.out.print("Ingresa la altura: ");
                double alturaTriangulo = teclado.nextDouble();
                System.out.println("El área del triángulo es: " + obtenerAreaTriangulo(baseTriangulo, alturaTriangulo));
                break;
            case 3:
                System.out.print("Ingresa la base: ");
                double baseRectangulo = teclado.nextDouble();
                System.out.print("Ingresa la altura: ");
                double alturaRectangulo = teclado.nextDouble();
                System.out.println("El área del rectángulo es: " + obtenerAreaRectangulo(baseRectangulo, alturaRectangulo));
                break;
        }
    }
    public static double obtenerAreaCuadrado(double lado) {
        return lado * lado;
    }
    public static double obtenerAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public static double obtenerAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
