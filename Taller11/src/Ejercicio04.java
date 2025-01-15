
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = teclado.nextLine();

        System.out.print("Ingrese la cedula del cliente: ");
        String cedulaCliente = teclado.nextLine();

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                calcularLuz(nombreCliente, cedulaCliente);
                break;
            case 2:
                calcularPredio(nombreCliente, cedulaCliente);
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }

    public static void calcularLuz(String clienteNombre, String clienteCedula) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor del kilovatio: ");
        double valorKilovatio = teclado.nextDouble();

        System.out.print("Ingrese el numero de kilovatios consumidos: ");
        double cantidadKilovatios = teclado.nextDouble();

        double totalPagar = valorKilovatio * cantidadKilovatios;

        System.out.printf("Cliente" + clienteNombre + " con cedula" + clienteCedula + "  debe cancelar el valor de " + totalPagar);
    }

    public static void calcularPredio(String clienteNombre, String clienteCedula) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor del bien inmueble: ");
        double valorInmueble = teclado.nextDouble();

        double valorImpuesto = valorInmueble * 0.02;

        System.out.printf("Cliente " + clienteNombre + " con cedula" + clienteCedula + "  tiene un bien inmueble valorado en " + valorInmueble + "  y tiene que pagar de predio " + valorImpuesto);
    }

}
/***
 * Ingrese el nombre del cliente: David
Ingrese la cedula del cliente: 1105633190
Seleccione una opcion:
1. Calcular valor de la planilla de luz
2. Calcular valor del predio
1
Ingrese el valor del kilovatio: 34
Ingrese el numero de kilovatios consumidos: 45
ClienteDavid con cedula1105633190  debe cancelar el valor de 1530
 */