package Duck.imple.duck;

import Duck.Duck;
import Duck.imple.behavior.FlyWithWings;
import Duck.imple.behavior.Quack;

public class RedDuck extends Duck{
	
	public RedDuck(String kind) {
		super(kind);
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}
	
}
