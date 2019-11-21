
public class OefeningIfElse {
	public static void main(String[] args) {
		OefeningIfElse IfElse = new OefeningIfElse();
		boolean ifElse1resultaat = IfElse.IfElse1(0.5);
		System.out.println(ifElse1resultaat);
	}
	
	public boolean IfElse1(double a) {
		if(a > 0 && a < 1) {
			return true;
		} else {
			return false;
		}	

	}
}
