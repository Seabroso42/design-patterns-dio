package Strategy;

public class Ser {
    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }
    public void mover(){
        strategy.mover();
    }

    public static void main(String[] args) {
        Comportamento raiva = new ComportamentoPuto();
        Comportamento padrao= new ComportamentoComum();
        Ser android = new Ser();
        android.setStrategy(padrao);
        android.mover();

        android.setStrategy(raiva);
        android.mover();
    }
}
