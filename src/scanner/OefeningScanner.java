package scanner;

import java.util.Scanner;

public class OefeningScanner {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		OefeningScanner os = new OefeningScanner();
		os.readinput();
	}
	
	private void readinput() {
		System.out.println("Naam: ");
		String input = scanner.nextLine();
		System.out.println("Hallo, " + input);
	}
}
