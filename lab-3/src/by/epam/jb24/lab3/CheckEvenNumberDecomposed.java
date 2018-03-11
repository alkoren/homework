package by.epam.jb24.lab3;

import java.util.Scanner;

public class CheckEvenNumberDecomposed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = readXFromConsole();
		System.out.print("В числе есть четная цифра - this is " + CheckEven(x));
	}

	public static int readXFromConsole() {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.print("Введите целое x: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Вы ввели не целое число. Введите целое x: ");
		}
		x = sc.nextInt();
		return x;
	}

	public static boolean CheckEven(int number) {
		int digit = 0;

		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
				return true;
			}
		}
		return false;
	}
}
