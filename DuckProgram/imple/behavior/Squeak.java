package Duck.imple.behavior;

import Duck.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("»à»à");
	}

}
