
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tamano de la matriz cuadrada: ");
        int tamano = teclado.nextInt();

        int[][] matriz = new int[tamano][tamano];

        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print("Ingrese un valor: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        int suma = sumarMatriz(matriz);
        int resta = restarMatriz(matriz);
        int multiplicacion = multiplicarMatriz(matriz);

        System.out.println("Resultados:");
        System.out.println("Suma : " + suma);
        System.out.println("Resta : " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
    }

    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static int restarMatriz(int[][] matriz) {
        int resta = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resta -= matriz[i][j];
            }
        }
        return resta;
    }

    public static int multiplicarMatriz(int[][] matriz) {
        int producto = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                producto *= matriz[i][j];
            }
        }
        return producto;
    }

}
/***
 * Ingrese el tamano de la matriz cuadrada: 2
Ingrese los valores de la matriz:
Ingrese un valor: 2
Ingrese un valor: 3
Ingrese un valor: 4
Ingrese un valor: 5
Resultados:
Suma : 14
Resta : -14
Multiplicacion: 120
 */