package study.Ex02;

public class Employee {
    //매개변수
    public String name;
    public String job;
    public int empNo;
    public int pay;

    //생성자
    public Employee(String name, String job, int empNo, int pay) {
        super();
        this.name = name;
        this.job = job;
        this.empNo = empNo;
        this.pay = pay;
    }

    //일반 메서드
    public void intro() {
        System.out.println(name + "의 직책은 " + job + " 사원번호는 " + empNo + "입니다.");
    }
    public void pay() {
        System.out.println(job + "님의 월급은 " + pay + "입니다.");
    }

    //추상 메서드 3개
    public void project() {}
    public void skill() {}
    public void rank() {}

}