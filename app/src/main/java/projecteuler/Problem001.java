package projecteuler;
import java.math.BigDecimal;

public class Problem001 {

    public static void main(String[] args) {
        var beforeTime = System.nanoTime();

        ////////////////////////////////////////
        int num = 0;
        for(int i=0; i<1000; i++) {
            if(i%3==0||i%5==0) {
                num+=i;
            }
        }
        System.out.println(num);
        ////////////////////////////////////////

        var interval = System.nanoTime() - beforeTime;
        var d = new BigDecimal(interval);
        var c = new BigDecimal(10000000000L);
        var toSec = d.divide(c);

        System.out.println("code run timestamp: " + d + "(ns)");
        System.out.println("code run timestamp: " + toSec + "(s)");
    }
}