package study.Ex02;

public class James extends Employee {
    
	//상속 받은 변수
	public James(String name, String job, int empNo, int pay){
        super(name, job, empNo, pay);
    }

	// 자식 클래스에서 오버라이드 진행
	@Override
	public void project() {
		System.out.println("프로젝트를 진행하고 있습니다.");
	}

	@Override
	public void skill() {
		System.out.println("React 개발을 하고 있습니다.\nJava Script 개발을 하고 있습니다.");
	}

	@Override
	public void rank() {
		System.out.println("내년에 승진하지 못합니다.");
	}
}
