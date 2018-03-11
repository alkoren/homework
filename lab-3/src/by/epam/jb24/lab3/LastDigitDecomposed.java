package by.epam.jb24.lab3;

import java.util.Scanner;

public class LastDigitDecomposed {

	public static void main(String[] args) {
		int number = readXFromConsole();
		int poslZifra;
		int poslZifraKv;
		poslZifra = number % 10;
		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			System.out.println("Что-то не то с программой.");
			return;
		}
		printResult(number, poslZifraKv);
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

	public static void printResult(int number, int poslZifraKv) {
		System.out.println("Для числа " + number + " последняя цифра его квадрата равняется " + poslZifraKv);
	}
}
