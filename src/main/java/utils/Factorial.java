package utils;

import java.util.Scanner;

class Factorial
{
      
    	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			int fact=1;
			
			fact = factorial(number);
			
			System.out.println(fact);
		}

		private static int factorial(int fact) {
			// TODO Auto-generated method stub
			if (fact==0)
				return 1;
			else
				fact = fact * factorial(fact-1);
			return fact;
		}
    	
    	
    
}