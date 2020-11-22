package dominio;

public class Zapatilla {
	private String modelo;
	private String marca;
	private String talla;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public Zapatilla(){
		marca = "";
		modelo = "";
		talla = "";
	}
	
	public Zapatilla(String modelo, String marca , String talla){
		this.marca = marca;
		this.modelo = modelo;
		this.talla = talla;
	}
	
	public String toString() {
		return "Modelo " + modelo + ", marca " + marca + ", talla " + talla + "\n";
	}
	
	
	
}
