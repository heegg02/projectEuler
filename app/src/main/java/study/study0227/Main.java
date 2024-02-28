package study.study0227;
/*
Product클래스를 디자인해보자.
멤버변수 : 일련번호(1200부터 1씩 증가 되는 값을 저장), 상품명, 제조사, 가격
static variable : 생성된 제품 수 (count)

1. 일련번호는 static count를 이용해서 상품이 생성될 때 1200부터 1씩 증가되는 값을 저장한다.
2. 멤버변수는 private멤버로 선언한다.


출력만되면 됨
실행예시----------------------------------------------------------------------
[출고 리스트​]
1200.    새우깡      농심(주)        1900원
1201.    빼빼로      롯데제과       2200원
1202.    먹태깡      농심(주)        2500원 
-------------------------------------
출고 상품 : 3건
-----------------------------------------------------------------------------------------
*/
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("새우깡", "농심(주)", 1900);
        Product product2 = new Product("빼빼로", "롯데제과", 2200);
        Product product3 = new Product("먹태깡", "농심(주)", 2500);

        System.out.println("[출고 리스트]");
        System.out.println(product1.getmNum()+".\t"+product1.getmName()+"\t"+product1.getmWhere()+"\t"+product1.getmPrice());
        System.out.println(product2.getmNum()+".\t"+product2.getmName()+"\t"+product2.getmWhere()+"\t"+product2.getmPrice());
        System.out.println(product3.getmNum()+".\t"+product3.getmName()+"\t"+product3.getmWhere()+"\t"+product3.getmPrice());
        System.out.println("출고 상품 : " + getCount() +"건);
    }
}
