import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nomeCompleto = JOptionPane.showInputDialog("Digite o nome completo:");

        NomeFactory aplicacaoNormal = new NomeUltimoPrimeiro();
        NomeFactory aplicacaoInvertido = new NomePrimeiroUltimo();

        int pos = nomeCompleto.indexOf(",");
        if (pos != -1) {
            aplicacaoInvertido.adicionarNome(nomeCompleto);
        } else {
            aplicacaoNormal.adicionarNome(nomeCompleto);
        }

        aplicacaoNormal.imprimirNomes();
        aplicacaoInvertido.imprimirNomes();
    }
}