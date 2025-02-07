package com.Yedam.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 학생 정보 관리 프로그램 v.1
 * 학생 이름, 키 ,몸무게, 점수
 */
public class StudentApp {
	Scanner scn = new Scanner(System.in);
	boolean run = true;

	List<Student> students = new ArrayList<>();

	public StudentApp() {
		init();
	}

	public void start() {
		System.out.println("1.목록 2.추가 3.삭제 9.종료");
		System.out.println("선택 >> ");
		while (run) {
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				student();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				removeStudent();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				save();
				run = false;
			}
		}
		System.out.println("end of prog");
	}// end of start.

	public void student() {
		// 이름 점수
		// --------
		// 홀길동 90
		System.out.println("이름 몸무게 키 점수");
		System.out.println("---------------");
		for (Student std : students) {
			System.out.println(std.getName() + " " + std.getHeight() + " " + std.getWeight() + " " + std.getScore() + " ");
		}
	}

	public void addStudent() {
		System.out.print("학생 이름 >> ");
		String name = scn.nextLine();
		System.out.print("학생 키 >> ");
		double height = Double.parseDouble(scn.nextLine());
		System.out.print("학생 몸무게 >> ");
		double weight = Double.parseDouble(scn.nextLine());
		System.out.print("학생 점수 >> ");
		int score = Integer.parseInt(scn.nextLine());

		students.add(new Student(name, height, weight, score));
		System.out.println("등록완료");
	}

	public void removeStudent() {
		System.out.print("학생 이름 >> ");
		String name = scn.nextLine();

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				System.out.println("삭제완료");
				return;
			}
		}
	}

	public void save() {
		// c:/temp/studentList.txt
		try {
			Writer writer = new FileWriter("c:/temp/student.txt");
			// 갯수만큼 반복저장.
			for (Student std : students) {
				writer.write(std.getName() + " " + std.getHeight() + " " + std.getWeight() + " " + std.getScore() + " "
						+ "\n");
			}
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("saved.");
	}// end of save().

	public void init() {
		//
		try {
			Reader reader = new FileReader("c:/temp/student.txt");
			BufferedReader br = new BufferedReader(reader);

			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				String[] ary = str.split(" ");
				
			
				Student student = new Student(ary[0], Double.parseDouble(ary[1]), Double.parseDouble(ary[2]),
						Integer.parseInt(ary[3]));

				students.add(student);
			}
			br.close();
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
