package hijava.practice;

public class Casting {

	public static void main(String[] args) {
		byte b = 1;
		
//		4byte 자리에 1byte 를 넣으므로 에러 발생X
		int i = b;
		
//		int 와 long 을 더하는 경우 타입이 long 으로 바뀜
		long l = 1234567;
		
		System.out.println(i + l);
	}

}
