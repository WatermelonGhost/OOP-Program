package Multiple;

public class Mul_table {
	private int i;
	
	void mul_t(int i) {
		this.setI(i);
		System.out.println("["+i+"x]");
		for(int j =1; j<11;j++) {
			System.out.println(i+"x"+j+"="+(i*j));
		}
		System.out.println("finished");
	}
	
	void mul_t_full(int i) {
		this.setI(i);
		for(int m = 1;m<=i;m++) {
			System.out.println("["+m+"x]");
			for(int j = 1; j<11; j++) {
				System.out.println(m+"x"+j+"="+(m*j));
			}
		}
		System.out.println("finished");
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
