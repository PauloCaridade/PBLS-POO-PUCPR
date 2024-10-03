public abstract class ItemBibliotecaDigital {

    private String titulo;
    private String autor;

    public ItemBibliotecaDigital(String titulo, String autor){
        this.setTitulo(titulo);
        this.setAutor(autor);
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public abstract void descricao(String descricao);
}
