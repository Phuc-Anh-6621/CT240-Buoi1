package a;

import java.util.Scanner;

public class MyCal {
	private int a;
	private int b;
	
	public MyCal () {
		int a;
		int b;
	}
	
	public void nhap(){
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
	}
	
	public void nhap(int so1, int so2){
		a = so1;
		b = so2;
	}
	
	public void in() {
		System.out.println(a + ", " + b);
	}
	public void add() {
		System.out.println("Tong la: "+(a+b));
	}
	
	public void minus() {
		System.out.println("Hieu la: "+(a-b));
	}
	
	public void multiplication() {
		System.out.println("Tich la: "+(a*b));
	}
	
	public void devide() {
		double thuong;
		thuong = (double)a / (double)b;
		System.out.println("Thuong la: "+thuong);
	}
	
	public void max() {
		System.out.print("Max: ");
		if(a>b) System.out.println(a);
		else System.out.println(b);
	}
	
	public void min() {
		System.out.print("Min: ");
		if(a<b) System.out.println(a);
		else System.out.println(b);
	}

}
