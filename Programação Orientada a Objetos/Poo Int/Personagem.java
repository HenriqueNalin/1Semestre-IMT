public class Personagem{
    private String nome;
    private int energia, fome, sono, experiencia;

    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome;
        this.experiencia = 0;
        if(energia >= 0 && energia <= 10){ 
            this.energia = energia;
        }
        if(fome >= 0 && fome <= 10){
            this.fome = fome;
        }
        if(sono >= 0 && sono <= 10){
            this.sono = sono;
        }
    }

    public void cacar(){
        if(energia >= 2){
            System.out.println(nome + " está caçando.");
            energia -= 2; 
            experiencia++; 
        }else{ 
            System.out.println(nome + " não possui " +
            " energia suficiente para caçar.");
        }
        fome = Math.min(fome+1,10);
        sono = Math.min(sono+1,10);
        exibirEstadoAtributos();
    }

    public void comer(){
        if(fome >= 1){
            System.out.println(nome + " está comendo.");
            energia = Math.min(energia+1,10);
            fome -= 1; 
        }else{
            System.out.println(nome + " não está com fome.");
        }
        exibirEstadoAtributos();
    }

    public void dormir(){
        if(sono >= 1){
            System.out.println(nome + " está dormindo.");
            sono -= 1; 
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }else{ 
            System.out.println(nome + " não está com sono.");
        }
        exibirEstadoAtributos(); 
    }

    public int getEnergia(){
        return energia;
    }
    public int getFome(){
        return fome;
    }
    public int getSono(){
        return sono;
    }
    public void exibirEstadoAtributos(){
        System.out.println("Nome: " + nome + " Energia: " + energia);
        System.out.println("Fome: " + fome + " Sono: " + sono);
        System.out.println("Experiencia: " + experiencia);
    }
    public int getExperiencia(){
        return experiencia;
    }
}