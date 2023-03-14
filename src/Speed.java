import javax.swing.*;

public class Speed {
    public Speed() {
        Double value = null;
        Double result = null;

        try {
            String[] speed = {
                    "m/s",
                    "km/h",
                    "mph",
                    "ft/s",
                    "kn"
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
                        case "km/h":
                            sc.metersPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para km/h: " + result + " km/h");
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
                        case "kn":
                            sc.metersPerSecondTo(value, "kn");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " m/s convertido para kn: " + result + " kn");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "km/h":
                    switch (toSpeed) {
                        case "m/s":
                            sc.kilometersPerHourTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para m/s: " + result + " m/s");
                            break;
                        case "mph":
                            sc.kilometersPerHourTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para mph: " + result + " mph");
                            break;
                        case "ft/s":
                            sc.kilometersPerHourTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para ft/s: " + result + " ft/s");
                            break;
                        case "kn":
                            sc.kilometersPerHourTo(value, "kn");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " km/h convertido para kn: " + result + " kn");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "mph":
                    switch (toSpeed) {
                        case "m/s":
                            sc.milesPerHourTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para m/s: " + result + " m/s");
                            break;
                        case "km/h":
                            sc.milesPerHourTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para km/h: " + result + " km/h");
                            break;
                        case "ft/s":
                            sc.milesPerHourTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para ft/s: " + result + " ft/s");
                            break;
                        case "kn":
                            sc.milesPerHourTo(value, "kn");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " mph convertido para kn: " + result + " kn");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "ft/s":
                    switch (toSpeed) {
                        case "m/s":
                            sc.feetPerSecondTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para m/s: " + result + " m/s");
                            break;
                        case "km/h":
                            sc.feetPerSecondTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para km/h: " + result + " km/h");
                            break;
                        case "mph":
                            sc.feetPerSecondTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para mph: " + result + " mph");
                            break;
                        case "kn":
                            sc.feetPerSecondTo(value, "kn");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " ft/s convertido para kn: " + result + " kn");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
                    break;
                case "kn":
                    switch (toSpeed) {
                        case "m/s":
                            sc.knotsTo(value, "m/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " kn convertido para m/s: " + result + " m/s");
                            break;
                        case "km/h":
                            sc.knotsTo(value, "km/h");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " kn convertido para km/h: " + result + " km/h");
                            break;
                        case "mph":
                            sc.knotsTo(value, "mph");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " kn convertido para mph: " + result + " mph");
                            break;
                        case "ft/s":
                            sc.knotsTo(value, "ft/s");
                            result = sc.getResult();
                            JOptionPane.showMessageDialog(null, value + " kn convertido para ft/s: " + result + " ft/s");
                            break;
                        default:
                            System.err.println("Erro: valor inválido para a variável!");
                            break;
                    }
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
