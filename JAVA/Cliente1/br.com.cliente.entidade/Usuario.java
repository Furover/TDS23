
public class Usuario {
	protected int id;
	protected String name;
	protected String email;
	protected String pais;
	
	public Usuario() {
	}
	public Usuario(String name, String email, String pais) {
		this.name = name;
		this.email = email;
		this.pais = pais;
	}
	public Usuario(int id,String name, String email, String pais) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
