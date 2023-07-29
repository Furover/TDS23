
public class CD {
	private String titulo;
	private String artista;
	private int numeroFaixa;
	private String gravadora;
	
	public CD() {
		
	}
	
	public CD(int codigo, String titulo, String artista, int numeroFaixa, String gravadora) {
		this.titulo = titulo;
		this.artista = artista;
		this.numeroFaixa = numeroFaixa;
		this.gravadora = gravadora;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNumeroFaixa() {
		return numeroFaixa;
	}

	public void setNumeroFaixa(int numeroFaixa) {
		this.numeroFaixa = numeroFaixa;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
