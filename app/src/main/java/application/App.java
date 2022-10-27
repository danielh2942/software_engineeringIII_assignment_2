package application;

import com.github.danielh2942.softwareeng.collegelib.*;

import java.util.ArrayList;

import java.time.LocalDate;

import org.joda.time.DateTime;

public class App {
    public static void main(String[] args) {
        try {
			ArrayList<Student> students = new ArrayList<Student>();
			students.add(new Student("Paul Walker", LocalDate.of(1970,1,1)));
			students.add(new Student("Vin Diesel", LocalDate.of(1969,2,12)));
			students.add(new Student("Jim Caviezel", LocalDate.of(2000,1,20)));
			students.add(new Student("John Murphy", LocalDate.of(2002,2,2)));
			students.add(new Student("Fake Name", LocalDate.of(1999,6,5)));
			students.add(new Student("Mary Murphy", LocalDate.of(2002,1,2)));
			students.add(new Student("Joanne Byrne", LocalDate.of(1989,6,4)));
			students.add(new Student("Ian Paisley", LocalDate.of(2005,9,11)));
			
			Lecturer mLec = new Lecturer("John Fortnite", LocalDate.of(1993,11,21));
			Lecturer mLec2 = new Lecturer("Mary Fortnite", LocalDate.of(1973,2,2));
			Lecturer mLec3 = new Lecturer("Robert Paulson", LocalDate.of(1969,3,17));
			
			CollegeModule mod1 = new CollegeModule("Swag 101",mLec);
			CollegeModule mod2 = new CollegeModule("Cool Module 3", mLec2);
			CollegeModule mod3 = new CollegeModule("Maths",mLec3);
			CollegeModule mod4 = new CollegeModule("Epic Module V", mLec);
			CollegeModule mod5 = new CollegeModule("Statistics",mLec2);

			Course mCourse = new Course("Cool Course",new DateTime(1999,1,1,0,0,0), new DateTime(1999,12,31,0,0,0));
			mCourse.addModuleToCourse(mod1);
			mCourse.addModuleToCourse(mod2);
			mCourse.addModuleToCourse(mod3);
			mCourse.addModuleToCourse(mod4);
			mCourse.addModuleToCourse(mod5);

			for(Student s : students) {
				mCourse.enrollStudentInCourse(s);
			}
			System.out.println("Printing courses\n\n");
			System.out.println(mCourse);
			System.out.println("\nPrinting Students\n");
			for(Student s: students) {
				System.out.println(s);
			}
			System.out.println("\nPrinting Lecturers\n");
			System.out.println(mLec);
			System.out.println(mLec2);
			System.out.println(mLec3);
			System.out.println("\nPrinting Modules\n");
			System.out.println(mod1);
			System.out.println(mod2);
			System.out.println(mod3);
			System.out.println(mod4);
			System.out.println(mod5);
		} catch(Exception e) {
			System.out.println("Something went wrong" + e);
		}
    }
}
