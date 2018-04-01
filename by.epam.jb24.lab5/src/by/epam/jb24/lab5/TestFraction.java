package by.epam.jb24.lab5;
import by.epam.jb24.lab5.Fraction;
public class TestFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction[] masFraction=new Fraction[10];
		Fraction myFraction1 = new Fraction(3, 4);
		for(int i = 0; i < 10 ; i++)
		{
			masFraction[i] = new Fraction(1, 2);
		};
		masFraction[0].assignFraction(myFraction1);
		System.out.println("первая дробь :" + myFraction1.getFractionString());
		System.out.println("введите вторую дробь :");	
		masFraction[1]=masFraction[1].enterFraction();
		System.out.println("вторая дробь : " + masFraction[1].getFractionString());
		masFraction[2].multFraction(masFraction[1]);
		System.out.println("перемножив дроби получим " + masFraction[2].getFractionString());
		masFraction[3].addFraction(masFraction[2]);
		System.out.println("сложив дроби получим " + masFraction[3].getFractionString());
		System.out.println("Массив дробей: ");
		for(int i = 0; i < 10 ; i++)
		{
			System.out.println(masFraction[i].getFractionString());
		};
	}
}
