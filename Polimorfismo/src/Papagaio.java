public class Papagaio extends Animal{

    private double tamanhoAssas;

    public Papagaio(String tipo, int idade, double peso, double tamanhoAssas){
        super(tipo,idade,peso);
    }

    public double getTamanhoAssas(){
        return this.tamanhoAssas;
    }

    public void setTamanhoAssas(double tamanhoAssas){
        this.tamanhoAssas = tamanhoAssas;
    }

    @Override
    public void emitirSom(){
        System.out.println("O papagaio está cantando: Arreh! Arreh!");
    }

    public void voar(){
        System.out.println("O papagaio está voando, e suas assas tem um tamanho de " + this.getTamanhoAssas() + "centímetros");
    }
}
