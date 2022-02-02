import java.util.Scanner;

public class Addition{

	public static void main(String[] args){
	
	int a,b,c;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the 2 Numbers to add");
	a= sc.nextInt();
	b= sc.nextInt();
	c=a+b;
	System.out.println("Addition= "+c);

	}
} 