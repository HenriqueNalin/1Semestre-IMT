import javax.swing.JOptionPane; 

public class Estatistica {
    public static void main(String[] args) { 
        int numeroVeiculos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de veículos da cidade 1: "));
        int numeroAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o npumero de acidentes da cidade 1: "));
        int maisAcidentes = numeroAcidentes, menosAcidentes = numeroAcidentes, somaAcidentesCidadesMaisQue200Veiculos = 0;
        int cidadeMaisAcidentes = 1, cidadeMenosAcidentes = 1, somaVeiculos = numeroVeiculos, numeroCidadesMaisQue200Veiculos = 0;

        for(int cidade = 2; cidade <= 5; cidade++){
            if(numeroVeiculos >= 2000){
                somaAcidentesCidadesMaisQue200Veiculos += numeroAcidentes;
                numeroCidadesMaisQue200Veiculos++;
            }

            numeroVeiculos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de veículos da cidade " + cidade));
            numeroAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de acidentes da cidade " + cidade));

            if(numeroAcidentes < menosAcidentes){
                menosAcidentes = numeroAcidentes;
                cidadeMenosAcidentes = cidade;
            }

            if(numeroAcidentes > maisAcidentes){
                maisAcidentes = numeroAcidentes;
                cidadeMaisAcidentes = cidade;
            }

            somaVeiculos += numeroVeiculos;
        }

        JOptionPane.showMessageDialog(null,"a)\nA cidade com MENOR índice de acidentes de trânsito é a cidade: " + cidadeMenosAcidentes + ", com " + menosAcidentes + " acidentes" +
        "\nA cidade com MAIOR índice de acidentes de trânsito é: " + cidadeMaisAcidentes + ", com " + maisAcidentes + " acidentes" +
        "\nb)\nA média de veículos nas 5 cidades é: " + (somaVeiculos/5) +
        "\nc)\nA média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é: " + (somaAcidentesCidadesMaisQue200Veiculos/numeroCidadesMaisQue200Veiculos++));
    }   
}


    
