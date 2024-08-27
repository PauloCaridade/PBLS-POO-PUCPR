public class Conta {

    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {

    }

    public double saque(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente.");
            return 0;
        }
        else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return valor;
        }
    }

    public void deposito(double valor){
        if (valor > 0){
            this.saldo = valor;
            System.out.println("Deposito realizado com sucesso.");
        }
        else{
            System.out.println("você precisa depositar um valor maior que R$ 0,00.");
        }

    }

    public void extratoConta(){
        System.out.println("EXTRATO: R$ " + this.saldo);
    }

}
