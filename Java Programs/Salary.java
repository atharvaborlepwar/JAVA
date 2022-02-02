import java.util.Scanner;
public class Salary{
	public static void main(String[] args){
	double bs,da, hra, total;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Basic Salary");
	bs= sc.nextDouble();
	da= bs*0.2;
	System.out.println("The Daily Allowance is "+da);
	hra= bs*0.4;
	System.out.println("The House Rent Allowance is "+hra);
	total= bs+da+hra;
	System.out.println("The Total Salary is "+total);
	}
}