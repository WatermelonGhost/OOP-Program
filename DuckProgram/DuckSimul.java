package Duck;

import Duck.imple.behavior.FlyNoWay;
import Duck.imple.behavior.FlyWithWings;
import Duck.imple.behavior.Mute;
import Duck.imple.behavior.Quack;
import Duck.imple.duck.Mallard;
import Duck.imple.duck.RedDuck;
import Duck.imple.duck.RocketDuck;
import Duck.imple.duck.RubberDuck;
import Duck.imple.duck.WodenDuck;

public class DuckSimul {

	public static void main(String[] args) {
		
		Duck duck = new Mallard("청둥오리");
		duck.display();

		duck = new WodenDuck("목각오리");
		duck.setFlyBehavior(new FlyNoWay());
		duck.setQuackBehavior(new Mute());
		duck.display();
		
		duck = new RedDuck("빨간머리오리");
		FlyBehavior fb = new FlyWithWings();
		QuackBehavior qb = new Quack();
		duck.setFlyBehavior(fb);
		duck.setQuackBehavior(qb);
		duck.display();
		
		duck = new RubberDuck("고무오리");
		duck.display();
		
		duck = new RocketDuck("로봇오리");
		duck.display();
		
	}

}
