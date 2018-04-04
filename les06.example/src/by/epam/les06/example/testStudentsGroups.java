package by.epam.les06.example;

import java.lang.String;

public class testStudentsGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group gr = new Group(15);
		final GroupLogic grLogic = new GroupLogic();
		final StudentLogic stLogic = new StudentLogic();
		Student st1 = new Student("Ivan", "Ivanov", 5);
		st1.setMark(4.0);
		st1.setMark(5.0);
		Student st2 = new Student("Vasia", "Pupkin", 5);
		st2.setMark(5.1);
		st2.setMark(5.1);
		Student st3 = new Student("Petia", "Sidorov", 5);
		st3.setMark(2.0);
		st3.setMark(4.0);
		gr.add(st1);
		gr.add(st2);
		gr.add(st3);
		System.out.println(" ���������� ��������� � ������ : " + gr.getCountOfStudents());
		System.out.println("a) ������� ���� ������� ������ : " + grLogic.getAvrMark(gr));
		
		System.out.println("�) ������� ���� ������� �������� : ");
		int countst=0;
		for (Student s : gr.getStudents()) {
			if (countst<gr.getCountOfStudents()) {
			System.out.println(" " + s.getSurname() + " " + s.getName() + " : " + stLogic.getAvrMark(s));
			countst++;
			} else {break;};
		}
		System.out.println("�) ����� ���������� : " + grLogic.getCountAStudent(gr));
		System.out.println("�) ���������� ���������, ������� \"2\": " + grLogic.getCountBadStudent(gr));
	}

}
