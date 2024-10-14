public class ExerciciosBasicos { 
    public static void main(String [] args) { 
        //repetição controlada por contador
        // três partes 
        // declaração/inicialização ->
        int contador = 1;
        // teste de continuidade ->
        while(contador <= 3) {
            System.out.println(contador); 
        //atualização
        contador = contador + 1; 
        }
    }
}

























//utilizando "for"
// for(int contador = 1; contador <= 3; contador = contador + 1 ) { 
// System.out.println(contador);
// for é quase a mesma coisa que um "while" porém tudo em apenas uma só linha 

// a = a+1; é a mesma coisa que a +=1;
//(contador + 1) é igual a (++contador) ------- O ++ antes do contador é para a "conta" ser incrementada antes de saber se é válido ou não
