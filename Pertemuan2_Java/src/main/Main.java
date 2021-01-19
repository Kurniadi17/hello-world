package main;

import java.util.Scanner;

public class Main {

	//constructor
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Cars ferrari = new Cars();
		ferrari.setRoda(10);
		ferrari.goleft();
		System.out.println("Roda di ferrari: "+ferrari.getRoda());
		
		HeliA helicopterA = new HeliA();
		helicopterA.heliLanding();
		helicopterA.goright();
		
		Scanner arya = new Scanner(System.in);
		String umur;
		
		System.out.println("masukkan umur: ");
		umur = arya.nextLine();
		
		System.out.println("uumur: "+umur);
		
	}
}
