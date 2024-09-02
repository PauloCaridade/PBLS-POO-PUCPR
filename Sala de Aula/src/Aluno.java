import java.util.Random;

public class Aluno {

    private String nome;
    private int idade;
    private  final int matricula;
    private int anoIngresso;
    private String email;

    public Aluno(String nome, int idade,int anoIngresso, String email) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setAnoIngresso(anoIngresso);
        this.setEmail(email);
        this.matricula = gerarNumeroMatricula();
    }

    private int gerarNumeroMatricula(){
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public int getAnoIngresso(){
        return this.anoIngresso;
    }

    public String getEmail(){
        return this.email;
    }

    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }

    public void setIdade(int idade){
        this.idade = idade;
    }


    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
