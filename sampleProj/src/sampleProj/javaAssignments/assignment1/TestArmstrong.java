package sampleProj.javaAssignments.assignment1;

public class TestArmstrong {

	public static void main(String[] args) {
		
		findGivenArmstrongNumber();
		findFallingArmstrongNumber();
    }

	private static void findFallingArmstrongNumber() {
		int n, b, sum = 0;
        System.out.print("Armstrong numbers from 100 to 999: ");
        for(int i = 100; i <= 999; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }

		
	}

	private static void findGivenArmstrongNumber() {
		int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
		
	}

}
