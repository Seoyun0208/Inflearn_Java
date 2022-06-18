package hijava.practice;

public class Sum100 {

	public static void main(String[] args) {
		sumByWhile1();
		System.out.println();
		sumByWhile2();
		System.out.println();
		sumByFor();
	}

	
//		1 부터 100까지의 합을 구하시오.
	private static void sumByWhile1() {
		int i = 0;
		int sum = 0;

		while (++i <= 100) {
			System.out.println("i = " + i);
			sum += i;
		}

		System.out.println("--------------");
		System.out.println("total : " + sum);

	}

//		1 부터 100까지의 수 중에서 홀수의 합을 구하시오.
	private static void sumByWhile2() {
		int i = 0;
		int sum = 0;

		while (++i <= 100) {

			if (i % 2 == 0)
				continue;

			System.out.println("i = " + i);
			sum += i;
		}

		System.out.println("--------------");
		System.out.println("total : " + sum);

	}
	
	
//	1 부터 100까지의 합을 구하시오.
	private static void sumByFor() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println("i = " + i);
			sum += i;
		}
		
		System.out.println("--------------");
		System.out.println("total : " + sum);
		
	}

}
