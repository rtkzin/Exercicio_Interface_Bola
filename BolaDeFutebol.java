public class BolaDeFutebol extends Bola{
    public BolaDeFutebol(String nomeDaMarca) {
        super(nomeDaMarca);
   }
   public void lancar() {
    System.out.println("Bolas de futebol da marca " + getNomeDaMarca() + " são rápidas...");
   }
   public void quicar() {
    System.out.println("Bolas de futebol quicam muito...");
   }
}
