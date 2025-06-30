
public class PrimitiveDataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte takes 1 byte
//		1 byte = 8 bits 2^8
//		256/2
//		128
		
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Min range of byte is: "+byteMin+ " Max range of byte is: "+byteMax);
		
//		short ----- 2 byte
		short ShortMax = 32767;
		short ShortMin = -32768;
		System.out.println("Min range of short is: "+ShortMin+ " Max range of short is: "+ShortMax);
		
		//int ----- 4 byte
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Min range of int is: "+minInt+ " Max range of int is: "+maxInt);
		
//		long ---- 8 byte
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		System.out.println("Min range of long is: "+minLong+ " Max range of long is: "+maxLong);

//		float ---- 4 byte
		float f = 3234.141243278345f;
		System.out.println("float value: " +f);
		
//		double ------ 8byte
		double d = 3456.14124512345678902345678914f;
		System.out.println("Double value: "+d);
		
//		boolean ------ 1 bit
		boolean flag = false;
		boolean flag2 = true;
		System.out.println("boolean can be "+flag +" or "+flag2);
	}

}
