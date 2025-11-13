import java.util.ArrayList;
import java.util.List;

public class Agenda {
//    Exercicio 20: Faça Agenda que armazena contatos em uma lista.

    private List<Contato> contatos = new ArrayList<>();

    public Agenda() {
    }

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void addContato(Contato contato){
        contatos.add(contato);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Contato c : contatos){
            sb.append(c.getNome());
            sb.append(", "+ c.getTelefone());
            sb.append(", "+c.getEmail());
            sb.append(", ");
        }
        sb.append("], ");

        return sb.toString();
    }
}
