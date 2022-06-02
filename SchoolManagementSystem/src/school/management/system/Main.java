package school.management.system;

import java.util.ArrayList;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher Ravi = new Teacher(1, "Ravi", 500);
		Teacher Surajk = new Teacher(2, "Suraj k", 700);
		Teacher Mallikarjun = new Teacher(3, "Mallikarjun", 600);

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Ravi);
		teacherList.add(Surajk);
		teacherList.add(Mallikarjun);

		Student Soumya = new Student(1, "soumya", 4);
		Student rakshith = new Student(2, "Rakshith Vasudev", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		List<Student> studentList = new ArrayList<>();

		studentList.add(Soumya);
		studentList.add(rabbi);
		studentList.add(rakshith);

		School ghs = new School(teacherList, studentList);

		Teacher megan = new Teacher(6, "Megan", 900);

		ghs.addTeacher(megan);

		Soumya.payFees(5000);
		rakshith.payFees(6000);
		System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

		System.out.println("------Making SCHOOL PAY SALARY----");
		Ravi.receiveSalary(Ravi.getSalary());
		System.out.println(
				"GHS has spent for salary to " + Ravi.getName() + " and now has $" + ghs.getTotalMoneyEarned());

		Mallikarjun.receiveSalary(Mallikarjun.getSalary());
		System.out.println(
				"GHS has spent for salary to " + Mallikarjun.getName() + " and now has $" + ghs.getTotalMoneyEarned());

		System.out.println(rakshith);

		Surajk.receiveSalary(Surajk.getSalary());

		System.out.println(Surajk);

	}

}
