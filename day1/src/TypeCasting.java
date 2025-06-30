
public class TypeCasting {
	public static void main(String[] args) {
		
//	widening or implicit type casting
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 22.14f;
		double d = f;
		System.out.println(d);
		
//		narrowing explicit type casting
		
		double d1 = 10.52f;
		long l = (long) d1;
		System.out.println(d1);
		System.out.println(l);
		
		long l2 = 8656967997L;
		int il2 = (int) l2;
		System.out.println(il2);
		
		short a = 130;
		
		byte b1 = (byte) a;
		System.out.println(b1);
		
//		byte -128 to 127
//		130 -128 =2
	}
}
