package by.epam.jb24;

import java.util.Scanner;

public class Lab2formula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� a, b, c ��� ���������� ���������: ");
		System.out.print(" a: ");
		while (!sc.hasNextDouble()) {
			System.out.print("�� ��������, ������� �������������� �������� a: ");
			sc.next();

		}
		a = sc.nextDouble();
		System.out.print(" b: ");
		while (!sc.hasNextDouble()) {
			System.out.print("�� ��������, ������� �������������� �������� b: ");
			sc.next();

		}
		b = sc.nextDouble();
		System.out.print(" c: ");
		while (!sc.hasNextDouble()) {
			System.out.print("�� ��������, ������� �������������� �������� c: ");
			sc.next();
		}
		c = sc.nextDouble();
		x= (b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+b;
		System.out.println("x=(b+Math.sqrt(b*b+4*a*c))/(2*a)-a*a*a*c+b = " + x);

	}

}
