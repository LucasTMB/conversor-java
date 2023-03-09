import javax.swing.*;

public class Screen extends JFrame {
    public static void main(String[] args) {
        String[] options = {"Conversor de Moeda", "Conversor de Temperatura", "Conversor de Velocidade"};

        String type = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, options, null).toString();

        if (type == "Conversor de Moeda") {
            new Currency();
        } else if (type == "Conversor de Temperatura") {
            new Temperature();
        } else if (type == "Conversor de Velocidade") {
            new Speed();
        }
    }

    public void loop() {
        String[] options = {"Conversor de Moeda", "Conversor de Temperatura", "Conversor de Velocidade"};

        String type = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, options, null).toString();

        if (type == "Conversor de Moeda") {
            new Currency();
        } else if (type == "Conversor de Temperatura") {
            new Temperature();
        } else if (type == "Conversor de Velocidade") {
            new Speed();
        }
    }
}
