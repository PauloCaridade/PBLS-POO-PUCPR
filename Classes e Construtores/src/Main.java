public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Matheus",25,1.75,80,"Advogado");
        System.out.println();
        System.out.println(pessoa1.toString());
        System.out.println();
        pessoa1.trabalhar();
        System.out.println();

        Pessoa pessoa2 = new Pessoa("Pedro",30,1.90,90,"Engenheiro");
        System.out.println(pessoa2.toString());
        System.out.println();
        pessoa2.abrirPorta();
        System.out.println();

        Pessoa pessoa3 =  new Pessoa("João",45,1.85,82,"Médico");
        System.out.println(pessoa3.toString());
        pessoa3.tomarAgua();
        System.out.println();

    }

}