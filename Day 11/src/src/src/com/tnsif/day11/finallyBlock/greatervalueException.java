package src.src.com.tnsif.day11.finallyBlock;

public class greatervalueException extends Exception {

	public greatervalueException (String string) {
		
		super(string);
		
	}
	
	public greatervalueException() {
		
		super("Percentage should not be more than 100..!");
	}
}
