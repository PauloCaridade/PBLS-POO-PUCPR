import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Random;

public class Admin extends Usuario {

    private int codigoAdmin;
    private String nivelAcesso;

    public Admin(String nome, int idade, String genero,String email, String senha, String nivelAcesso) {
        super(nome,idade,genero,email,senha);
        this.setNivelAcesso(nivelAcesso);
        this.codigoAdmin = setCodigoAdmin();
    }

    private int getCodigoAdmin() {
        return codigoAdmin;
    }
    private int setCodigoAdmin() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public String getNivelAcesso() {
        return this.nivelAcesso;
    }

    private void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void adicionarUsuario(Usuario usuario,ArrayList<Usuario> usuarios) {
        usuarios.add(usuario);
        System.out.println("Usuário "+ usuario.getNome() + " Adicionado com sucesso.");
    }

    public void removerUsuario(Usuario usuario, ArrayList<Usuario> usuarios) {
        String usuarioRemovido = usuario.getNome();
        boolean removido = usuarios.remove(usuario);
        if (removido) {
            System.out.println("Usuário" + usuarioRemovido + " removido com sucesso.");
        }
        else{
            System.out.println("Usuário não encontrado.");
        }
    }
}
