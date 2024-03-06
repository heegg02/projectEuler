package study.study0305;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	private ArrayList<Person> persons = new ArrayList<>();

	public static void main(String[] args) {
		
		PersonMain personmain = new PersonMain();
		personmain.personMenu();
	}
	
	public void personMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========menu=======");
		System.out.println("1>정보추가 / 2>정보삭제 / 3>전체정보 보기 / etc>종료");
		int scint = sc.nextInt();
		switch (scint) {
		case 1: makeInfo(); break;
		case 2: deleteInfo(); break;
		case 3: selectInfo(); break;
		default: System.out.println("프로그램을 종료합니다."); break;
		}
	}
	
	private void makeInfo() {
		Person setInfo = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("========정보 추가=======");
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.print("전화번호 입력: ");
		String tel = sc.next();
		System.out.println("정보가 저장되었습니다.");
		
		setInfo.setName(name);
		setInfo.setAge(age);
		setInfo.setTel(tel);
		
		persons.add(setInfo);
		personMenu();
	}
	
	private void deleteInfo() {
		System.out.println("========정보 삭제=======");
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 대상의 이름을 입력하세요: ");
		String delName = sc.next();
		Person del = null;
		
		for(Person person : persons) {
			if(person.getName().equals(delName)) {
				del = person;
			}
		}
		persons.remove(del);
		System.out.println(delName + "의 정보가 삭제되었습니다.");
		personMenu();
	}
	
	private void selectInfo() {
		System.out.println("========전체 정보=======");
		for(Person person : persons) {
			System.out.println("[이름 : "+person.getName()+" / 나이 : "+person.getAge()+" / 전화번호 : "+person.getTel()+"]");
		}
		personMenu();
	}
	
	
}
