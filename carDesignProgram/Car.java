import java.util.Scanner;

public class Car {
	Scanner n = new Scanner(System.in);
	//car_spec
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	//car_state
	private int curSpeed;
	//car_parts
	private String body;
	private String engine;
	private String tier;
	
	void car_info_input() {
		System.out.println(" ���� ������ �Է��Ͻÿ�.\n �� ȸ�� : ");
		String com = n.nextLine();
		this.setCompany(com);
		
		System.out.println(" �� �� : ");
		String mod = n.nextLine();
		this.setModel(mod);
		
		System.out.println(" �� �÷� : ");
		String col = n.nextLine();
		this.setColor(col);
		
		System.out.println(" �� �ְ� �ӷ� : ");
		int maxS = n.nextInt();
		this.setMaxSpeed(maxS);
		
		System.out.println(" �� ��ü : ");
		String bod = n.next();
		this.setBody(bod);
		
		System.out.println(" �� ���� : ");
		String eng = n.next();
		this.setEngine(eng);
		
		System.out.println(" �� Ÿ�̾�: ");
		String ti = n.next();
		this.setTier(ti);
		
		System.out.println(" �� ���� �ӷ� : ");
		int curS = n.nextInt();
		this.setCurSpeed(curS);
		
	}
	void car_info() {
		System.out.println(" ȸ�� : "+this.getCompany());
		System.out.println(" �� : "+this.getModel());
		System.out.println(" �÷� : "+this.getColor());
		System.out.println("�ְ� �ӷ� : "+this.getMaxSpeed());
		System.out.println(" ��ü : "+this.getBody());
		System.out.println(" ���� : "+this.getEngine());
		System.out.println(" Ÿ�̾� : "+this.getTier());
		System.out.println("���� �ӷ� : "+this.getCurSpeed());
	}
	
	void reset_save() {
		
	}
	
	void reset_each() {
		
	}
	
	void drive(int speed) {
		
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getCurSpeed() {
		return curSpeed;
	}

	public void setCurSpeed(int curSpeed) {
		this.curSpeed = curSpeed;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}
	
}
