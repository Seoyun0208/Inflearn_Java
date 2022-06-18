package hijava.practice;

// 구구단 출력
public class ForLoop1 {

	public static void main(String[] args) {
		// 2 ~ 9 loop
		// 1 ~ 9 loop
		for (int i = 2; i <= 9; i++) {
			System.out.println("--- " + i + "단 ---");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i,j,i*j);
			}
			System.out.println();
		}

	}

}
