package util;

import models.Currency;

import java.io.IOException;
import java.util.Scanner;

public class Conversor {

    ConsultaApi consumoApi = new ConsultaApi();

    public void buscarMoneda(String codigoBase, String codigoObjetivo) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cantidad a convertir");
        var cantidadStr = lectura.nextLine();
        double cantidad = 0;
        try {
            cantidad = Double.parseDouble(cantidadStr);
        } catch (NumberFormatException e){
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
        }

        System.out.println("Convertir " + codigoBase + " a " + codigoObjetivo + " ++");

        Currency detallesMoneda = consumoApi.conversion(codigoBase, codigoObjetivo);

        if (detallesMoneda != null) {
            double conversionRate = detallesMoneda.getConversion_rate();
            double resultadoConversion = conversionRate * cantidad;

            String resultado = String.format("Convertir %.2f %s a %s: %.5f", cantidad, codigoBase, codigoObjetivo, resultadoConversion);
            System.out.println("Resultado de la conversión: " + resultado);
        } else {
            System.out.println("No se pudo obtener la tasa de conversión. Verifique la respuesta de la API.");
        }
    }
}
