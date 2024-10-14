import javax.swing.JOptionPane;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        LivroDeNotas livro1 = new LivroDeNotas();

        livro1.exibirMensagem("Programação");

        String nomeCurso = 
            JOptionPane.showInputDialog("Digite o nome" + "do curso");
        livro1.exibirMensagem(nomeCurso);
    }

}
