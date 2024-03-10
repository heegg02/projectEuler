package study.study0308;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		System.out.println("가위 바위 보!");
		System.out.print("나 -> ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		int s = (int)(Math.random()*3);
		String[] z = {"묵", "찌", "빠"};

        switch (a) {
            case "묵": 
                switch (z[s]) {
                    case "묵": System.out.println("draw"); break;
                    case "찌": System.out.println("win"); break;
                    case "빠": System.out.println("lose"); break;
                }
                break;
            case "찌": 
                switch (z[s]) {
                    case "묵": System.out.println("lose"); break;
                    case "찌": System.out.println("draw"); break;
                    case "빠": System.out.println("win"); break;
                }
                break;
            
            case "빠": 
                switch (z[s]) {
                    case "묵": System.out.println("win"); break;
                    case "찌": System.out.println("lose"); break;
                    case "빠": System.out.println("draw"); break;
                }
                break;
        }

	}

}
