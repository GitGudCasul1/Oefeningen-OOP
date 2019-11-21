
public class Oefening1 {
	public static void main(String[] args) {
		Oefening1 IfElse = new Oefening1();
		//oefening 1
		boolean ifElse1resultaat = IfElse.IfElse1(0.5);
		System.out.println(ifElse1resultaat);
		
		//oefening 2		
		IfElse2(1, 2);
		
		//oefening 3		
		IfElse3 (1, 2);
		
		//oefening 4		
		boolean IfElse4resultaat = IfElse.IfElse4 (1, 2);
		System.out.println(IfElse4resultaat);
		
		//oefening 5
		boolean IfElse5resultaat = IfElse.IfElse5(-50, 45, 10, "F");
		System.out.println(IfElse5resultaat);
	}
	
	//oefening 1
	public boolean IfElse1(double a) {
		if(a > 0 && a < 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//oefening 2
	public static void IfElse2(double a, double b) {
		if(a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
	
	//oefening 3	
	public static void IfElse3(double a, double b) {
		if(a > b) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}
	}
	
	//oefening 4
	public boolean IfElse4(int a, int b) {
		if(a > b) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//oefening 5
	public boolean IfElse5(double a, double b, double c, String d) {
		if(a < 0 && a > -100 && b > 40 && b < 50 && c > 0 && d.length() > 10 || d.length() < 2) {
			return true;
		}		
		else {
			return false;
		}
	}
}





