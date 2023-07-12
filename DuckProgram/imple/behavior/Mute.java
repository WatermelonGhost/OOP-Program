package Duck.imple.behavior;

import Duck.QuackBehavior;

public class Mute implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("¹«À½");
	}

}
