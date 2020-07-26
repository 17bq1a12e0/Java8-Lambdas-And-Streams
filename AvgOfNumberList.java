import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class AvgOfNumberList
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number,average;
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.print("Enter number of numbers:");
		number=sc.nextInt();
		System.out.println("Enter numbers");
		for(int iter=1;iter<=number;iter++)
		{
			numbers.add(sc.nextInt());
		}
		average=avgOfListOfIntegers(numbers,( a, b)->a+b);
		System.out.println("Average of list of numbers is : "+av);
	}
	public static int avgOfListOfIntegers(ArrayList<Integer> numbers,BiFunction<Integer,Integer,Integer> biFunction)
	{
		int sum=0,avg;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		for(int num:numbers)
		{
			sum=biFunction.apply(sum,num);
		}
		avg=findDiv.apply(sum,numbers.size());
		return avg;
	}
}