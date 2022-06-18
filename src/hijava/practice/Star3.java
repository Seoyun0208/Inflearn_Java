package hijava.practice;

// 별 찍기
public class Star3 {

	public static void main(String[] args) {
		int line = 5;
		for (int i = 1; i <= line; i++) {
			
			for (int j = 1; j <= (line - i); j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
