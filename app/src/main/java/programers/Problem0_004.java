package programers;

public class Problem0_004 {
    public static void main(String[] args) {
        var string = "AbCdEfG_= Ab   s";
        //////////////////////////////////////////
        String str = "";
        
        for(char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                str += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)){
                str += Character.toUpperCase(c);
            } else {
                str += c;
            }
        }
        System.out.println(str);
    }
}