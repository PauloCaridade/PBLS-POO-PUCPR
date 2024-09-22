public class Animal {

    protected String tipo;
    protected int idade;
    protected double peso;

    public Animal(String tipo, int idade, double peso){
        this.setTipo(tipo);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    public Animal(){

    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void emitirSom(){
        System.out.println("Animal emitindo som...");
    }

    public void comer(){
        System.out.print("Animal comendo...");
    }

}
