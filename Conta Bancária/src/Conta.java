public class Conta {

    private Pessoa cliente;
    private double saldo;

    public Conta(Pessoa cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Conta(Pessoa cliente) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void saque(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente.");
        }
        else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        if (saldo > 0){
            this.saldo = saldo;
            System.out.println("Deposito realizado com sucesso.");
        }
        else{
            System.out.println("você precisa depositar um valor maior que R$ 0,00.");
        }

    }

    public void extratoConta(){
        System.out.println("Cliente: " + this.cliente.getNome() + " " + "\nSaldo: R$ " + this.saldo);
    }

    public void alterarDadosCliente(String nome,int idade,String genero,String cpf){
        this.cliente.alterarDadosPessoa(nome, idade, genero, cpf);
    }

}
