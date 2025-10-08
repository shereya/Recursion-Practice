//java - permutations
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		permutations("","abc");
	}
	public static void permutations(String pr, String upr){
	    if(upr.isEmpty()){
	        System.out.println(pr);
	        return;
	    }
	    else{
	        char ch = upr.charAt(0);
	        for(int i=0;i<=pr.length();i++){
	            permutations(pr.substring(0,i)+ch+pr.substring(i), upr.substring(1));
	        }
	    }
	}
}
