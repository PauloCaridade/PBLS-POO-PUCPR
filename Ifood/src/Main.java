import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario("João",25,"Masculino","joão@gmail.com","12345");
        Usuario usuario2 = new Usuario("Gabriela",22,"Feminino","gabi@hotmail.com","54321");
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        Usuario usuario3 = new Usuario("Sofia",18,"Feminino","sof@gmail.com","soso1010");
        Usuario usuario4 = new Usuario("Leonardo",30,"Masculino","leon@gmail.com","12345");

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }

        Admin admin = new Admin("Jozé",45,"Masculino","zeze@outlook.com","123@456",
                "Admin");

        admin.adicionarUsuario(usuario3,usuarios);
        admin.adicionarUsuario(usuario4,usuarios);

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }

        admin.removerUsuario(usuario1,usuarios);

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }

    }

}
