import javax.swing.JOptionPane;
    public class Antecessor { 
        public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite qualquer valor que iremos dizer o seu antecessor:"));
        double resultado = (valor - 1);

        JOptionPane.showMessageDialog(null, "O antecessor do número escolhido é:" + resultado);
        }
    }

