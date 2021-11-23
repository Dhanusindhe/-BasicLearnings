package basic.concepts;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.functors.WhileClosure;

public class IterativeStatements {

	public static void main(String[] args) {

		// Learning basics
		int[] marks = { 99, 88, 76, 89, 93 };
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		float percentage = total / marks.length + 1;

		System.out.println("The total mark is " + total + " " + "Percentage is " + percentage);

		// Learning if

		int totalEve = 0;
		int totalOdd = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("The number " + i + " is Even");
				totalEve = totalEve + i;
			} else {
				System.out.println("The number " + i + " is Odd");
				totalOdd = totalOdd + i;
			}
		}
		System.out.println("The sum of even numbers are " + totalEve);
		System.out.println("The sum of even numbers are " + totalOdd);

		System.out.println("The program got run");

		// Learning else if

		int num = 21;
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("TRIZZ-FIZZ");
		} else if (num % 5 == 0) {
			System.out.println("FIZZ");
		} else {
			System.out.println("TRIZZ");
		}

		boolean password = false;
		if (password == true) {
			System.out.println("The password is Correct");
		} else {
			System.out.println("The password is Incorrect");
		}

		// Learning while

		int numbers = -1;
		System.out.println("The first ten negative numbers are ");

		while (numbers > -11) {

			System.out.println(" " + numbers + ",");
			numbers--;
		}

		// Learning do while

		int number = 1;
		System.out.println("The first ten possitive numbers are ");
		do {

			System.out.println(" " + number + ",");
			number++;
		} while (number < 11);

		// Learning Continue

		int value = 20;
		System.out.println("The first ten even numbers are");
		for (int i = 1; i <= value; i++) {
			if (i % 2 != 0) {
				continue;
			}

			System.out.println(i);
		}

		// Learning Break

		int i;
		int sum = 0;
		for (int j = 1; j < 20; j++) {
			if (j % 2 == 0) {
				sum = sum + j;
				if (sum == 30) {
					break;
				}
				System.out.println(sum);
			}

		}

	}
}
