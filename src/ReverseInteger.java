/**
 * Created by yhj on 2017/9/23.
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;
        while(x!=0){
            int tail = x % 10;
            int newResult = result*10+tail;
            if((newResult-tail)/10 != result){
                return 0;
            }
            result = newResult;
            x = x/10;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(ReverseInteger.reverse(1463847412));
    }
}
