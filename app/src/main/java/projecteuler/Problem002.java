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
        fn();
    }

    // Corby가 푼것.
    public static void fn() {
        int i;
        int num1 = 1;
        int num2 = 2;
        var sum = 0;

        for(i = num2; sum <= 4000000; i += (sum % 2 == 0) ? sum : 0) {
            
            // add numbers
            sum = num1 + num2;

            // swap
            var temp = num2;
            num2 += num1; 
            num1 = temp;
        }

        System.out.println(i);
    }
}