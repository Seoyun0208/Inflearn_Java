package hijava.practice;

// 소수의 합 구하기
public class Prime {

	public static void main(String[] args) {
		int total = 0;
		for (int num = 2; num <= 100; num++) {				
			boolean isPrime = true;
			
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				{ 	System.out.println(num + " is Prime Number!!");
					total += num;}
			else
				System.out.println(num + " is Not Prime Number!!");
		}
		System.out.printf("\nPrime total : %d",total);
	}

}
