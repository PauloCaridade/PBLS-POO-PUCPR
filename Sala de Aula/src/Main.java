import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Disciplina disciplina = null;
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        Professor professor = null;
        Aluno aluno = null;
        int opcao;

        while(true){
            System.out.println("\n################## SALA DE AULA ##################\n");
            System.out.print("1. Matricular Aluno\n2. Adicionar Disciplina\n3. Listar Alunos Por Disciplina\n4. Mostrar Infos da Disciplina\n5. Listar Disciplinas\n" +
                    "6. Mostrar Informação Dos Alunos Por Disciplina\n7. Alterar Info do Aluno\n8. Sair\n\nOpção: ");
            opcao = sc.nextInt();
            System.out.println();

            switch(opcao){
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Idade do aluno: ");
                    int idade = sc.nextInt();
                    System.out.print("Ano de Ingresso: ");
                    int anoIngresso = sc.nextInt();
                    sc.nextLine();
                    System.out.print("E-mail: ");
                    String email = sc.nextLine();
                    System.out.print("Disciplina do aluno: ");
                    String disciplinaAluno = sc.nextLine();
                    aluno = new Aluno(nome,idade,anoIngresso,email);
                    for(int i = 0; i < disciplinas.size(); i++){
                        if(disciplinas.get(i).getNome().equals(disciplinaAluno)){
                            disciplinas.get(i).cadastrarAluno(aluno);
                            disciplinas.get(i).setVagas(disciplinas.get(i).getVagas() - 1);
                        }
                    }
                    break;

                    case 2:
                        System.out.print("Nome da disciplina: ");
                        sc.nextLine();
                        String nomeDisciplina = sc.nextLine();
                        System.out.print("Numero de créditos: ");
                        int numeroCreditos = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Numero de vagas: ");
                        int numeroVagas = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nome do professor: ");
                        String nomeProfessor = sc.nextLine();
                        System.out.print("Idade do professor: ");
                        int idadeProfessor = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Disciplina ministrada: ");
                        String disciplinaMinistrada = sc.nextLine();
                        professor = new Professor(nomeProfessor,idadeProfessor,disciplinaMinistrada);
                        disciplina = new Disciplina(nomeDisciplina,professor,numeroCreditos,numeroVagas);
                        disciplinas.add(disciplina);
                        break;

                        case 3:
                            if(!disciplinas.isEmpty()){
                                System.out.println("Selecione a disciplina");
                                for(int i = 0; i < disciplinas.size(); i++){
                                    System.out.print(disciplinas.get(i).getNome()+ "\n");
                                }
                                break;
                            }
                            else{
                                System.out.println("Não há disciplinas cadastradas.");
                            }
                            break;

            }
        }



    }

}
