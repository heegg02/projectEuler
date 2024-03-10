package study.study0311;

import java.util.*;

public class Queue {

    //여기에 전역변수로 리스트 선언
    List li = new ArrayList();

	public static void main(String[] args) {
    Queue q = new Queue();
		System.out.println("큐에 원소 추가");
		System.out.println("--------------");
		q.push(0);
		q.push(1);
		q.push(2);
		
		System.out.println("큐에서 원소 제거");
		System.out.println("--------------");
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println();
		
		System.out.println("큐에서 원소 제거");
		System.out.println("--------------");
    }
	
	//큐에 요소를 넣는 메서드 - 메서드 명은 push, 타입은 void 메서드 로 만들어 주세요!!
    public void push(int p) {
        li.add(p);
		System.out.println(p);
    }
	
	//큐에서 요소 빼기 - 메서드명은 pop, 메서드 타입은 Integer로 만들어 주세요!!
    public Integer pop() {
        return (int)li.remove(0);
    } 

}