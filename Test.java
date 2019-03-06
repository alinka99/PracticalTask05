import java.util.Arrays;
import java.util.LinkedList;


public class Test {

	public static void main(String[] args){
		//-1?
		int N = 1000;
		int numberHeads = HeadsOrTails.getNumberHeads(1000);
		System.out.println("For N = " + N + ": heads = " + numberHeads + ", tails = " + (N - numberHeads));
		
		int number = 656, result;
		System.out.println((result = NumberCharacteristics.getGreatestDigit(number)) == -1 ? "Incorrect input!" 
				: "The greatest digit of " + number + " is " + result);
		System.out.println((result = NumberCharacteristics.checkPalindrome(number)) == -1 ? "Incorrect input!" 
				: number + ((result == 1) ? " is a palindrome" : " is not a palindrome"));
		System.out.println((result = NumberCharacteristics.checkPrimeNumber(number)) == -1 ? "Incorrect input!" 
				: number + ((result == 1) ? " is a prime number" : " is not a prime number"));
		LinkedList<Integer> list;
		System.out.println((list = NumberCharacteristics.getPrimeDivisors(number)) == null ? "Incorrect input!"
				: "Prime divisors for " + number + " are: "+ list.toString());
	}
	
}
