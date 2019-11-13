
public class CCValidation
	{
		static long validCard = (long) 5424180123456789.;
		static long invalidCard = (long) 5424180123456788.;
		static long[] creditNumbers = new long[16];
		static long vCard = validCard;
		static long inCard = invalidCard;

		public static void main(String[] args)
			{
				doubleNumbers();
			}

		public static void doubleNumbers()
			{

				for (long i = 0; i < creditNumbers.length; i = i + 2)
					{
						long lastDigit = validCard % 10;

						validCard /= validCard / 10;
						creditNumbers[15] = lastDigit;

					}
			}

	}
