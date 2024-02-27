package study.study0226;

public class Rectangle implements Shape {
	
	// 접근 제어자 private를 활용한 변수선언
	private double heigth;
	private double width;
	
	//생성자
    public Rectangle(double heigth, double width) {
        this.heigth = heigth;
        this.width = width;
    }

	//인터페이스 구현
    @Override
	public double area() {
        double area = width * heigth;
		System.out.printf("사각형의 넓이는 %.2f 입니다.\n", area);
		return area;
    }
	
	//일반메서드
    public void perimeter() {
		double perimeter = (width + heigth) * 2;
		System.out.printf("사각형의 둘레는 %.2f 입니다.\n", perimeter);
	}
}
