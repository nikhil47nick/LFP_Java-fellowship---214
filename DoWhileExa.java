import java.util.*;
import java.util.Scanner;

public class DoWhileExa{
	
	public static void main(String[] args)
	{
		int count=0;
		System.out.println("Enter Number");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		
	
	do{
		System.out.println(count);
		count++;
		
	}while(count < num);
	
	}
}