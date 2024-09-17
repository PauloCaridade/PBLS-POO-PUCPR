public class Usuario extends Pessoa{

    private String email;
    private String senha;

    public Usuario(String nome, int idade, String genero, String email, String senha){
        super(nome, idade, genero);
        this.setEmail(email);
        this.setSenha(senha);
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }


}
