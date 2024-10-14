import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Double.sum;
import static java.lang.Byte.parseByte;
import static java.lang.Short.parseShort;
import static java.lang.Long.parseLong;
import static java.lang.String.format;
public class CompraRoupa{
    public static void main(String[] args) {
        double valorPeca;
        byte opcaoUsuario;
        valorPeca = parseDouble(showInputDialog("Digite o valor da peça"));
        opcaoUsuario = parseByte(showInputDialog("0- A vista 1-Cartão 2-Creditário"));
        switch(opcaoUsuario) { 
            case 0: { 
                showMessageDialog(null, "Valor da roupa R$" + (valorPeca -( valorPeca*0.1)));
                break;
            }
            case 1: { 
             short numeroParcelas = parseShort(showInputDialog("Número de parcelas:"));
             String exibir = format("Valor de cada parcela R$%f", valorPeca / numeroParcelas);
             showMessageDialog(null, exibir);
                break;
            }
            case 2: { 
             long numeroParcelas = parseLong(showInputDialog("Número de parcelas"));
             valorPeca = valorPeca * 1.1;
             showMessageDialog(null, format("Valor total: R$%f. Valor da parcela: R$%f", valorPeca, valorPeca / numeroParcelas));
                break;
            } 
            default: { 
            showMessageDialog(null, "Opção inválida");
                break;
            }
        }              
    }
}


