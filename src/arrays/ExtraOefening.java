package arrays;

public class ExtraOefening {
	
	public static void main(String[] args) {
		ExtraOefening array = new ExtraOefening();
	
			array.omgedraait("abcdefghijklmnopqrstuvwxyz");
			array.onevenGetallen();
			array.evenGetallen();
		}		
	
	public void omgedraait(String a) {
		String txt = a;
		String Newtxt = "";
		
		for(int i = txt.length() - 1; i >= 0; i--) {
			Newtxt = Newtxt + a.charAt(i);
		}
		System.out.println(Newtxt);
	}
	
	public void onevenGetallen() {
		String oneven = "";
		
		for(int i = 1; i < 101; i++) {
			if(i % 2 > 0) {
				oneven = oneven + i + " ";
			}
		}
		System.out.println(oneven);
	}
	
	public void evenGetallen() {
		String even = "";
		
		for(int i = 100; i >= 0; i--)	{
			if(i % 2 == 0 && i != 0) {
				even = even + i + " ";
			}
		}
		System.out.println(even);
	}
	
}
