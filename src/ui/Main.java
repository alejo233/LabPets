package ui;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import model.Club;
import model.Principal;


public class Main {
	
	private Principal principal;
	
	
	public Main() {
		principal=new Principal();
		options();
	}
	
	
	static void initialize() throws IOException {
		
		File file = new File("");
		FileReader fr = new FileReader(file);
		BufferedReader brFile = new BufferedReader(fr);
		
		
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader brConsole = new BufferedReader(isr);
		
		
		int edad = brConsole.read();
		
		
	}
	
	public void options() {
		Scanner entrada = new Scanner(System.in);
		int op;
		System.out.println("********************************");
		System.out.println("*****Welcome to the program*****");
		System.out.println("********************************");
		System.out.println("\n");
		String output = "1. Register a Club.\n" + "2. Register an Owner\n"
				+ "3. Register a Pet\n"
				+ "4. Search any Club\n" + "5. Search any owner\n"
				+ "6. Search any Pet\n" +"7.Sort by some desired criteria\n"+ "8. Exit\n" + "\nType your option [1 - 8]: ";

		do {
			System.out.println(output);
			op = entrada.nextInt();

			switch (op) {
			case 1:
				System.out.println("\nRegister a Club.\n");
				request1();
				break;
			case 2:
				System.out.println("\nRegister an Owner.\n");
	//			request2();
				break;
			case 3:
				System.out.println("\nRegister a Pet.\n");
		//		request3();
				break;
			case 4:
				System.out.println("\nSearch any Club.\n");
			//	request4();
				break;
			case 5:
				System.out.println("\nSearch any owner.\n");
			//	request5();
				break;
			case 6:
				System.out.println("\nSearch any Pet.\n");
				//request6();
				break;
			case 7:
				System.out.println("\nSort by some desired criteria.\n");
				//request7();
				break;
			case 8:
				System.out.println("\nExit.");
				break;
			default:
				System.out.println("\nOption error.");
			}
			System.out.println("\n\n=============================================\n\n");

		} while (op != 8);
	}


	public void request1() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Type id club: ");
		String id = entrada.nextLine();
		System.out.println("Type names Club: ");
		String name = entrada.nextLine();
		System.out.println("Type club creation date : ");
		String date = entrada.nextLine();
		System.out.println("Type kind pet : ");
		String pet = entrada.nextLine();
		ArrayList<Club> expected = new ArrayList<Club>();

	}
	
	public static void main(String[] args) {
	
		
		Main menu = new Main();
		

	}

}
