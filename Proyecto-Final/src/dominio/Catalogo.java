package dominio;

import java.util.ArrayList;

public class Catalogo {
	private ArrayList<Zapatilla> coleccionZapatillas = new ArrayList<>();

	public void annadirZapatilla(Zapatilla zapatilla){
		coleccionZapatillas.add(zapatilla);
	}

	public String toString(){
		StringBuilder datos = new StringBuilder();
		for (Zapatilla zapatilla : coleccionZapatillas){
			datos.append(zapatilla);
		}
		return datos.toString();
	}
}
