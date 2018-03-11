package by.epam.jb24.lab3;

import java.util.Scanner;

public class ColDaysDecomposed {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		int year = readXFromConsole("год");
		int month = readXFromConsole("номер месяца");
				int col_day = 0;
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				col_day = 31;
				break;
			case 2:
				if (year % 4 == 0) {
					col_day = 29;
				} else {
					col_day = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				col_day = 30;
				break;
			}
			printResult(col_day);
		}
		
		public static int readXFromConsole( String strNameNumber) {
			Scanner sc = new Scanner(System.in);
			int x = 0;
			System.out.print("Введите " + strNameNumber +  ": ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Вы ввели не целое число. " + strNameNumber + " может быть только целым числом. Введите " + strNameNumber +  " : ");
			}
			x = sc.nextInt();
			return x;
		}
		public static void printResult(int col_day) {
			System.out.println("Количество дней равно - " + col_day);
		}
}
