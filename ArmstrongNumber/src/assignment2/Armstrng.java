package assignment2;

	
	import java.util.Scanner;

	public class Armstrng {
		
		
		public static void Armstrngf() {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number to find Armstrong series");
			int x = sc.nextInt();
			
	        int n = 10; 
	        System.out.println("0");
	        System.out.println("1");
			while(n<x)
			{	
				int length = (int) Math.log10(n) + 1; //to know length of a given number using math operations
				int sum = 0;
		    	int num = n;
				int temp = num;
				while (num > 0) {
					int t = num % 10;
					sum =sum+ (int)Math.pow(t, length) ; // to know power of a no using math operations
					num = num / 10;
				}
				if (sum == temp) {
					System.out.println(temp);
				}
				sc.close();
			n++;
			}
		}
			
			
	public static void main(String[] args) { // object calling is avoided using static
		Armstrngf();
	}
	}
