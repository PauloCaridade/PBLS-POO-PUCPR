import java.util.ArrayList;
import java.util.Random;

public class Disciplina {

    private String nome;
    private final int codigoDisciplina;
    private int creditos;
    private int vagas;
    private Professor professor;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina(String nome, Professor professor, int creditos, int vagas) {
        this.setNome(nome);
        this.setProfessor(professor);
        this.setCreditos(creditos);
        this.setVagas(vagas);
        this.codigoDisciplina = gerarCodigoDisciplina();
    }

    private int gerarCodigoDisciplina() {
        Random ran = new Random();
        return ran.nextInt(9999);
    }

    public String getNome(){
        return this.nome;
    }

    public int getCodigoDisciplina(){
        return this.codigoDisciplina;
    }

    public int getCreditos(){
        return this.creditos;
    }

    public Professor getProfessor(){
        return this.professor;
    }

    public int getVagas(){
        return this.vagas;
    }

    public void mostrarAlunos(){
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    public Aluno getAluno(String nome){
        for(Aluno aluno : this.alunos){
            if(aluno.getNome().equals(nome.toUpperCase())){
                return aluno;
            }
        }
        return null;
    }


    @Override
    public String toString(){
        return "Nome da Disciplina: " + this.nome + " " + "Código: " + this.codigoDisciplina + " " +
                "Número de Créditos: " + this.creditos + " " + "Vagas: " + this.vagas + "Professor: " + this.professor;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public void setVagas(int vagas){
        this.vagas = vagas;
    }

    public void setCreditos(int creditos){
        this.creditos = creditos;
    }

    public void cadastrarAluno(Aluno aluno){
        if(aluno != null){
            this.alunos.add(aluno);
        }
        else{
            System.out.println("ALUNO INEXISTENTE!!!");
        }
    }

}
