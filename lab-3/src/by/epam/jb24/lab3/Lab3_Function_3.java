package by.epam.jb24.lab3;

import java.util.Scanner;

public class Lab3_Function_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y;
		double x = readXFromConsole("X");
		System.out.print("F(х) = " + functionfx3(x));
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

	public static double functionfx3(double x) {
		double y = 9;
		if (x>3) {
			y=1/(x*x+1);
		};
		if ((x>-3) && (x<=3) ) {
			 y= Double.NaN;
		};
		return y;
	}
}
