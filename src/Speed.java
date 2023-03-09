import javax.swing.*;

public class Speed {
    public Speed() {
        Double value = null;
        Double result = null;

        try {
            String[] speed = {
                    "m/s",
                    "km/s",
                    "km/h",
                    "mm/s",
                    "µm/s",
                    "mi/s",
                    "mph",
                    "ft/s"
            };

            String fromSpeed = JOptionPane.showInputDialog(null, "Escolha a unidade de velocidade de entrada", "Conversor de Velocidade",
                    JOptionPane.PLAIN_MESSAGE, null, speed, null).toString();

            if (fromSpeed == null) {
                return;
            }

            String toSpeed = JOptionPane.showInputDialog(null, "Escolha a unidade de velocidade de saída", "Conversor de Velocidade",
                    JOptionPane.PLAIN_MESSAGE, null, speed, null).toString();

            if (toSpeed == null) {
                return;
            }

            String input = JOptionPane.showInputDialog("Digite a Velocidade em " + fromSpeed);
            value = Double.parseDouble(input);

            SpeedConverter sc = new SpeedConverter();

            switch (fromSpeed) {
                case "m/s":
                    switch (toSpeed) {
                        case "km/s":
                            sc.metersPerSecondTo(value, "km/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para km/s: " + result + " km/s");
                            break;
                        case "km/h":
                            sc.metersPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para km/h: " + result + " km/h");
                            break;
                        case "mm/s":
                            sc.metersPerSecondTo(value, "mm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para mm/s: " + result + " mm/s");
                            break;
                        case "µm/s":
                            sc.metersPerSecondTo(value, "µm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para µm/s: " + result + " µm/s");
                            break;
                        case "mi/s":
                            sc.metersPerSecondTo(value, "mi/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para mi/s: " + result + " mi/s");
                            break;
                        case "mph":
                            sc.metersPerSecondTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para mph: " + result + " mph");
                            break;
                        case "ft/s":
                            sc.metersPerSecondTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para ft/s: " + result + " ft/s");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "km/s":
                    switch (toSpeed) {
                        case "m/s":
                            sc.metersPerSecondTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/s convertido para m/s: " + result + " m/s");
                            break;
                        case "km/h":
                            sc.metersPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/s convertido para km/h: " + result + " km/h");
                            break;
                        case "mm/s":
                            sc.metersPerSecondTo(value, "mm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/s convertido para mm/s: " + result + " mm/s");
                            break;
                        case "µm/s":
                            sc.metersPerSecondTo(value, "µm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/s convertido para µm/s: " + result + " µm/s");
                            break;
                        case "mi/s":
                            sc.metersPerSecondTo(value, "mi/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/s convertido para mi/s: " + result + " mi/s");
                            break;
                        case "mph":
                            sc.metersPerSecondTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/s convertido para mph: " + result + " mph");
                            break;
                        case "ft/s":
                            sc.metersPerSecondTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/s convertido para ft/s: " + result + " ft/s");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "km/h":
                    switch (toSpeed) {
                        case "m/s":
                            sc.metersPerSecondTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para m/s: " + result + " m/s");
                            break;
                        case "km/s":
                            sc.metersPerSecondTo(value, "km/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para km/h: " + result + " km/s");
                            break;
                        case "mm/s":
                            sc.metersPerSecondTo(value, "mm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para mm/s: " + result + " mm/s");
                            break;
                        case "µm/s":
                            sc.metersPerSecondTo(value, "µm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para µm/s: " + result + " µm/s");
                            break;
                        case "mi/s":
                            sc.metersPerSecondTo(value, "mi/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para mi/s: " + result + " mi/s");
                            break;
                        case "mph":
                            sc.metersPerSecondTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para mph: " + result + " mph");
                            break;
                        case "ft/s":
                            sc.metersPerSecondTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para ft/s: " + result + " ft/s");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "mm/s":
                    switch (toSpeed) {
                        case "m/s":
                            sc.metersPerSecondTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mm/s convertido para m/s: " + result + " m/s");
                            break;
                        case "km/s":
                            sc.metersPerSecondTo(value, "km/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mm/s convertido para km/h: " + result + " km/s");
                            break;
                        case "km/h":
                            sc.metersPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mm/s convertido para km/h: " + result + " km/h");
                            break;
                        case "µm/s":
                            sc.metersPerSecondTo(value, "µm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mm/s convertido para µm/s: " + result + " µm/s");
                            break;
                        case "mi/s":
                            sc.metersPerSecondTo(value, "mi/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mm/s convertido para mi/s: " + result + " mi/s");
                            break;
                        case "mph":
                            sc.metersPerSecondTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mm/s convertido para mph: " + result + " mph");
                            break;
                        case "ft/s":
                            sc.metersPerSecondTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mm/s convertido para ft/s: " + result + " ft/s");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "µm/s":
                    switch (toSpeed) {
                        case "m/s":
                            sc.metersPerSecondTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " µm/s convertido para m/s: " + result + " m/s");
                            break;
                        case "km/s":
                            sc.metersPerSecondTo(value, "km/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " µm/s convertido para km/h: " + result + " km/s");
                            break;
                        case "km/h":
                            sc.metersPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " µm/s convertido para km/h: " + result + " km/h");
                            break;
                        case "mm/s":
                            sc.metersPerSecondTo(value, "mm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " µm/s convertido para mm/s: " + result + " mm/s");
                            break;
                        case "mi/s":
                            sc.metersPerSecondTo(value, "mi/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " µm/s convertido para mi/s: " + result + " mi/s");
                            break;
                        case "mph":
                            sc.metersPerSecondTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " µm/s convertido para mph: " + result + " mph");
                            break;
                        case "ft/s":
                            sc.metersPerSecondTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " µm/s convertido para ft/s: " + result + " ft/s");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "mi/s":
                    switch (toSpeed) {
                        case "m/s":
                            sc.metersPerSecondTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mi/s convertido para m/s: " + result + " m/s");
                            break;
                        case "km/s":
                            sc.metersPerSecondTo(value, "km/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mi/s convertido para km/h: " + result + " km/s");
                            break;
                        case "km/h":
                            sc.metersPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mi/s convertido para km/h: " + result + " km/h");
                            break;
                        case "mm/s":
                            sc.metersPerSecondTo(value, "mm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mi/s convertido para mm/s: " + result + " mm/s");
                            break;
                        case "µm/s":
                            sc.metersPerSecondTo(value, "µm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mi/s convertido para µm/s: " + result + " µm/s");
                            break;
                        case "mph":
                            sc.metersPerSecondTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mi/s convertido para mph: " + result + " mph");
                            break;
                        case "ft/s":
                            sc.metersPerSecondTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mi/s convertido para ft/s: " + result + " ft/s");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "mph":
                    switch (toSpeed) {
                        case "m/s":
                            sc.metersPerSecondTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para m/s: " + result + " m/s");
                            break;
                        case "km/s":
                            sc.metersPerSecondTo(value, "km/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para km/h: " + result + " km/s");
                            break;
                        case "km/h":
                            sc.metersPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para km/h: " + result + " km/h");
                            break;
                        case "mm/s":
                            sc.metersPerSecondTo(value, "mm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para mm/s: " + result + " mm/s");
                            break;
                        case "µm/s":
                            sc.metersPerSecondTo(value, "µm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para µm/s: " + result + " µm/s");
                            break;
                        case "mi/s":
                            sc.metersPerSecondTo(value, "mi/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para mi/s: " + result + " mi/s");
                            break;
                        case "ft/s":
                            sc.metersPerSecondTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para ft/s: " + result + " ft/s");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                case "ft/s":
                    switch (toSpeed) {
                        case "m/s":
                            sc.metersPerSecondTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para m/s: " + result + " m/s");
                            break;
                        case "km/s":
                            sc.metersPerSecondTo(value, "km/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para km/h: " + result + " km/s");
                            break;
                        case "km/h":
                            sc.metersPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para km/h: " + result + " km/h");
                            break;
                        case "mm/s":
                            sc.metersPerSecondTo(value, "mm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para mm/s: " + result + " mm/s");
                            break;
                        case "µm/s":
                            sc.metersPerSecondTo(value, "µm/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para µm/s: " + result + " µm/s");
                            break;
                        case "mi/s":
                            sc.metersPerSecondTo(value, "mi/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para mi/s: " + result + " mi/s");
                            break;
                        case "mph":
                            sc.metersPerSecondTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para mph: " + result + " mph");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
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
