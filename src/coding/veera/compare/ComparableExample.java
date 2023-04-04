package coding.veera.compare;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		Student s1=new Student(4,"Arun",5);
		Student s2=new Student(2,"John",2);
		Student s3=new Student(5,"Richard",3);
		Student s4=new Student(1,"Varun",3);
		Student s5=new Student(6,"Mukilan",7);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		System.out.println(studentList);
		System.out.println("Sorting students using Standard");
		Collections.sort(studentList);
		System.out.println(studentList);
	}
	

}
