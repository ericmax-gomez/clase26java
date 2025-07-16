package modelo;

public class Login {
	private int id;
	private String usuario;
	private String clave;
	private int dniPersona;
	
	public Login(String usuario, String clave, int dniPersona) {
		this.usuario = usuario;
		this.clave = clave;
		this.dniPersona = dniPersona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getDniPersona() {
		return dniPersona;
	}

	public void setDniPersona(int dniPersona) {
		this.dniPersona = dniPersona;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", usuario=" + usuario + ", clave=" + clave + ", dniPersona=" + dniPersona + "]";
	}
	
	
	
}
