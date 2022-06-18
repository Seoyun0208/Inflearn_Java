package hijava.practice;

public class Oper {

	public static void main(String[] args) {
		int i = 0;
		System.out.println(i);
		
		i++; // i = i + 1;
		System.out.println(i);
		
		i--; // i = i - 1;
		System.out.println(i);
		
		System.out.println(++i); // i 에 1 을 더한 값을 출력
		System.out.println(i++); // i 를 출력하고 1을 더함
		
		System.out.println("------------"); 
		
		int k1 = (i > 0) ? 100 : 1000;
		int k2 = !(i > 0) ? 100 : 1000;
		
		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);
	}

}
