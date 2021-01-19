package main;

public class HeliA extends Helicopter implements Movement {


	public HeliA() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void helifly() {
		// TODO Auto-generated method stub
		System.out.println("heli a fly");
	}

	@Override
	public void heliLanding() {
		// TODO Auto-generated method stub
		System.out.println("heli a landing");
	}

	@Override
	public void goleft() {
		// TODO Auto-generated method stub
		System.out.println("helicopter go left");
	}

	@Override
	public void goright() {
		// TODO Auto-generated method stub
		System.out.println("helicopter go right");
	}

}
