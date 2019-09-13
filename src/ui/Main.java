package ui;
import java.io.*;
import java.util.Scanner;


public class Main {
	
	Scanner sc = new Scanner(System.in);
	
	static void initialize() throws IOException {
		
		File file = new File("");
		FileReader fr = new FileReader(file);
		BufferedReader brFile = new BufferedReader(fr);
		
		
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader brConsole = new BufferedReader(isr);
		
		
		int edad = brConsole.read();
		
		
	}
	
	
	public static void main(String[] args) {
	
		
		Main menu = new Main();
		
		initialize();
	}

}
