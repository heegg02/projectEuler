package study.study0226;

public class Circle implements Shape {

	// 접근 제어자 private를 활용한 변수선언
	private double radius;
	
	//생성자
	public Circle(double radius) {
		this.radius = radius;
	}

	//인터페이스 구현
	@Override
	public double area() {
		double area = radius * radius * Math.PI;
		System.out.printf("원의 넓이는 %.2f 입니다. \n", area);
		return area;
	}
	
	//일반메서드
	public void perimeter() {
		double perimeter = 2 * radius * Math.PI;
		System.out.printf("원의 둘레는 %.2f 입니다. \n",perimeter);		
	}
}
