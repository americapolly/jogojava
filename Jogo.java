import javax.swing.JOptionPane;

public class Jogo {
  public Dado meuDado;
  public Tabuleiro meuTabuleiro;
  public int meuNumeroJogadores;
  public Jogador[] meusJogadores;
  public int proximoJogador;

  public Jogo(int numeroJogadores, int numeroCasas) {
    meuDado = new Dado();
    meuTabuleiro = new Tabuleiro(numeroCasas);
    meusJogadores = new Jogador[numeroJogadores];
    for (int i = 0; i < numeroJogadores; i++) {
      meusJogadores[i] = new Jogador(i + 1);
    }
    meuNumeroJogadores = numeroJogadores;
    proximoJogador = 0;
  }

  public void proximaJogada() {
    Jogador jogadorAtual = meusJogadores[proximoJogador];
    jogadorAtual.jogar(meuDado);

    if (jogadorAtual.casaAtual > meuTabuleiro.numeroCasas) {
      JOptionPane.showMessageDialog(null, "O Jogador " + jogadorAtual.meuNumero + " venceu!");
    }

    proximoJogador++;
    if (proximoJogador >= meuNumeroJogadores) {
      proximoJogador = 0;
    }
  }
}
