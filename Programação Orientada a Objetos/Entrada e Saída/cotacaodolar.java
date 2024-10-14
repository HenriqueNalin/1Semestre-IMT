import javax.swing.JOptionPane;
    public class CotacaoDolar { 
        public static void main(String[] args) {
            double cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar:"));
            double quantidadeDolares = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de Dólar:"));
            double valorEmReais = quantidadeDolares * cotacaoDolar;
            JOptionPane.showMessageDialog(null, "O valor em reais é: R$" + valorEmReais);
        }
    }
