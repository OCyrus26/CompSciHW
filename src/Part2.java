import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {

		//E5.4
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = scan.nextInt();
		System.out.print("Input second number: ");

		int num2 = scan.nextInt();
		System.out.print("Input third number: ");
		int num3 = scan.nextInt();

		if (num1 == num2 && num1 == num3)
		{
			System.out.println("All the same");
		}
		else if ((num1 == num2) || (num1 == num3) || (num3 == num2))
		{
			System.out.println("Neither");
		}
		else
			System.out.println("All different");

		//E5.7
		System.out.print("Enter first number: ");
		int num11 = scan.nextInt();
		System.out.print("Enter second number: ");
		int num22 = scan.nextInt();
		System.out.print("Enter third number: ");
		int num33 = scan.nextInt();
		if ((num11<num22) && (num22>num33))
		{
			System.out.println("In order");
		}
		else if ((num11<num22) && (num22<num33))
		{
			System.out.println("In order");
		}
		else
		{
			System.out.println("Not in order");
		}

		//E5.8
		System.out.println("Enter four numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		if((a==b && c == d)|| (a==c && b==d) || (c==b && a==d))
		{

			System.out.println("Two pairs: "+a+b+c+d );

		}
		else
		{
			System.out.println("Not two pairs: "+a+b+c+d );
		}



		//E5.10
		double workerP;
		double payS;
		
		
		System.out.println("Enter the employee's name: ");
		String name = scan.next();
		System.out.println("Enter the hourly wage of the worker: ");
		double pay = scan.nextDouble();
		System.out.println("Enter the amount of hours worked in the past week:");
		double hourNumber = scan.nextDouble();
				if (hourNumber<= 40)
					//regular pay
				{
					payS = pay * hourNumber;
					System.out.println("Paycheck: $" + payS);
				}
				else
					//overtime
				{
					double a1 = pay * 40;
					double b1 = (hourNumber - 40) * (pay * 1.5);
					payS = a1 + b1;
					System.out.println("Paycheck: $" + payS);
				}


				//E5.11-liquid solid or gas
				System.out.println("Enter the temperature: ");
				double temp = scan.nextDouble();
				System.out.println("Enter C for Celsius or F for Fahrenheit: ");
				String tType = scan.next();

				if (tType.equals("F") && temp <= 32)
				{
					
					System.out.println("The water is solid");
				}
				else if (tType.equals("F") && temp >= 212)
				{
					System.out.println("The water is gas");
				}
				else if (tType.equals("F") && temp > 32 && temp < 212)
				{
					System.out.println("The water is liquid");
				}
				else if (tType.equals("C") && temp <= 0)
				{
					System.out.println("The water is solid");
				}
				else if (tType.equals("C") && temp >= 100)
				{
					System.out.println("The water is gas");
				}
				else
				{
					System.out.println("The water is liquid!");
				}
}
}