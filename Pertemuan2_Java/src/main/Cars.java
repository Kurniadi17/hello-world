package main;

public class Cars implements Movement {
	int roda;
	String color;
	int door;
	
	//constructor 
	public Cars() {
		// TODO Auto-generated constructor stub
	}
	
	public void setRoda(int roda) {
		this.roda = roda;
	}
	
	public int getRoda() {
		return roda;
	}
	public void jalan() {
		System.out.println("mobil biasa jalan");
	}

	@Override
	public void goleft() {
		// TODO Auto-generated method stub
		System.out.println("cars go left");
	}

	@Override
	public void goright() {
		// TODO Auto-generated method stub
		System.out.println("cars go right");
	}
}
