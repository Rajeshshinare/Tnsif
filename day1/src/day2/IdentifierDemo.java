package day2;

public class IdentifierDemo {

	public static void main(String[] args) {
//		int for = 23; error bcoz keyword cannot be declare as variable
//		int num 1 = 2; error bcoz of space
//		int @num = 12; Special are not allowed only $ and _ are allowed
		
//		valid declaration 
		int num;
//		valid identification 
		int $num1 = 23;
		String StudentName = "Hii Rajesh";
		int FOR = 45;
		System.out.println("Values of the number variable is "+$num1);
		System.out.println("Student name is "+StudentName);
		int w = 6743;
		System.out.println("Values of the number variable is "+w);
	}
	

}
