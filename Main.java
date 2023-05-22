import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int numeroJogadores = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de jogadores:"));
    int numeroCasas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de casas do tabuleiro:"));
2
    Jogo jogo = new Jogo(numeroJogadores, numeroCasas);

    while (true) {
      jogo.proximaJogada();
      int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar jogando?", "Jogo de Tabuleiro", JOptionPane.YES_NO_OPTION);
      if (opcao == JOptionPane.NO_OPTION) {
        break;
      }
    }
  }
}
