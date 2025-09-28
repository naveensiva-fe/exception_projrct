package bean;
import java.util.Scanner;

public class arrayexpext {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int size=sc.nextInt();
		int n;
		int arr[]=new int[size];
		try {
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			n=sc.nextInt();
			System.out.println("The array element at index "+n+" = "+arr[n-1]);
			System.out.println("The array element successfully accessed "); 
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
