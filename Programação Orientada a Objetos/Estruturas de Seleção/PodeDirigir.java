public class PodeDirigir {
    public static void main(String[] args) {
        
        var leitor = new.java.util.Scanner(System.in);
        System.out.println("Sua idade");
        var idade = leitor.nextShort();
        if (idade >= 18) 
            System.out.println("Sim");
        else 
            System.out.println("Não");

        System.out.println(idade >= 18 ? "Sim" : "Não");


         
        
    }
}
