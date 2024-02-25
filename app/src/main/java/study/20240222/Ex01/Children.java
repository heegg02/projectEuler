package study.Ex01;

public class Children extends Parent{
    //매개변수
	String address;
	String phone;
	
	//생성자
	public Children(String name, int age, String address, String phone) {
		super(name, age);		
        this.address = address;
        this.phone = phone;
	}
	
	//메서드
	public void GiveInfo() {
		SendToChildren();
        System.out.println("주소는 " + address + " 핸드폰은 " + phone);
	}
}
