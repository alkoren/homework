package by.epam.jb24.lab4;

import java.util.Scanner;

public class ArrayOfZeroElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas = new int[10];
		int[] masCreatedZero = new int[10];
		readXFromConsole(mas);
		CheckforZero(mas, masCreatedZero);
		PrintArrayElements(masCreatedZero);
	}

	public static void readXFromConsole(int[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("Введите элемент массива [ " + i + "]: ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print("Вы ввели не число. Введите число : ");
			}
			mas[i] = sc.nextInt();
		}
	}

	public static void CheckforZero(int[] mas, int[] zeromas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.println("Перенос номера элемента [" + i + "]: если нулевой");

			if (mas[i] == 0) {
				zeromas[i] = i;
			} else {
				zeromas[i] = -1;
			}
			;
		}

	}
	public static void PrintArrayElements(int[] zeromas) {
		System.out.println("Номера нулевых элементов : ");
		for (int i = 0; i < zeromas.length; i++) {

			if (zeromas[i] > 0) {
				System.out.println("[" + zeromas[i] + "]: ");
			} ;
		}

	}
}
