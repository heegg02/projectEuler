package projecteuler;

public class Problem002 {
    public static void main(String[] args) {
        int result = 2;
        int num1 = 1;
        int num2 = 2;

        for(;;) {
            num1 += num2; 
            if(num1+num2>4000000) break;
            if((num1+num2)%2==0) {
                result += num1+num2;
            }

            num2 += num1; 
            if(num1+num2>4000000) break;
            if((num1+num2)%2==0) {
                result += num1+num2;
            }
        }
        System.out.println(result);
    }
}