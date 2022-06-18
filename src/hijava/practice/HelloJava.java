package hijava.practice;

public class HelloJava {

	public static void main(String[] args) {

//		HelloJava 에게 say 라는 명령을 내림!
		HelloJava.say("Hi~");

//		JVM 이 스스로 화면에 출력
		System.out.println("Hello, Java!!!");
	}

	public static void say(String msg) {
		System.out.println(msg);
	}

}
