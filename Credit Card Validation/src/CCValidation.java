import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CCValidation
	{

		static long validCard = (long) 5424180123456789.;
		static long invalidCard = (long) 5424180123456788.;
		static long[] creditNumbers = new long[16];
		static long vCard = validCard;
		static long inCard = invalidCard;
		static long cardNumber;

		public static void main(String[] args) throws IOException
			{
				Scanner file = new Scanner(new File("CreditCardNumbers"));
				while (file.hasNext())
					{
						cardNumber = file.nextLong();
						stripNumbers();
						doubleNumbers();
						addNumbers();
					}

			}

		

		private static void addNumbers()
			{
				int sum = 0;
				for (int j = 0; j < creditNumbers.length; j++)
					{
						sum += creditNumbers[j];

					}
				if (sum % 10 == 0)
					{
						System.out.println("This number is a valid credit card number.");
					}
				else
					{
						System.out.println("This is not a valid credit card number.");
					}
			}

		private static void doubleNumbers()
			{
				for (int c = 0; c < creditNumbers.length; c = c + 2)
					{
						creditNumbers[c] *= 2;
						if (creditNumbers[c] >= 10)
							{
								long newDigit = (creditNumbers[c] / 10) + (creditNumbers[c] % 10);
								creditNumbers[c] = newDigit;
							}
					}
			}

		public static void stripNumbers()
			{
				System.out.println(cardNumber);
				for (int i = creditNumbers.length - 1; i >= 0; i--)
					{
						long lastDigit = cardNumber % 10;

						cardNumber /= 10;
						creditNumbers[i] = lastDigit;
					}
			}

	}
