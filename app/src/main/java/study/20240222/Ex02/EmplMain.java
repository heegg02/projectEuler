package study.Ex02;

public class EmplMain {
    public static void main(String[] args) {

		System.out.println("----직원 정보---");
		System.out.println();

		// Employee, James, Tomas 클래스 함수 출력문 작성
		Tomas tomas = new Tomas("손흥민", "과장", 120, 3000000);
		tomas.intro();
		tomas.project();
		tomas.skill();
		tomas.rank();
		tomas.pay();

		James james = new James("김민재", "대리", 127, 2000000);
		james.intro();
		james.project();
		james.skill();
		james.rank();
		james.pay();

	}
}