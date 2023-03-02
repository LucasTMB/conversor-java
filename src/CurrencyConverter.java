public class CurrencyConverter {
    private double usdRate = 0.19; // 1 USD = 5.26 BRL
    private double eurRate = 0.18; // 1 EUR = 5.56 BRL
    private double gbpRate = 0.16; // 1 GBP = 6.25 BRL
    private double arsRate = 37.87; // 1 ARS = 0.03 BRL
    private double clpRate = 156.72; // 1 CLP = 0.01 BRL
    private double value;
    private String fromCurrency;
    private String toCurrency;
    private double result;

    public double getResult() {
        return result;
    }

    public boolean setRealTo(double value, String toCurrency) {
        this.value = value;
        this.fromCurrency = "BRL";
        this.toCurrency = toCurrency;

        if (!toCurrency.equals("BRL")) {
            if (toCurrency.equals("USD")) {
                result = value * usdRate;
            } else if (toCurrency.equals("EUR")) {
                result = value * eurRate;
            } else if (toCurrency.equals("GBP")) {
                result = value * gbpRate;
            } else if (toCurrency.equals("ARS")) {
                result = value * arsRate;
            } else if (toCurrency.equals("CLP")) {
                result = value * clpRate;
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
                result = value / usdRate;
            } else if (fromCurrency.equals("EUR")) {
                result = value / eurRate;
            } else if (fromCurrency.equals("GBP")) {
                result = value / gbpRate;
            } else if (fromCurrency.equals("ARS")) {
                result = value / arsRate;
            } else if (fromCurrency.equals("CLP")) {
                result = value / clpRate;
            }
            return true;
        } else {
            System.out.println("Moeda de origem inválida.");
            return false;
        }
    }
}
