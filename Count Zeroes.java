//count zeroes in a number - recursive approach
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int ans = countZeroes(300000000,0);
		System.out.println(ans);
	}
	static int countZeroes(int n, int count){
	    if(n/10==0 && n!=0){
	        return count;
	    }
	    if(n==0){
	        return 1;
	    }
	    else{
	        if(n%10==0){
	            count = count+1;
	        }
	        return countZeroes(n/10,count);
	    }
	    
	}
}
