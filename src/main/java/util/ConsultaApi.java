package util;

import com.google.gson.Gson;
import models.Currency;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    String clave = "164a192516700ee7b14a5103";

    public ConsultaApi(){
    }

    public Currency conversion(String baseCode, String targetCode) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/" + clave + "/pair/" + baseCode + "/" + targetCode;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        Gson gson = new Gson();
        return gson.fromJson(json, Currency.class);
    }
}


