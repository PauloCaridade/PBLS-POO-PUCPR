public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String tipo, int idade, double peso, String raca){
        super(tipo,idade,peso);
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public void emitirSom(){
        System.out.println("O cachorro está latindo: Au Au!!!");
    }

    public void cavarBurraco(){
        System.out.println("O cachorro está cavando um burraco no quintal!");
    }

}
