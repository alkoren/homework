package by.epam.jb24.lab4;

import java.util.Scanner;
import java.util.Random;

public class SumOfKratnyh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mas = new int[10];
		int k;
		int R;

		k = readXFromConsole("K , ��� ������� ����� ��� ���������, ������� ������ ������� �: ");
		R = readXFromConsole("R , ��� ��������� ��������� �����, ��� R - ������������ ");
		enterArrayWithRandom(mas, R);
		printArray(mas);
		calculateSumKratn(mas, k);
	}
	public static int readXFromConsole( String strNameNumber) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.print("������� " + strNameNumber +  ": ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("�� ����� �� ����� �����. " + strNameNumber + " ����� ���� ������ ����� ������. ������� " + strNameNumber +  " : ");
		}
		x = sc.nextInt();
		return x;
	}

	public static void enterArrayWithRandom(int[] mas, int r) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(r);
			System.out.println("Generated mas[" + i + "]=>" + mas[i]);
		}
	}

	public static void printArray(int[] mas) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}

	public static void calculateSumKratn(int[] mas, int k) {
		int sum=0;
		System.out.println("--------------------------------------------");
		
		for (int i=0; i<mas.length;i++) {
		if (((mas[i]/k)*k)== mas[i]) {
			if (mas[i]>0 ) {
			sum=sum+mas[i];
			System.out.print("+ " + mas[i] +  " ");
			}
		}
		}
		System.out.print(" = (����� ��� ���������, ������� ������ ������� �) = " + sum);
	}
	
}
