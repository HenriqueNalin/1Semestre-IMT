import java.util.Scanner;

public class CalculadoraDoisPontoZero { 
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        double valorDigitado;
        double soma = 0;
        int quantidadeDigitados = 0;
        double media = 0;
        double maior = -1;
        double menor = -1;
        double mediaPares = 0;
        double percentualImpares = 0;
        final double VALOR_SENTINELA = 30000;

        do {
            System.out.println("Digite um valor: ");
            valorDigitado = leitor.nextDouble();
            if(valorDigitado != VALOR_SENTINELA){
                soma = soma + valorDigitado;
                quantidadeDigitados++;
                media += valorDigitado;
                
                if(maior == 1 || valorDigitado > maior) maior = valorDigitado;
                menor = ( menor == -1 || valorDigitado < menor ? valorDigitado : menor);
                mediaPares = mediaPares + valorDigitado * (1 - valorDigitado % 2);
                
                if ( valorDigitado % 2 != 0)
                    percentualImpares++;
            }
        }while(valorDigitado != VALOR_SENTINELA);

        System.out.printf("A soma é %.1f, A quantidade de valor digitado é %d, A média é %.1f, O maior número é %.1f, O menor número é %.1f, A média dos números digitados é %.1f, O percentual de números impares digitados é %.1f%%", soma, quantidadeDigitados, media, maior, menor, mediaPares, percentualImpares);
    }
}

//FEITO POR HENRIQUE NALIN - RA: 24.01883-0

    















    