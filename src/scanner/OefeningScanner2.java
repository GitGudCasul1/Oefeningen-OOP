package scanner;

import java.util.Scanner;

public class OefeningScanner2 {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		OefeningScanner2 os2 = new OefeningScanner2();
		os2.readinput();
	}
	
	private void readinput() {
		System.out.println("a + b");
		
		System.out.println("Getal a: ");
		int getal1 = scanner.nextInt();
		System.out.println("Getal b: ");
		int getal2 = scanner.nextInt();
		
		System.out.println(getal1 + getal2);
	}
}