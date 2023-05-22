public class Dado {
  public int numeroAtual;
  
  public Dado() {
    numeroAtual = 1;
  }
  
  public void rolar() {
    numeroAtual = (int) (Math.random() * 5 + 1);
  }
}
