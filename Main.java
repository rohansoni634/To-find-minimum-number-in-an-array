package minElementChallenge;
import java.util.*;
public class Main {
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a mumber : ");
		int count=sc.nextInt();
		int[] myInteger=readIntegers(count);
		int minValue=findMin(myInteger);
		System.out.println("Minimum entered value is : "+minValue);
	}
	// take user input
	public static int[] readIntegers(int count) {
		System.out.println("Enter Elements : ");
		int[] values=new int[count];
		for (int i=0;i<count;i++) {
			values[i]=sc.nextInt();
		}return values;
	}
	// find minimum value in the array
	public static int findMin(int[] array) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			int number=array[i];
			if (number<min) {
				min=number;
			}
		}return min;
	}
	
	
}
