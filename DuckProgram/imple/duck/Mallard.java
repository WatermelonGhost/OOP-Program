package Duck.imple.duck;

import Duck.Duck;
import Duck.imple.behavior.FlyWithWings;
import Duck.imple.behavior.Quack;

public class Mallard extends Duck{
	public String name;
	public Mallard(String kind) {
		super(kind);
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}
	
}
