import javax.swing.JOptionPane;
    public class QuatroNumeros { 
        public static void main(String[] args) { 
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
            double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número:"));

            double a = (n1*n1);
            double b = (n2*n2);
            double c = (n3*n3);
            double d = (n4*n4);

            double resultado = a + b + c + d; 
            JOptionPane.showMessageDialog(null, "A soma do quadrado dos quatro números é:" + resultado);
        }
    }



