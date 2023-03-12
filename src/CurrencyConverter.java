import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    // Real para ...
    private double brlUsd;
    private double brlEur;
    private double brlGbp;
    private double brlArs;
    private double brlClp;

    // ... para Real
    private double usdBrl;
    private double eurBrl;
    private double gbpBrl;
    private double arsBrl;
    private double clpBrl;

    private double value;
    private String fromCurrency;
    private String toCurrency;
    private double result;

    public CurrencyConverter() throws IOException, InterruptedException {
        String moedas = "BRL-USD,USD-BRL,BRL-EUR,EUR-BRL,BRL-GBP,GBP-BRL,BRL-ARS,ARS-BRL,BRL-CLP,CLP-BRL";
        String url = "https://economia.awesomeapi.com.br/last/" + moedas;

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .header("Accept-Charset", "utf-8")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();

        JSONObject json = new JSONObject(responseBody);
        // Real para ...
        brlUsd = json.getJSONObject("BRLUSD").getDouble("high");
        brlEur = json.getJSONObject("BRLEUR").getDouble("high");
        brlGbp = json.getJSONObject("BRLGBP").getDouble("high");
        brlArs = json.getJSONObject("BRLARS").getDouble("high");
        brlClp = json.getJSONObject("BRLCLP").getDouble("high");

        // ... para Real
        usdBrl = json.getJSONObject("USDBRL").getDouble("high");
        eurBrl = json.getJSONObject("EURBRL").getDouble("high");
        gbpBrl = json.getJSONObject("GBPBRL").getDouble("high");
        arsBrl = json.getJSONObject("ARSBRL").getDouble("high");
        clpBrl = json.getJSONObject("CLPBRL").getDouble("high");
    }

    public double getResult() {
        return result;
    }

    public boolean setRealTo(double value, String toCurrency) {
        this.value = value;
        this.fromCurrency = "BRL";
        this.toCurrency = toCurrency;

        if (!toCurrency.equals("BRL")) {
            if (toCurrency.equals("USD")) {
                result = value * brlUsd;
            } else if (toCurrency.equals("EUR")) {
                result = value * brlEur;
            } else if (toCurrency.equals("GBP")) {
                result = value * brlGbp;
            } else if (toCurrency.equals("ARS")) {
                result = value * brlArs;
            } else if (toCurrency.equals("CLP")) {
                result = value * brlClp;
            }
            return true;
        } else {
            System.out.println("Moeda de destino inválida.");
            return false;
        }
    }

    public boolean setToReal(double value, String fromCurrency) {
        this.value = value;
        this.fromCurrency = fromCurrency;
        this.toCurrency = "BRL";

        if (!fromCurrency.equals("BRL")) {
            if (fromCurrency.equals("USD")) {
                result = value * usdBrl;
            } else if (fromCurrency.equals("EUR")) {
                result = value * eurBrl;
            } else if (fromCurrency.equals("GBP")) {
                result = value * gbpBrl;
            } else if (fromCurrency.equals("ARS")) {
                result = value * arsBrl;
            } else if (fromCurrency.equals("CLP")) {
                result = value * clpBrl;
            }
            return true;
        } else {
            System.out.println("Moeda de origem inválida.");
            return false;
        }
    }
}
