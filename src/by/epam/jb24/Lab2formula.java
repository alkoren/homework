package by.epam.jb24;

import java.util.Scanner;

public class Lab2formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите a, b, c дл€ вычислени€ выражени€: ");
		System.out.print(" a: ");
		while (!sc.hasNextDouble()) {
			System.out.print("вы ошиблись, введите действительное числовое a: ");
			sc.next();

		}
		a = sc.nextDouble();
		System.out.print(" b: ");
		while (!sc.hasNextDouble()) {
			System.out.print("вы ошиблись, введите действительное числовое b: ");
			sc.next();

		}
		b = sc.nextDouble();
		System.out.print(" c: ");
		while (!sc.hasNextDouble()) {
			System.out.print("вы ошиблись, введите действительное числовое c: ");
			sc.next();
		}
		c = sc.nextDouble();
		x= (b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+b;
		System.out.println("x=(b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+b = " + x);

	}

}
