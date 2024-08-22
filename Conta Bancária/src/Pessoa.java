import java.util.Scanner;

public class Pessoa {

    private String nome;
    private int idade;
    private String genero;
    private String cpf;

    public Pessoa(String nome, int idade, String genero, String cpf) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setGenero(genero);
        this.setCpf(cpf);
    }

    public Pessoa() {

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setIdade(int idade) {
        Scanner sc = new Scanner(System.in);
        this.idade = idade;
        while(this.idade < 18){
            System.out.println("Você precisa ser maior de idade para fazer o cadastro!!!");
            System.out.print("Digite uma idade válida: ");
            int idadeValida = sc.nextInt();
            this.idade = idadeValida;
        }
    }

    public void setGenero(String genero) {
        genero = genero.toUpperCase();
        if (genero.equals("M")){
            this.genero = "Masculino";
        }
        else if(genero.equals("F")){
            this.genero = "Feminino";
        }
    }

    public void setCpf(String cpf) {
        Scanner sc = new Scanner(System.in);
        this.cpf = cpf;
        while (this.cpf.length()!= 11){
            System.out.println("CPF inválido!!!");
            System.out.print("Digite um CPF válido: ");
            String cpfValido = sc.nextLine();
            this.cpf = cpfValido;
        }
    }

    public String dadosPessoa(){
        return "nome: " + this.getNome() + "\n" + "idade: " + this.getIdade() + "\n" + "Gênero: " + this.getGenero() + "\n" + "CPF: " + this.getCpf();
    }

    public void alterarDadosPessoa(String nome, int idade, String genero, String cpf){
        this.setNome(nome);
        this.setIdade(idade);
        this.setGenero(genero);
        this.setCpf(cpf);
    }

}