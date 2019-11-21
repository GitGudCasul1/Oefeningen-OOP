package arrays;

public class OefeningArray {
	int[] array1 = new int[10];

	public static void main(String[] args) {
		OefeningArray Array = new OefeningArray();
		
		Array.array();
		Array.print();
		}
	
	public void array(){
		
		for(int i = 0; i < 10; i++) {
			array1[i] = i + 1;			
			}
	}
	
	public void print(){
		for(int i = 0; i < 10; i++) {
			System.out.println(array1[i]);
		}
	}	
	
	}

