package hijava.practice;

public class School {

	public static void main(String[] args) {
		
//		생성자가 없을 때에만 기본 생성자를 자동으로 만들어 줌
		Score korean = new Score();
		
		korean.setSubject("국어");
		korean.setScore(90);
		korean.prof = "배미진";
		
		String k = korean.toString();
		
		System.out.println(korean.toString());
		System.out.println(k);
		System.out.println(korean.prof);
		
//		새로운 생성자 만들기
//		새로운 생성자를 만들면 자동으로 만들어주던 기본 생성자는 사라지므로, 직접 만들어주어야 함
		Score math = new Score("수학", 80);
		
		String m = math.toString();
		
		System.out.println(math.toString());
		System.out.println(m);
		
		Score science = new Score("과학");
		
		String s = science.toString();
		
		System.out.println(science.toString());
		System.out.println(s);
		
	}

}
