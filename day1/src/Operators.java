
public class Operators {
	public static void main(String[] args) {
		
//		int a = 10;
		
//		System.out.println(++a); //Pre increment first addition by plus 1 then using number
		
//		System.out.println(a++);  // Post increment first using the number then adding plus 1 if required
		
//							11		12		13		14		14
//		System.out.println((a++) + (++a) - (a++) + (++a) - (a));
//							10	 +	12	 -  12 	 +	14	 - 	14
		
		
//		int a = -1; int b = 1; int c = 0;
		
		
//	System.out.println((--c) + (++b) - (a++) -(++b) + (b++) - (a) + (--a) + (--c) + (c++) + (--c) - (++b) + (c) + (b--));
		
		int a = 10;
		int b = 20;
		int x = 10;
		
		System.out.println("A and B value before the operation : "+ a +" "+b);
		
		++a;
		
		int c = ++a + b + a--;
		System.out.println("C value after the operation : "+c);
		
		int d = c++ + a + b--;
		System.out.println("D value after the operation : "+d);
		
		
		
	}
}
