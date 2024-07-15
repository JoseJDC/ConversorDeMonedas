import util.Conversor;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione la conversión que desea realizar:");
            System.out.println("1. Dolar ==> Peso argentino");
            System.out.println("2. Peso argentino ==> Dolar");
            System.out.println("3. Dolar ==> Real brasileño");
            System.out.println("4. Real brasileño ==> Dolar");
            System.out.println("5. Dolar ==> Peso colombiano");
            System.out.println("6. Peso colombiano ==> Dolar");
            System.out.println("7. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    conversor.buscarMoneda("USD", "ARS");
                    salir = true;
                    break;
                case 2:
                    conversor.buscarMoneda("ARS", "USD");
                    salir = true;
                    break;
                case 3:
                    conversor.buscarMoneda("USD", "BRL");
                    salir = true;
                    break;
                case 4:
                    conversor.buscarMoneda("BRL", "USD");
                    salir = true;
                    break;
                case 5:
                    conversor.buscarMoneda("USD", "COP");
                    salir = true;
                    break;
                case 6:
                    conversor.buscarMoneda("COP", "USD");
                    salir = true;
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}