package by.epam.jb24;

import java.util.Scanner;

public class Lab2circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, l, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� R ��� ���������� ����� ���������� � ������� �����: ");
		System.out.print(" R: ");
		while (!sc.hasNextDouble()) {
			System.out.print(" �� ��������, ������� �������������� �������� R: ");
			sc.next();

		}
		r=sc.nextDouble();
		l= 2*Math.PI*r;
		s=Math.PI*r*r;
		System.out.println("����� ���������� = " + l);
		System.out.println("������� ����� = " + s);
		

	}

}
