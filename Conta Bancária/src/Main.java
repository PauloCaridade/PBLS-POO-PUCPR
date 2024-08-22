import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = null;
        Conta conta = null;

        while (true) {
            System.out.println();
            System.out.println("1 - Cadastrar\n2 - Sacar\n3 - Depositar\n4 - Extrato\n5 - Alterar Informações Cadastrais\n6 - Sair\nOpção:");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Insira o nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Insira a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Insira o genero (M) ou (F): ");
                    String genero = sc.nextLine();
                    System.out.print("insira o CPF: ");
                    String cpf = sc.nextLine();
                    pessoa = new Pessoa(nome, idade, genero, cpf);
                    conta = new Conta(pessoa, 0);
                    System.out.println();
                    System.out.println(pessoa.dadosPessoa());
                    System.out.println("Conta criada!!!");
                    break;
                case 2:
                    if (conta != null) {
                        System.out.print("Insira o valor de saque: ");
                        double valorSaque = sc.nextDouble();
                        conta.saque(valorSaque);
                        conta.extratoConta();
                        break;
                    }
                    System.out.print("Não existem clientes cadastrados!!!");
                    break;
                case 3:
                    if (conta != null) {
                        System.out.print("Insira o valor de deposito: ");
                        double valorDeposito = sc.nextDouble();
                        conta.setSaldo(valorDeposito);
                        conta.extratoConta();
                        break;
                    }
                    System.out.print("Não existem contas cadastradas!!!");
                    break;
                case 4:
                    if(conta != null) {
                        conta.extratoConta();
                    }

                    break;

            }


        }
    }
}