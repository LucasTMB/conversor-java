import javax.swing.*;
import java.text.DecimalFormat;

public class Currency {
    DecimalFormat df = new DecimalFormat();

    public Currency() {
        df.applyPattern("#,##0.00");

        Double value = null;
        Double result = null;

        try {
            String[] currency = {"Real para Dólar", "Real para Euro", "Real para Libra Esterlina",
                    "Real para Peso Argentino", "Real para Peso Chileno", "Dólar para Real",
                    "Euro para Real", "Libra Esterlina para Real", "Peso Argentino para Real",
                    "Peso Chileno para Real"};

            String currencies = JOptionPane.showInputDialog(null, "Escolha a moeda para converter", "Conversor de Moedas",
                    JOptionPane.PLAIN_MESSAGE, null, currency, null).toString();

            String input = JOptionPane.showInputDialog("Digite o Valor:");
            value = Double.parseDouble(input);

            CurrencyConverter cc = new CurrencyConverter();

            switch (currencies) {
                case "Real para Dólar":
                    cc.getRealTo(value, "USD");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Real convertido para Dólar: $ " + df.format(result));
                    break;
                case "Real para Euro":
                    cc.getRealTo(value, "EUR");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Real convertido para Euro: € " + df.format(result));
                    break;
                case "Real para Libra Esterlina":
                    cc.getRealTo(value, "GBP");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Real convertido para Libra Esterlina: £ " + df.format(result));
                    break;
                case "Real para Peso Argentino":
                    cc.getRealTo(value, "ARS");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Real convertido para Peso Argentino: (ARS) " + df.format(result));
                    break;
                case "Real para Peso Chileno":
                    cc.getRealTo(value, "CLP");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Real convertido para Peso Chileno: (CLP) " + df.format(result));
                    break;
                case "Dólar para Real":
                    cc.getToReal(value, "USD");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Dólar convertido para Real: R$ " + df.format(result));
                    break;
                case "Euro para Real":
                    cc.getToReal(value, "EUR");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Euro convertido para Real: R$ " + df.format(result));
                    break;
                case "Libra Esterlina para Real":
                    cc.getToReal(value, "GBP");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Libra Esterlina convertida para Real: R$ " + df.format(result));
                    break;
                case "Peso Argentino para Real":
                    cc.getToReal(value, "ARS");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Peso Argentino convertido para Real: R$ " + df.format(result));
                    break;
                case "Peso Chileno para Real":
                    cc.getToReal(value, "CLP");
                    result = cc.getResult();
                    JOptionPane.showMessageDialog(null, "Peso Chileno convertido para Real: R$ " + df.format(result));
                    break;
                default:
                    System.out.println("Algo está errado");
                    break;
            }

        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Você não digitou um número", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?");
            if(resposta == JOptionPane.YES_OPTION) {
                Screen screen = new Screen();
                screen.loop();
            } else {
                JOptionPane.showMessageDialog(null, "Finalizando por aqui. Muito obrigado por utilizar!");
            }
        }
    }
}
