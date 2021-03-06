package hijava.practice;

import java.util.ArrayList;

// 소수의 합 구하기
public class Prime {

	public static void main(String[] args) {
		int total = 0;

		for (int num = 2; num <= 100; num++) {
			boolean isPrimeNumber = true;
			isPrimeNumber = isPrime(num);

			if (isPrimeNumber) {
				System.out.println(num + " is Prime Number!!");
				total += num;
//				primeList.add(num);
			} else
				System.out.println(num + " is Not Prime Number!!");
		}
		System.out.printf("\nPrime total : %d", total);
	}

	// 소수 판별하기

	private static ArrayList<Integer> primeList = new ArrayList<>();

	private static boolean isPrime(int num) {
//		System.out.println(primeList);
		for (Integer j : primeList) {
			if (num % j == 0) {
				return false;
			}
		}
		primeList.add(num);
		return true;
	}

}
