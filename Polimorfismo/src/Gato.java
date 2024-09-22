public class Gato extends Animal{

    private boolean ronronar;

    public Gato(String tipo, int idade, double peso, boolean ronronar){
        super(tipo,idade,peso);
        this.setRonronar(ronronar);
    }

    public boolean getRonronar(){
        return this.ronronar;
    }

    public void setRonronar(boolean ronronar){
        this.ronronar = ronronar;
    }

    @Override
    public void emitirSom(){
        System.out.println("O gato está miando: Miau!!!");
    }

    public void estaRonronando(){
        if(ronronar){
            System.out.println("O gato está ronronando");
        }
        else{
            System.out.println("O gato não está ronronando");
        }
    }

}
