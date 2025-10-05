//reverse a number - recursion
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int ans = reverse(1342, 0, 0);
		System.out.println(ans);
	}
	static int reverse(int n, int sum, int rem){
	    if(n==0){
	        return 0;
	    }
	    else{
	        rem = n%10;
	        sum = (sum * 10) + rem;
	        return reverse(n/10, sum, rem);
	    }
	}
}
