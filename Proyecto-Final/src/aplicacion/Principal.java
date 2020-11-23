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
			
//System.out.println("Bienvenido quiere ver el catalogo o añadir un producto"
//		+ "Ver catálogo = 1" + "\nAñadir un pruducto = 2");
//Scanner sc = new Scanner(System.in);
//int respuesta = sc.nextInt();
//respuestaUsuario = respuesta;
//if(respuesta == 2) {
	
//}
//if (respuesta == 1) {
	
//}		


