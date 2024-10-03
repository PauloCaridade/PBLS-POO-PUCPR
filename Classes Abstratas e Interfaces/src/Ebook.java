public class Ebook extends ItemBibliotecaDigital implements Baixavel{

    public Ebook(String titulo, String autor){
        super(titulo,autor);
    }

    @Override
    public void descricao(String descricao){
        System.out.println(descricao);
    }

    @Override
    public void baixar(){
        System.out.println("Livro " + super.getTitulo() + " " + "Baixado com sucesso.");
    }

}
