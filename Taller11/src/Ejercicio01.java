
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        int limFil = 0, limCol = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deme Limite de FIlas y Limite de columnas");
        limFil = teclado.nextInt();
        limCol = teclado.nextInt();
        int matriz[][] = new int[limFil][limCol];
        generarMatriz(matriz);
        presentarMatriz(matriz);
        System.out.println("Elementos pares de la matriz");
        PresentarParesMatriz(matriz);
        System.out.println("Elementos impares de la matriz");
        PresentarImParesMatriz(matriz);
        System.out.println("El promedio de la matriz es: " + PromedioMatriz(matriz));

    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) { // se usa el cero para definir solamente las columnas
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }
    }

    public static void PresentarParesMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) { // se usa el cero para definir solamente las columnas
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void PresentarImParesMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) { // se usa el cero para definir solamente las columnas
                if (matriz[i][j] % 2 != 0) {
                    System.out.println(matriz[i][j] + " ");
                }
             
            }
         
        }
    }
    public static double  PromedioMatriz(int matriz[][]) {
        int sumaMatriz= 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) { // se usa el cero para definir solamente las columnas
               sumaMatriz += matriz [i][j];
              
            }
        }
        return sumaMatriz /(matriz.length * matriz [0].length);
    }
}
/***
 * Deme Limite de FIlas y Limite de columnas
2 2
2 2 
6 3 
Elementos pares de la matriz
2 
2 
6 

Elementos impares de la matriz
3 
El promedio de la matriz es: 3.0
 */