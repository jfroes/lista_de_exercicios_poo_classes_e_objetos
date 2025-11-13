public class Livro {
//    Exercicio 08: Faça Livro com exibirDetalhes().

    private String titulo;
    private String autor;
    private Integer ano;
    private String isbn;

    public Livro() {
    }

    public Livro(String titulol, String autor, Integer ano, String isbn) {
        this.titulo = titulol;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
    }

    public String getTitulol() {
        return titulo;
    }

    public void setTitulol(String titulol) {
        this.titulo = titulol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String exibirDetalhes(){
        StringBuilder sb = new StringBuilder();

        sb.append("Titulo: " + titulo);
        sb.append("\nAutor: " + autor);
        sb.append("\nAno: " + ano);
        sb.append("\nISBN: " + isbn);

        return sb.toString();
    }
}
