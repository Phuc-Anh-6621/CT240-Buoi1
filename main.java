package a;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		MyCal result = new MyCal();
		result.nhap(13,50);
		result.in();
		System.out.print("\nMax is:  ");
		result.add();
		result.minus();
		result.multiplication();
		result.devide();
		result.max();
		result.min();
	}

}
