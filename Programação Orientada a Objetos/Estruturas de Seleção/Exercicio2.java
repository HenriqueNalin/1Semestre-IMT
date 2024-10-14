import javax.swing.JOptionPane; 
public class Exercicio2 { 
    public static void main(String[] args) { 
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número real: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um segundo número real: "));
            if ( numero1 == numero2) { 
                JOptionPane.showMessageDialog(null, "Os números são iguais");
            }
        }
    }
                
        
