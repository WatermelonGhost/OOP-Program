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
		
		Duck duck = new Mallard("û�տ���");
		duck.display();

		duck = new WodenDuck("�񰢿���");
		duck.setFlyBehavior(new FlyNoWay());
		duck.setQuackBehavior(new Mute());
		duck.display();
		
		duck = new RedDuck("�����Ӹ�����");
		FlyBehavior fb = new FlyWithWings();
		QuackBehavior qb = new Quack();
		duck.setFlyBehavior(fb);
		duck.setQuackBehavior(qb);
		duck.display();
		
		duck = new RubberDuck("������");
		duck.display();
		
		duck = new RocketDuck("�κ�����");
		duck.display();
		
	}

}
