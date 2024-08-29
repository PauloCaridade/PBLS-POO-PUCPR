import java.util.ArrayList;
import java.util.Random;

public class Disciplina {

    private String nome;
    private int codigoDisciplina;
    int creditos;
    private Professor professor;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina(String nome, Professor professor, Aluno aluno) {
        this.setNome(nome);
        this.setProfessor(professor);
        this.alunos.add(aluno);
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

    public ArrayList<Aluno> getAlunos(){
        return this.alunos;
    }

    public Aluno getAluno(String nome){
        for(Aluno aluno : this.alunos){
            if(aluno.getNome().equals(nome.toLowerCase())){
                return aluno;
            }
        }
        return null;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public void setCreditos(int creditos){
        this.creditos = creditos;
    }

}
