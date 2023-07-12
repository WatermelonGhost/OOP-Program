package multi;

public class MultipleSimulator {

	public static void main(String[] args) {
		Multiple multiple = new Multiple_imp();
		
		int start = multiple.start();
		int end = multiple.end();
		
		multiple.even(start,end);

		multiple.odd(start,end);
	}

}
