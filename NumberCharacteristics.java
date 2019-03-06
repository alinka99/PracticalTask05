import java.util.LinkedList;


public class NumberCharacteristics {

	public static int getGreatestDigit(int number){
		
		if (number <= 0){
			return -1;
		}
		
		int max = 0;
		
		if (number < 10){
			max = number;
		} else {
			while (number > 10){
				int digit = number % 10;
				if (digit > max){
					max = digit;
				}
				number = number / 10;
			}
		}
		
		return max;
	}
	

	public static int checkPalindrome(int number){
		
		if (number <= 0){
			return -1;
		}
		
		int isPalindrome = 1;
		
		if (number > 10){
			
			int reverseNumber = 0, temp = number;
			
			while (temp != 0){
				reverseNumber = reverseNumber * 10 + temp % 10;
				temp /= 10;
			}
			
			if (reverseNumber != number){
				isPalindrome = 0;
			}
		}
		
		return isPalindrome;
		
	}
	
	
	public static int checkPrimeNumber(int number){
		
		if (number <= 0){
			return -1;
		}
		
		int isPrimeNumber = 1;
		
		if (number == 1){
			isPrimeNumber = 0;
		} else if (number != 2){
			
			int bound = (int)Math.sqrt(number);
			
			for (int i = 2; i <= bound; i++){
				if (number % i == 0){
					isPrimeNumber = 0;
					break;
				}
			}
		}
		
		return isPrimeNumber;
	}
	
	public static LinkedList<Integer> getPrimeDivisors(int number) {
		
		if (number <= 0) {
			return null;
		}
		
		LinkedList<Integer> primeDivisors = new LinkedList<>();
		
		if (checkPrimeNumber(number) == 1) {
			primeDivisors.add(number);
		} else {
			for (int i = 2; i < number / 2; i++) {
				if ((number % i == 0) && (checkPrimeNumber(i) == 1)) {
					primeDivisors.add(i);
				}
			}
		}
		
		return primeDivisors;
	}
	
}

