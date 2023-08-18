
public class CD extends Item{
	private String artista;
	private int numeroFaixas;
	private String gravadora;
	
	public CD() {
		
	}
	
	public CD(int codigo, String titulo, String artista, int numeroFaixas, String gravadora) {
		this.artista = artista;
		this.numeroFaixas = numeroFaixas;
		this.gravadora = gravadora;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	
	
}
