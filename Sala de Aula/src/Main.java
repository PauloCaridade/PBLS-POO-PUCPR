import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor professor1 = new Professor("Pedro",35,"Direito");
        Professor professor2 = new Professor("João",45,"Engenharia Civil");
        Professor professor3 = new Professor("Maria",55,"Ciência da Computação");
        Disciplina disciplina1 = new Disciplina("DIREITO",professor1,4,30);
        Disciplina disciplina2 = new Disciplina("ENGENHARIA CIVIL",professor2,4,40);
        Disciplina disciplina3 = new Disciplina("CIÊNCIA DA COMPUTAÇÃO",professor3,4,35);
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);
        disciplinas.add(disciplina3);
        Aluno aluno = null;

        int opcao;

        while(true){
            System.out.println("\n################## SALA DE AULA ##################\n");
            System.out.print("1. Matricular Aluno\n2. Listar Alunos Por Disciplina\n3. Mostrar Infos da Disciplina\n4. Listar Disciplinas\n" +
                    "5. Mostrar Informação Dos Alunos Por Disciplina\n6. Alterar Info do Aluno\n7. Sair\n\nOpção: ");
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
                    String disciplinaAluno = sc.nextLine().toUpperCase();
                    aluno = new Aluno(nome,idade,anoIngresso,email);
                    for(Disciplina disciplina : disciplinas){
                        if(disciplina.getNome().equals(disciplinaAluno)){
                            disciplina.cadastrarAluno(aluno);
                        }
                    }
                    break;

                case 2:
                    for(Disciplina disciplina : disciplinas){
                        System.out.println(disciplina.getNome());
                    }
                    System.out.print("Selecione a disciplina: ");
                    String disciplinaSelecionada = sc.nextLine().toUpperCase();
                    sc.nextLine();
                    for(Disciplina disciplina : disciplinas){
                        if(disciplina.getNome().equals(disciplinaSelecionada)){
                            disciplina.mostrarAlunos();
                        }
                    }
                    break;

            }
        }



    }

}
