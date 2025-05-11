import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public double obtenerTasaCambio(String base, String destino) {
        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/4172690b6458bd4473b675c2/latest/" + base);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            TasaCambio tasaCambio = gson.fromJson(response.body(), TasaCambio.class);

            Double tasa = tasaCambio.conversion_rates().get(destino);
            if (tasa == null) {
                throw new RuntimeException("No se encontró la tasa de cambio para: " + destino);
            }
            return tasa;
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la tasa de cambio: " + e.getMessage());
        }
    }
}