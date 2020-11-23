package interfaz;

import dominio.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;

public class Interfaz {
	private static String HELP_TEXT = "Texto de ayuda";
	private static String NOMBRE_FICHERO = "catalogo.txt";
	
	private static void inicializarFichero(Catalogo catalogo){
		try{
			FileWriter fw = new FileWriter(NOMBRE_FICHERO);
			fw.write(catalogo.toString());
			fw.close();
		} catch (Exception e){
			System.out.println(e);
		}
	}
	
	private static Catalogo inicializarLibreta(String nombreFichero){
		Catalogo libreta = new Catalogo();
		try{
			File file = new File(nombreFichero);
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				String modelo = sc.next();
				String marca = sc.next();
				String talla = sc.next();
				Zapatilla zapatilla = new Zapatilla(modelo, marca, talla);
				libreta.annadirZapatilla(zapatilla);
			}
			sc.close();
		} catch (FileNotFoundException e){
			inicializarFichero(libreta);
		} catch (Exception e){
			System.out.println(e);
		}
		return libreta;
	}
	
	public static void procesarPeticion(String sentencia){
		String[] args = sentencia.split(" ");
		Catalogo libreta = inicializarLibreta(NOMBRE_FICHERO);
		if(args[0].equals("help")){
			System.out.println(HELP_TEXT);
		} else if (args[0].equals("list")){
			if(libreta.toString().equals("")){
				System.out.println("No hay ningún contacto en la libreta");
			} else {
				System.out.println(libreta);
			}
		} else if (args[0].equals("add")){
			Zapatilla zapatilla = new Zapatilla(args[1], args[2] , args[3]);
			libreta.annadirZapatilla(zapatilla);
			inicializarFichero(libreta);
		}
	}
	
	
	
	
	
}
