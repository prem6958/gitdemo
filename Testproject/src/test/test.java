package test;

import java.util.Scanner;

public class test {
	Scanner sc = new Scanner(System.in);
	
	public void reverse_string()
	{
		System.out.println("Enter the String to reverse: ");
		String word = sc.nextLine();
		for (int i=word.length()-1;i>=0;i--)
		{
		System.out.print(word.charAt(i));
		}		
	}
	
	public void fibonacci()
	{
		System.out.println("Enter the range: ");
		int n = sc.nextInt();
		int first =0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		for (int i=0; i<=n-2; i++)
		{
			int current = first+second;
			System.out.println(current);
			first = second;
			second = current;
		}
	}
	
	public void amstrong_number()
	{
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		int sum = 0;
		int temp = number;
		while(temp>0)
		{
		int rem = temp % 10;
		System.out.println(rem);
		sum +=	rem * rem * rem;
		temp /= 10;
		System.out.println(temp);
		}
		System.out.println("test");
		if(sum == number) {System.out.println("Amstrong number");}
		else {System.out.println("not an Amstrong number");}
	}
	
	public static void main(String args[])
	{
		test t = new test();
//		t.reverse_string();
//		t.fibonacci();
//		t.amstrong_number();
		
	}
}
