package intern;
import java.util.*;
public class t2 {

	
	    public static void main(String[] args) {
	        Random r =new Random();
	        Scanner sc= new Scanner(System.in);
	        int i=0,len=100;
	        
	        int gue=r.nextInt(100);
	        System.out.println("You have to guess a number chosen by computer between 0 to 100");
	        System.out.println("You will get 5 chances to guess");
	        System.out.println("Enter a number to check:");
	        int fn=sc.nextInt();
	        for(i=0;i<5;i++){
	            if(fn==gue){
	                System.out.println("You are right");
	                break;
	            }
	            else if(fn>gue){
	                System.out.println("your  number is more than the guess value");
	                
	            }
	            else{
	                System.out.println("Your number is smaller than the guess number");
	            }
	            System.out.println("You should have another guess");
	            fn=sc.nextInt();
	        }
	        if(i>=5){
	            System.out.println("You LOSE!!!");
	            System.out.println("The number was "+r);
	        }
	        else{
	            System.out.println("You WON!!! in just "+i+" rounds.......");
	        }
	        
	    }
	}


