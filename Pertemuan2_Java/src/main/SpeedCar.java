package main;

public class SpeedCar extends Cars {
	
	public SpeedCar() {
		// TODO Auto-generated constructor stub
	}
	//overriding
	public void jalan() {
		System.out.println("speed car jalan");
	}
	
	//overloading
	public void jalan(String tujuan) {
		System.out.println("speed car jalan ke"+tujuan);
	}
}
