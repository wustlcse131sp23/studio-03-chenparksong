package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the value of n?");
		int n = in.nextInt();
		
		boolean [] prime = new boolean[n];
	
		for (int dividend = 2; dividend <= (Math.sqrt(n)); dividend++) 
		{
			for(int i = 2; i<=(n/2); i++)
			{
				if(i*dividend<n)
				{
					prime[i*dividend] = true;
				}
			}
		}
		for (int check = 2; check < n; check++)
		{
			if (prime[check] == false)
			{
				System.out.println(check);
			}
		}
	
	}

}
