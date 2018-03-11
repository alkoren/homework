package by.epam.jb24.lab3;

import java.util.Scanner;

public class MinMaxString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;

		String max = "", min = "", str = "";
		for (int i = 0; i < n; i++) {

			str = readStringFromConsole();
			if (i == 0) {
				min = str;
			}
			if (str.length() > max.length()) {
				max = str;
			} else if (str.length() < min.length()) {
				min = str;
			}
		}
		printResult(min, max);

	}

	public static String readStringFromConsole() {
		Scanner sc = new Scanner(System.in);
		String strTemp = "";
		System.out.print("> ");
		strTemp = sc.nextLine();
			return strTemp;

	}

	public static void printResult(String minString, String maxString) {
		System.out.println("max string = " + maxString + " length=" + maxString.length());
		System.out.println("min string = " + minString + " length=" + minString.length());
	}

}
