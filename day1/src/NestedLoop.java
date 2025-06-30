
public class NestedLoop {
	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 5;
		
		System.out.print("The largest no is: ");
		
		if(a>b) {
			if(a>c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			System.out.println(b);
		}
	}
}
