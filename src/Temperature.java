import javax.swing.*;
import java.text.DecimalFormat;

public class Temperature {
    DecimalFormat df = new DecimalFormat();

    public Temperature() {
        df.applyPattern("#,##0.00");

        Double value = null;
        Double result = null;

        try {
            String[] temperature = {"Celsius para Fahrenheit", "Fahrenheit para Celsius", "Celsius para Kelvin",
                    "Kelvin para Celsius", "Fahrenheit para Kelvin", "Kelvin para Fahrenheit"};

            String temperaturies = JOptionPane.showInputDialog(null, "Escolha o tipo de conversão", "Conversor de Temperatura",
                    JOptionPane.PLAIN_MESSAGE, null, temperature, null).toString();

            String input = JOptionPane.showInputDialog("Digite a Temperatura:");
            value = Double.parseDouble(input);

            TemperatureConverter tc = new TemperatureConverter();

            switch (temperaturies) {
                case "Celsius para Fahrenheit":
                    result = tc.celsiusToFahrenheit(value);
                    JOptionPane.showMessageDialog(null, value + " °C convertido para Fahrenheit: " + df.format(result) + " °F");
                    break;
                case "Fahrenheit para Celsius":
                    result = tc.fahrenheitToCelsius(value);
                    JOptionPane.showMessageDialog(null, value + " °F convertido para Celsius: " + df.format(result) + " °C");
                    break;
                case "Celsius para Kelvin":
                    result = tc.celsiusToKelvin(value);
                    JOptionPane.showMessageDialog(null, value + " °C convertido para Kelvin: " + df.format(result) + " K");
                    break;
                case "Kelvin para Celsius":
                    result = tc.kelvinToCelsius(value);
                    JOptionPane.showMessageDialog(null, value + " K convertido para Celsius: " + df.format(result) + " °C");
                    break;
                case "Fahrenheit para Kelvin":
                    result = tc.fahrenheitToKelvin(value);
                    JOptionPane.showMessageDialog(null, value + " °F convertido para Kelvin: " + df.format(result) + " K");
                    break;
                case "Kelvin para Fahrenheit":
                    result = tc.kelvinToFahrenheit(value);
                    JOptionPane.showMessageDialog(null, value + " K convertido para Fahrenheit: " + df.format(result) + " °F");
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
            if (response == JOptionPane.YES_OPTION) {
                Screen screen = new Screen();
                screen.loop();
            } else {
                JOptionPane.showMessageDialog(null, "Finalizando por aqui. Muito obrigado por utilizar!");
            }
        }
    }
}

