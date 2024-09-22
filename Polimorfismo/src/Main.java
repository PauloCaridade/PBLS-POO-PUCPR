public class Main {

    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Cachorro", 3, 55.5, "Golden Retriever");
        Animal gato = new Gato("Gato", 1, 12.5, true);
        Animal papagaio = new Papagaio("Ave", 25, 3.5, 15);

        if(cachorro instanceof Cachorro){
            ((Cachorro) cachorro).cavarBurraco();
        }

        if(gato instanceof Gato){
            ((Gato) gato).estaRonronando();
        }

        if(papagaio instanceof Papagaio){
            ((Papagaio) papagaio).voar();
        }

        somAnimais(cachorro);
        somAnimais(gato);
        somAnimais(papagaio);
    }

    public static void somAnimais(Animal animal){
        animal.emitirSom();
    }
}
