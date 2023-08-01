
public class Livro extends Item {

	private String autor;
	private String editora;
	private int numeroPaginas;
	
	public Livro(int codigo, String titulo, String autor, String editora, int numeroPaginas) {
		this.autor = autor;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
	}
	public Livro() {
		
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
}
