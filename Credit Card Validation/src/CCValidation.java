
public class CCValidation
	{
//		5424180123456789.
		static long validCard = (long) 5424180123456789.;
		static long invalidCard = (long) 5424180123456788.;
		static long[] creditNumbers = new long[16];
		static long vCard = validCard;
		static long inCard = invalidCard;

		public static void main(String[] args)
			{

				stripNumbers();
				doubleNumbers();
				addNumbers();
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
				System.out.println(vCard);
				for (int i = creditNumbers.length - 1; i >= 0; i--)
					{
						long lastDigit = validCard % 10;

						validCard /= 10;
						creditNumbers[i] = lastDigit;
					}
			}

	}
