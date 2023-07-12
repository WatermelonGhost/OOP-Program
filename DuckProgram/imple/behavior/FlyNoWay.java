package Duck.imple.behavior;

import Duck.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날지 못한다.");
	}
}
