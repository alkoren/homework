package by.epam.jb24;

import java.util.Scanner;

public class Lab2circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, l, s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите R для вычисления длины окружности и площади круга: ");
		System.out.print(" R: ");
		while (!sc.hasNextDouble()) {
			System.out.print(" вы ошиблись, введите действительное числовое R: ");
			sc.next();

		}
		r=sc.nextDouble();
		l= 2*Math.PI*r;
		s=Math.PI*r*r;
		System.out.println("длина окружности = " + l);
		System.out.println("площадь круга = " + s);
		

	}

}
