package Duck.imple.duck;

import Duck.Duck;
import Duck.imple.behavior.FlyNoWay;
import Duck.imple.behavior.Squeak;

public class RubberDuck extends Duck{
	
	public RubberDuck(String kind) {
		super(kind);
		
		setQuackBehavior(new Squeak());
		setFlyBehavior(new FlyNoWay());
	}
	

}
