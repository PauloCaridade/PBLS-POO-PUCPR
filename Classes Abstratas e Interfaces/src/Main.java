import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ItemBibliotecaDigital> itens = new ArrayList<>();

        ItemBibliotecaDigital ebook1 = new Ebook("Harry Potter e a pedra filosofal","J.K Rowling");
        ItemBibliotecaDigital ebook2 = new Ebook("Harry Potter e a câmara secreta", "J.K Rowling");
        // ItemBibliotecaDigital ebook3 = new Ebook("Harry Potter e o prisioneiro de Azkaban","J.K Rowling");


        ItemBibliotecaDigital video1 = new VideoDigital("Análise do livro Os Demônios", "Fiódor Dostoiévski");
        ItemBibliotecaDigital video2 = new VideoDigital("Análise do livro Dom Casmurro", "Machado de Assis");
        // ItemBibliotecaDigital video3 = new VideoDigital("Análise do livro: Anna Karenina", "Liev Tolstói");

        
        itens.add(ebook1);
        itens.add(ebook2);
        itens.add(video1);
        itens.add(video2);

        for(var item : itens){
            if(item instanceof Baixavel ){
                ((Baixavel)item).baixar();
                System.out.println();
            }
            if(item instanceof Vizualizavel){
                ((Vizualizavel)item).visualizar();
                System.out.println();
            }
        }


    }



}