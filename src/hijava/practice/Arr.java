package hijava.practice;

public class Arr {

	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
//		ex4();
//		ex5();
		ex6();
	}

	private static void ex1() {
		int[] nums = new int[100];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			printArray(nums);
		}
	}

	private static void ex2() {
		String[] strs = new String[100];

		for (int i = 0; i < strs.length; i++) {
			strs[i] = "str" + (i + 1);
			printArray(strs);
		}
	}

	private static void ex3() {
		Man[] people = new Man[9];
		for (int i = 0; i < people.length; i++) {
			people[i] = new Man("김" + (i + 1) + "수");
		}
		for (Man man : people) {
			System.out.println(man);
		}
	}

	private static void ex4() {
		Man[] people = new Man[9];
		int len = people.length;
		for (int i = 0; i < people.length; i++) {
			people[i] = new Man("김" + (i + 1) + "수");
		}

		Man[] people2 = new Man[len];
		for (int i = 0; i < people2.length; i++) {
//			people2[i] = people[i]; // 얕은 복사 (shallow copy)
			people2[i] = new Man(people[i].getName()); // 깊은 복사 (deep copy, clone)
		}

//		생성자를 통해 새로 instance 를 만들어준 것이 아니라면 
//		얕은 복사로 javascript 에서의 얕은 복사(주소값 공유)와 동일
//		따라서, people[0] 을 바꾸었지만, people2[0] 이 바뀐 것 확인 가능

//		생성자를 통해 새로 instance 를 만들어준 것이라면
//		깊은 복사에 해당하며 people[0] 을 바꾸어도 people2[0] 은 바뀌지 않는 것 확인 가능

		people[0].setName("김10수");
		for (Man man : people2) {
			System.out.println(man);
		}
	}

	private static void ex5() {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

//		System.arraycopy(from, startIndex, to, startIndex, count)
		System.arraycopy(arr1, 0, arr2, 2, 3);

		for (int i : arr2) {
			System.out.println(i);
		}

	}

	private static void ex6() {
//		A-Z : 65-90
//		a-z : 97-122
		int upperStart = 65;
		int lowerStart = 97;

		int[] starts = new int[] { upperStart, lowerStart };
		char[][] arr = new char[2][26];

		for (int start = 0; start < starts.length; start++) {		
			for (int i = 0; i < 26; i++) {
				int x = i + starts[start];
//				System.out.println(x + "=" + (char) x);
				arr[start][i] = (char)x;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
