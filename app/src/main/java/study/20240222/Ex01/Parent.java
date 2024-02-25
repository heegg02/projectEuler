package study.Ex01;

public class Parent {
	//매개변수
	String name;
	int age;
	
	//생성자
	public Parent(String name, int age) {
        this.name = name;
		this.age = age;
	}
	//메서드
	public void SendToChildren() {
        System.out.println("이름은 " + name + " 나이는 " + age);
	}
}
