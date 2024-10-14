import java.util.Scanner;
public class DistanciaEntre2Pontos {
    //indentação (indent) 
    public static void main(String[] args) {
        
        //declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        
        // variáveis de entrada
        float x1, x2, y1, y2; 
        float distancia;

        //entrada de dados
        System.out.println("Digite x1");
        x1 = leitor.nextFloat();
        System.out.println("Digite x2");
        x2 = leitor.nextFloat();
        System.out.println("Digite y1");
        y1 = leitor.nextFloat();
        System.out.println("Digite y2");
        y2 = leitor.nextFloat();

        //processamento
        distancia = (float) Math.sqrt((x2 - x1) * (x2 -x1) + Math.pow(y2 - y1, 2));

        //saída
        System.out.println("A distância entre p1(" + x1 + ", " + y1 + ") e p2(" + x2 + ", " + y2 + ") é: " + distancia);

        System.out.printf(
            "A distancia entre p1(%.2f, %.2f) e p2(%.2f, %.2f) é: distancia",
            x1, y1, x2, y2, distancia);
    
    
    
    
    
    
    
    }
}




        

