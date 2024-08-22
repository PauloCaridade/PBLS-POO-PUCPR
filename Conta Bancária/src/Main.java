import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = null;
        Conta conta = null;

        while (true) {
            System.out.println();
            System.out.print("1 - Cadastrar\n2 - Sacar\n3 - Depositar\n4 - Extrato\n5 - Alterar Informações Cadastrais\n6 - Sair\nOpção: ");
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
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    if (conta != null) {
                        System.out.print("Insira o valor de saque: ");
                        double valorSaque = sc.nextDouble();
                        conta.saque(valorSaque);
                        break;
                    }
                    System.out.print("Não existem clientes cadastrados!!!");
                    break;
                case 3:
                    if (conta != null) {
                        System.out.print("Insira o valor de deposito: ");
                        double valorDeposito = sc.nextDouble();
                        conta.setSaldo(valorDeposito);
                        break;
                    }
                    System.out.print("Não existem contas cadastradas!!!");
                    break;
                case 4:
                    if(conta != null) {
                        conta.extratoConta();
                    }
                    break;

                case 5:
                    if(conta != null) {
                        System.out.print("Nome: ");
                        sc.nextLine();
                        String novoNome = sc.nextLine();
                        System.out.print("Idade: ");
                        int novaIdade = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Genero (M) ou (F): ");
                        String novoGenero = sc.nextLine();
                        System.out.print("CPF: ");
                        String novoCpf = sc.nextLine();
                        conta.alterarDadosCliente(novoNome,novaIdade,novoGenero,novoCpf);
                        break;
                    }
                    else{
                        System.out.print("Não existem contas cadastradas!!!");
                        break;
                    }
                case 6:
                    return;
            }


        }
    }
}