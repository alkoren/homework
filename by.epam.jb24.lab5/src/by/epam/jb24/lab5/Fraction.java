package by.epam.jb24.lab5;

import java.lang.String;
import java.lang.Math;
import java.util.Scanner;
public class Fraction {
	private int numenator;
	private int denominator;

	public Fraction() {
		numenator = 0;
		denominator = 1;
	}

	public Fraction(int _numenator, int _denominator) {
		numenator = _numenator;
		denominator = _denominator;
	}

	public String getFractionString() {
		String tmpOut;
		tmpOut = "" + numenator + "/" + denominator;
		return tmpOut;
	}

	public Fraction multFraction(Fraction tmpForMult) {
		this.numenator = this.numenator * tmpForMult.numenator;
		this.denominator = this.denominator * tmpForMult.denominator;
		int tmpScale = gcd(this.numenator, this.denominator);
		numenator = numenator / tmpScale;
		denominator = denominator / tmpScale;
		return this;
	}

	public Fraction addFraction(Fraction tmpForMult) {
		this.numenator = this.numenator*tmpForMult.denominator + this.denominator*tmpForMult.numenator;
		this.denominator = this.denominator * tmpForMult.denominator;
		int tmpScale = gcd(this.numenator, this.denominator);
		numenator = numenator / tmpScale;
		denominator = denominator / tmpScale;
		return this;
	}
	public Fraction assignFraction(Fraction tmpForMult) {
		this.numenator = tmpForMult.numenator;
		this.denominator =  tmpForMult.denominator;
		return this;
	}
	public void setFraction(int _numenator, int _denominator) {
		numenator = _numenator;
		denominator = _denominator;
	}
	public Fraction enterFraction() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите числитель: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Вы ввели не число. Введите число : ");
		}	
		this.numenator = sc.nextInt();
		System.out.print("Введите знаменатель: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Вы ввели не число. Введите число : ");
		}	
		this.denominator= sc.nextInt();		
		return this;
	}
	public static int gcd(int a, int b) {
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}
}
