public class VideoDigital extends ItemBibliotecaDigital implements Vizualizavel, Baixavel{

    public VideoDigital(String titulo, String autor){
        super(titulo,autor);
    }

    public void descricao(String descricao){
        System.out.println(descricao);
    }

    public void baixar(){
        System.out.println("Video " + super.getTitulo() + " " + "do autor " + super.getAutor() + " " + "baixado.");
    }

    public void visualizar(){
        System.out.println("Video " + super.getTitulo() + " " + "visualizado");
    }
}
