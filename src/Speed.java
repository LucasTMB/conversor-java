import javax.swing.*;

public class Speed {
    public Speed() {
        Double value = null;
        Double result = null;

        try {
            String[] speed = {
                    "m/s para km/s",
                    "m/s para km/h",
                    "m/s para mm/s",
                    "m/s para µm/s",
                    "m/s para mi/s",
                    "m/s para mph",
                    "m/s para ft/s",
                    "km/s para m/s",
                    "km/s para km/h",
                    "km/s para mm/s",
                    "km/s para µm/s",
                    "km/s para mi/s",
                    "km/s para mph",
                    "km/s para ft/s",
                    "km/h para m/s",
                    "km/h para km/s",
                    "km/h para mm/s",
                    "km/h para µm/s",
                    "km/h para mi/s",
                    "km/h para mph",
                    "km/h para ft/s",
                    "mm/s para m/s",
                    "mm/s para km/s",
                    "mm/s para km/h",
                    "mm/s para µm/s",
                    "mm/s para mi/s",
                    "mm/s para mph",
                    "mm/s para ft/s",
                    "µm/s para m/s",
                    "µm/s para km/s",
                    "µm/s para km/h",
                    "µm/s para mm/s",
                    "µm/s para mi/s",
                    "µm/s para mph",
                    "µm/s para ft/s",
                    "mi/s para m/s",
                    "mi/s para km/s",
                    "mi/s para km/h",
                    "mi/s para mm/s",
                    "mi/s para µm/s",
                    "mi/s para mph",
                    "mi/s para ft/s",
                    "mph para m/s",
                    "mph para km/s",
                    "mph para km/h",
                    "mph para mm/s",
                    "mph para µm/s",
                    "mph para mi/s",
                    "mph para ft/s",
                    "ft/s para m/s",
                    "ft/s para km/s",
                    "ft/s para km/h",
                    "ft/s para mm/s",
                    "ft/s para µm/s",
                    "ft/s para mi/s",
                    "ft/s para mph"
            };

            String speeds = JOptionPane.showInputDialog(null, "Escolha a conversão de medida de velocidade", "Conversor de Velocidade",
                    JOptionPane.PLAIN_MESSAGE, null, speed, null).toString();

            String input = JOptionPane.showInputDialog("Digite o valor");
            value = Double.parseDouble(input);

            SpeedConverter sc = new SpeedConverter();

            //ainda não finalizado
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
