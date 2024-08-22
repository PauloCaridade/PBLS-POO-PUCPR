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
            System.out.println("Saldo insuficiente");
        }
        else {
            this.saldo -= valor;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void extratoConta(){
        System.out.println("Cliente: " + this.cliente.getNome() + " " + "Saldo:" + this.saldo);
    }

}
