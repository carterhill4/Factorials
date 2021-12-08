import java.util.Scanner;
public class FactorialCode
	{

		public static void main(String[] args)
			{
				
				factorials();
				
			}

		public static void factorials()
		{
			Scanner tanner = new Scanner(System.in);
			
			System.out.println("Input a number below 15.");
			
			int number = tanner.nextInt();
			
			int answer = 0;
			
			for(int i = number; i > 0; i--)
				{
					answer = number * i;
					answer--;
				}
			
			System.out.println(answer);
			
		}
	}
