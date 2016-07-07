package Anshika;

import java.util.Scanner;

public class Calculater implements LearningInterface {

	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1+val2;
		
	}

	@Override
	public Integer sub(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1-val2;
	}

	@Override
	public long multiply(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return (long) (val1 * val2);
	}

	@Override
	public Integer divide(Integer val1, Integer val2)throws ArithmeticException {
		// TODO Auto-generated method stub
		System.out.println("Changed text");
		return (val1/val2);
	}
	
	public static void main(String[]args)
	{
		Calculater cal = new Calculater();
		Integer val1,val2,choice;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First number");
		val1=input.nextInt();
		
		System.out.println("Enter Second number");
		val2=input.nextInt();
		
		System.out.println("Enter choice");
		choice=input.nextInt();
		
		switch(choice)
		{
		
		case 1:
			System.out.println(cal.add(val1, val2));
			break;
		
		case 2:
			System.out.println(cal.sub(val1, val2));
			break;
		
		case 3:
			System.out.println(cal.multiply(val1, val2));
			break;
			
		case 4:
			try{
				System.out.println(cal.divide(val1, val2));
			}
			catch (ArithmeticException e)
			{
				System.out.println("can't divide by zero");
			}
			break;
		
		default:
			System.out.println("Enter from option 1 to 4");
		}
	}

}
