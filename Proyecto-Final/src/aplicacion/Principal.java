package aplicacion;
import java.util.Scanner;
import interfaz.Interfaz;
public class Principal{
	int respuestaUsuario = 0;
	
	public static void main(String[] args){
		String sentencia = "";
		for(int i = 0; i< args.length; i++){
			sentencia += args[i] + " ";
		}
		
		Interfaz.procesarPeticion(sentencia);
		
	}
}
		


