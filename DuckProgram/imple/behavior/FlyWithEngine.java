package Duck.imple.behavior;

import Duck.FlyBehavior;

public class FlyWithEngine implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("엔진으로 날라간다.");
	}

}
