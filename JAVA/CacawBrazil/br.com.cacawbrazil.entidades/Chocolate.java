public class Chocolate {
    protected int id;
    protected String nome;
    protected String tipo;
    protected String marca;
    protected String dataVal;
    protected Double preco;
    protected String img;
    
    public Chocolate() {
	}
	public Chocolate(String nome, String tipo, String marca, String dataVal, Double preco, String img) {
		this.nome = nome;
		this.tipo = tipo;
		this.marca = marca;
		this.dataVal = dataVal;
		this.preco = preco;
		this.img = img;
	}
	public Chocolate(int id,String nome, String tipo, String marca, String dataVal, Double preco, String img) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.marca = marca;
		this.dataVal = dataVal;
		this.preco = preco;
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDataVal() {
		return dataVal;
	}
	public void setDataVal(String dataVal) {
		this.dataVal = dataVal;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}