import javax.swing.*;
import java.text.DecimalFormat;

public class Currency {
    DecimalFormat df = new DecimalFormat();

    public Currency() {
        df.applyPattern("#,##0.00");

        Double value = null;
        Double result = null;

        try {
            String[] currency = {
                    "Real para Dólar",
                    "Real para Euro",
                    "Real para Libra Esterlina",
                    "Real para Peso Argentino",
                    "Real para Peso Chileno",
                    "Dólar para Real",
                    "Euro para Real",
                    "Libra Esterlina para Real",
                    "Peso Argentino para Real",
                    "Peso Chileno para Real"
            };

            String currencies = JOptionPane.showInputDialog(null, "Escolha a moeda para converter", "Conversor de Moedas",
                    JOptionPane.PLAIN_MESSAGE, null, currency, null).toString();

            String input = JOptionPane.showInputDialog("Digite o Valor:");
            value = Double.parseDouble(input);

            CurrencyConverter cc = new CurrencyConverter();

            switch (currencies) {
                case "Real para Dólar":
                    cc.setRealTo(value, "USD");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "R$ " + value + " convertidos para Dólar: $ " + df.format(result));
                    break;
                case "Real para Euro":
                    cc.setRealTo(value, "EUR");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "R$ " + value + " convertidos para Euro: € " + df.format(result));
                    break;
                case "Real para Libra Esterlina":
                    cc.setRealTo(value, "GBP");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "R$ " + value + " convertidos para Libra Esterlina: £ " + df.format(result));
                    break;
                case "Real para Peso Argentino":
                    cc.setRealTo(value, "ARS");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "R$ " + value + " convertidos para Peso Argentino: (ARS) " + df.format(result));
                    break;
                case "Real para Peso Chileno":
                    cc.setRealTo(value, "CLP");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "R$ " + value + " convertidos para Peso Chileno: (CLP) " + df.format(result));
                    break;
                case "Dólar para Real":
                    cc.setToReal(value, "USD");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "$ " + value + " convertidos para Real: R$ " + df.format(result));
                    break;
                case "Euro para Real":
                    cc.setToReal(value, "EUR");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "€ " + value + " convertidos para Real: R$ " + df.format(result));
                    break;
                case "Libra Esterlina para Real":
                    cc.setToReal(value, "GBP");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "£ " + value + " convertidas para Real: R$ " + df.format(result));
                    break;
                case "Peso Argentino para Real":
                    cc.setToReal(value, "ARS");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "(ARS) " + value + " convertidos para Real: R$ " + df.format(result));
                    break;
                case "Peso Chileno para Real":
                    cc.setToReal(value, "CLP");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "(CLP) " + value + " convertidos para Real: R$ " + df.format(result));
                    break;
                default:
                    System.err.println("Erro: valor inválido para a variável!");
                    break;
            }

        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Você não digitou um número", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            int response = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?");
            if(response == JOptionPane.YES_OPTION) {
                Screen screen = new Screen();
                screen.loop();
            } else {
                JOptionPane.showMessageDialog(null, "Finalizando por aqui. Muito obrigado por utilizar!");
            }
        }
    }
}
