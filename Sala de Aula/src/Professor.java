import java.util.Random;

public class Professor {

    private String nome;
    private int idade;
    private String disciplinaMinistrada;
    private final int codigo;

    public Professor(String nome, int idade, String disciplinaMinistrada){
        this.nome = nome;
        this.idade = idade;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.codigo = gerarCodigoProfessor();
    }

    private int gerarCodigoProfessor(){
        Random rand = new Random();
        return rand.nextInt(9999);
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getDisciplinaMinistrada(){
        return this.disciplinaMinistrada;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada){
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

}
