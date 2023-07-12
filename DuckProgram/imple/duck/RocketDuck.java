package Duck.imple.duck;

import Duck.Duck;
import Duck.imple.behavior.Beep;
import Duck.imple.behavior.FlyWithEngine;

public class RocketDuck extends Duck{
	
	public RocketDuck(String kind){
		super(kind);
		
		setQuackBehavior(new Beep());
		setFlyBehavior(new FlyWithEngine());
		
	}
}
