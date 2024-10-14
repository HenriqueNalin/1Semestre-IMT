import java.text.DecimalFormat; 
import javax.swing.JOptionPane;

public class Funcionario {
    public static void main(String[] args) { 

        double salario = 1000;
        double percentual = 0.015;

        for(int ano=2006; ano <= 2024; ano++){
            salario += salario*percentual;
            percentual = percentual + 0.015;
            System.out.println("Salário: " + salario + "Percentual: " + percentual);
        }

        DecimalFormat d = new DecimalFormat("#.###");
        JOptionPane.showMessageDialog(null,"Salário atual: " + d.format(salario));
    }
    
}
