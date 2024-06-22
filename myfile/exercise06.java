package com.atguigu.myfile;
import java.io.*;
import java.util.Arrays;
import java.util.List;
public class exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = Arrays.asList(new Student[] {
				new Student("张三",18,80.9d),new Student("李四",17,67.5d)
		});
		
		writeStudents(students)
		
	}
	
	public static void writeStudents(List<Student> students) throws IOException {
		DataOutputStream output = new DataOutputStream(new FileOutputStream("students.dat"));
		try {
			output.writeInt(students.size());
			for(Student s : students) {
				output.writeUTF(s.name);
				output.writeInt(s.age);
				output.writeDouble(s.score);
			}
		}finally {
			output.close();
		}
	}
}
class Student{
	String name;
	int age;
	double score;
	
	public Student(String name,int age,double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
}