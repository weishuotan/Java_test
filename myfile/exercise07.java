package com.atguigu.myfile;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class exercise07 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(readStudents());
	}
	public static List<Student100> readStudents() throws IOException{
		DataInputStream input = new DataInputStream(new FileInputStream("students.dat"));
		try {
			int size = input.readInt();
			List<Student100> students = new ArrayList<Student100>(size);
			for(int i = 0;i<size;i++) {
				Student100 s = new Student100();
				s.name = input.readUTF();
				s.age=input.readInt();
				s.score=input.readDouble();
				students.add(s);
			}
			return students;
		}finally {
			input.close();
		}
	}
	
}
class Student100{
	String name;
	int age;
	double score;
	
	public Student100(String name,int age,double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Student100() {
		// TODO Auto-generated constructor stub
	}
}