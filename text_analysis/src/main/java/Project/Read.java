package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
	
	public String readData(String name) {
		
		Scanner scanner = null;
		
		File file = new File(name);
		
		String ausgabe="";
		
		try{
			scanner = new Scanner(file);
		}catch(FileNotFoundException e){
			System.out.println("Fehler: Datei wurde nicht gefunden!");
		}
		while (scanner.hasNextLine()){
			ausgabe=ausgabe+scanner.nextLine();
		}
		return ausgabe;
        
	}

}
