//sum of digits
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int ans = sum(1342);
		System.out.println(ans);
	}
	public static int sum(int n){
	    if(n==0){
	        return 0;
	    }
	    else{
	        return sum(n/10) + n%10;
	    }
	}
}
