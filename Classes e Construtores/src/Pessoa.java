public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String profissao;


    public Pessoa(){

    }

    public Pessoa(String nome, int idade, double altura, double peso, String profissao) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setProfissao(profissao);
    }

    public Pessoa(String nome, int idade, double altura, double peso){
        this.setNome(nome);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getPeso(){
        return this.peso;
    }

    public String getProfissao(){
        return this.profissao;
    }

    @Override
    public String toString(){
        return "nome: " + this.nome + " " + "idade: " + this.idade + " " + "altura: " + this.altura + " " + "peso: " + this.peso;
    }

    public void tomarAgua(){
        System.out.println(this.nome + " Está tomando água");
    }

    public void abrirPorta(){
        System.out.println(this.nome + " Abriu a porta de casa");
    }

    public void trabalhar(){
        System.out.println(this.nome + " Está trabalhando");
    }

}