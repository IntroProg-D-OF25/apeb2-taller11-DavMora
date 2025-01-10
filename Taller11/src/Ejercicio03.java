

import java.util.Scanner;

public class Ejercicio03 {

    public static int calcularPromedioCualitativo(double p1, double p2, double p3, double p4) {
        double promedio = (p1 + p2 + p3 + p4) / 4;
        
        if (promedio >= 0 && promedio <= 5) {
            return 1; // Regular
        } else if (promedio > 5 && promedio <= 8) {
            return 2; // Bueno
        } else if (promedio > 8 && promedio <= 9) {
            return 3; // Muy Bueno
        } else if (promedio > 9 && promedio <= 10) {
            return 4; // Sobresaliente
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor (decimal): ");
        double p1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo valor (decimal): ");
        double p2 = scanner.nextDouble();
        
        System.out.print("Ingrese el tercer valor (decimal): ");
        double p3 = scanner.nextDouble();
        
        System.out.print("Ingrese el cuarto valor (decimal): ");
        double p4 = scanner.nextDouble();
        
        int resultado = calcularPromedioCualitativo(p1, p2, p3, p4);
        
        if (resultado == 1) {
            System.out.println("El promedio cualitativo es: Regular");
        } else if (resultado == 2) {
            System.out.println("El promedio cualitativo es: Bueno");
        } else if (resultado == 3) {
            System.out.println("El promedio cualitativo es: Muy Bueno");
        } else if (resultado == 4) {
            System.out.println("El promedio cualitativo es: Sobresaliente");
        } else {
            System.out.println("Valor fuera de rango");
        }
        
        scanner.close();
    }
}
