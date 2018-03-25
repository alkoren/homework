package by.epam.jb24.lab5;
import by.epam.jb24.lab5.Fraction;
public class TestFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction myFraction1 = new Fraction(3, 4);
		Fraction myFraction2 = new Fraction();
		Fraction myFractionRes = new Fraction();
		myFractionRes.assignFraction(myFraction1);
		System.out.println("первая дробь :" + myFraction1.getFractionString());
		System.out.println("введите вторую дробь :");	
		myFraction2=myFraction2.enterFraction();
		System.out.println("вторая дробь : " + myFraction2.getFractionString());
		myFractionRes.multFraction(myFraction2);
		System.out.println("перемножив дроби получим " + myFractionRes.getFractionString());
		myFraction1.addFraction(myFraction2);
		System.out.println("сложив дроби получим " + myFraction1.getFractionString());
	}
}
