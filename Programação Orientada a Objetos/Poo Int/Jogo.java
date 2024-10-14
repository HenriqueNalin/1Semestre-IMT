import javax.swing.JOptionPane;
public class Jogo {
    public static void main(String[] args) {


        Personagem cacador = new Personagem("Joao",10,0,0);

        while(cacador.getEnergia() > 0 && cacador.getSono() < 10 && 
            cacador.getFome() < 10 && cacador.getExperiencia() < 10){

            int opcao = Integer.parseInt(
                JOptionPane.showInputDialog("1- Caçar\n2- Comer\n" + 
                "3- Dormir")
            );
            if(opcao == 1){
                cacador.cacar();
            }else if(opcao == 2){
                cacador.comer();
            }else if(opcao == 3){
                cacador.dormir();
            }else{ 
                System.out.println("Digite uma opção válida.");
            }
        }
        
        
        if(cacador.getExperiencia() == 10){
            System.out.println("Parabéns, você venceu!!");
        }else{ 
            System.out.println("Você Perdeu!!");
        }
    }
}