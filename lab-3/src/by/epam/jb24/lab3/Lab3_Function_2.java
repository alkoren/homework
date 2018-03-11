package by.epam.jb24.lab3;

import java.util.Scanner;

public class Lab3_Function_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = readXFromConsole("начало отрезка A");
		double b = readXFromConsole("конец отрезка B");
		double h = readXFromConsole("шаг h");
		double x = a;

		while (x <= b) {
			System.out.println("x: " + x + " F(x) " + functionfx(x));
			x = x + h;
		}
		;
	}

	public static double readXFromConsole(String strParameterName) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		System.out.print("Введите " + strParameterName + ": ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Вы ввели не число. " + strParameterName + " может быть только числом. Введите "
					+ strParameterName + " : ");
		}
		x = sc.nextDouble();
		return x;
	}

	public static double functionfx(double x) {
		double y = 2 * Math.tan(x / 2);
		return y;
	}
}
