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
		System.out.println(" 차량 정보를 입력하시오.\n ▶ 회사 : ");
		String com = n.nextLine();
		this.setCompany(com);
		
		System.out.println(" ▶ 모델 : ");
		String mod = n.nextLine();
		this.setModel(mod);
		
		System.out.println(" ▶ 컬러 : ");
		String col = n.nextLine();
		this.setColor(col);
		
		System.out.println(" ▶ 최고 속력 : ");
		int maxS = n.nextInt();
		this.setMaxSpeed(maxS);
		
		System.out.println(" ▶ 차체 : ");
		String bod = n.next();
		this.setBody(bod);
		
		System.out.println(" ▶ 엔진 : ");
		String eng = n.next();
		this.setEngine(eng);
		
		System.out.println(" ▶ 타이어: ");
		String ti = n.next();
		this.setTier(ti);
		
		System.out.println(" ▶ 현재 속력 : ");
		int curS = n.nextInt();
		this.setCurSpeed(curS);
		
	}
	void car_info() {
		System.out.println(" 회사 : "+this.getCompany());
		System.out.println(" 모델 : "+this.getModel());
		System.out.println(" 컬러 : "+this.getColor());
		System.out.println("최고 속력 : "+this.getMaxSpeed());
		System.out.println(" 차체 : "+this.getBody());
		System.out.println(" 엔진 : "+this.getEngine());
		System.out.println(" 타이어 : "+this.getTier());
		System.out.println("현재 속력 : "+this.getCurSpeed());
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
