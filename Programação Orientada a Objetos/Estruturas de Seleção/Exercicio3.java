import javax.swing.JOptionPane;
public class Exercicio3 { 
    public static void main(String[] args) { 
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
            if ( numero1 > numero2 ) { 
                JOptionPane.showMessageDialog(null, "Primeiro maior que o segundo");
            } else {
                JOptionPane.showMessageDialog(null, "Segundo maior que o primeiro");
            }
    }
} 

                