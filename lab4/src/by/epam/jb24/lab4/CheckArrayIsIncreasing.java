package by.epam.jb24.lab4;

import java.util.Random;
import java.util.Scanner;

public class CheckArrayIsIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] mas = new double[10];
		if (readAnswerFromConsole(
				"y, ���� ������ ��� �������� ������ ������� �������, n - ���� ������������ ��������� �����")) {
			System.out.print("������� ");
			readXFromConsole(mas);
		} else {
			System.out.print("�������� ");
			enterArrayWithRandom(mas);
		}
		if (IfArrayIsIncreasing(mas)) {
			System.out.print("������ �������� ������������");
			
		} else {
			System.out.print("������ �� �������� ������������");

		}
	}

	public static boolean readAnswerFromConsole(String strQuestion) {
		Scanner sc = new Scanner(System.in);
		boolean getanswer = false;
		boolean readAnswer = false;
		String strTemp = "";

		while (!getanswer) {
			System.out.print("������� " + strQuestion + ": ");
			strTemp = sc.nextLine();
			switch (strTemp) {
			case "y":
			case "Y":
				getanswer = true;
				readAnswer = true;
				break;
			case "n":
			case "N":
				getanswer = true;
				readAnswer = false;
				break;

			default:
				System.out.println("����� ������.");

			}
			;
		}
		;
		return readAnswer;
	}

	public static void enterArrayWithRandom(double[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble();
			System.out.println("Generated mas[" + i + "]=>" + mas[i]);
		}
	}

	public static void readXFromConsole(double[] mas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++) {
			System.out.print("������� ������� ������� [ " + i + "]: ");
			while (!sc.hasNextDouble()) {
				sc.next();
				System.out.print("�� ����� �� �����. ������� ����� : ");
			}
			mas[i] = sc.nextDouble();
		}
	}

	public static boolean IfArrayIsIncreasing(double[] mas) {
		boolean AnswerIfArrayIsIncreasing=false;
		for (int i = 1; i < mas.length; i++) {
			System.out.print("��������� ��������� [" + (i-1) + "] � [" + i + "]: ");

if (mas[i-1]>mas[i]) { AnswerIfArrayIsIncreasing=false;
			
				break;
		} else { AnswerIfArrayIsIncreasing=true;
		System.out.println("��������� ������� ������ �����������.");
		};
	}
		return AnswerIfArrayIsIncreasing;
}
}