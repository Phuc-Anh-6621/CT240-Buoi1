package BT_Buoi1;

import java.util.Scanner;

public class MyCal {
	private int a;
	private int b;

	public void nhap() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a: ");
		a = scan.nextInt();
		System.out.print("Please enter b: ");
		b = scan.nextInt();
		
		while (b == 0) {
			if(b == 0) {
				System.out.println("b is not available. Please re-enter b!!");
				nhap();
			}
		}
	}
	
	public void setNumber(int num1, int num2) {
		a = num1;
		b = num2;
	}

	public void in() {
		System.out.println(a + ", " + b);
	}

	public int add() {
//		System.out.println("Tong la: "+(a+b));
		return (a + b);
	}

	public int minus() {
//		System.out.println("Hieu la: "+(a-b));
		return (a - b);
	}

	public int multiplication() {
//		System.out.println("Tich la: "+(a*b));
		return (a * b);
	}

	public double devide() {	
		double thuong;
		thuong = (double) a / (double) b;
		
		System.out.println("Thuong la: "+thuong);
		return thuong;
	}
	

	public int max() {
//		System.out.print("Max: ");
		if (a > b) {
//			System.out.println(a);
			return a;
		} else {
//			System.out.println(b);
			return b;
		}

	}

	public int min() {
//		System.out.print("Min: ");
		if (a < b) {
//			System.out.println(a);
			return a;
		} else {
//			System.out.println(b);
			return b;
		}
	}

	public static void main(String[] args) {
		MyCal result = new MyCal();
		result.nhap();
		result.in();

//		result.add();
//		result.minus();
//		result.multiplication();
//		result.devide();
//		result.max();
//		result.min();
	}

}