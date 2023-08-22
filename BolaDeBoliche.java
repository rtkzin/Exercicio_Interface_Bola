public class BolaDeBoliche extends Bola {
   public BolaDeBoliche(String nomeDaMarca) {
        super(nomeDaMarca);
   }
   public void lancar() {
    System.out.println("Bolas de boliche da marca " + getNomeDaMarca() + " são boas para lançar...");
   }
   public void quicar() {
    System.out.println("Bolas de boliche não quicam muito...");
   }
}
