import java.util.Scanner;
public class ReverseNo3{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 3 digit number to reverse");
	int n,a,b,c,sum;
	n= sc.nextInt();
	a=n%10; //123%10=3 
	n=n/10; //123/10=12 in int
	b=n%10; //12%10=2
	c=n/10; //12/10=1
	sum= a*100+b*10+c;
	System.out.println(sum);
	
	}
} 
 