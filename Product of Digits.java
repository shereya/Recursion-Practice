//product of digits
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int ans = product(1342);
		System.out.println(ans);
	}
	public static int product(int n){
	    if(n%10==n){
	        return n;
	    }
	    else{
	        return product(n/10) * (n%10);
	    }
	}
}
