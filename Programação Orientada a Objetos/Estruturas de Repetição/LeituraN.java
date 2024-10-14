import javax.swing.JOptionPane;

public class LeituraN {
    public static void main(String[] args) { 

        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números inteiros:  "));

        for(int n= 1; n <= N; n++) { 
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
            int fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            JOptionPane.showMessageDialog(null, "Número : " + numero + "Fatorial: " + fatorial);
        }
    }

    
}
