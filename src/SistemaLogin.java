import java.util.Objects;

public class SistemaLogin {
//    Exercicio 19: Implemente SistemaLogin com autenticar(usuario, senha).

    private String usuario;
    private String senha;

    public SistemaLogin() {
    }

    public SistemaLogin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean autenticar(String usuario, String senha){
        return Objects.equals(this.usuario, usuario) && Objects.equals(this.senha, senha);
    }
}
