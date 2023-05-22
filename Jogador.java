public class Jogador {
  public int casaAtual;
  public int meuNumero;

  public Jogador(int numeroJogador) {
    meuNumero = numeroJogador;
    casaAtual = 0;
  }

  public void jogar(Dado dado) {
    dado.rolar();
    casaAtual += dado.numeroAtual;
  }
}
