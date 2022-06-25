package hijava.practice;

public class Man {
	public static final int COFFEE = 3000;
	public static final int DONUT = 2500;
	private String name;
	private int amount;
	
	public Man() {
		this.amount = 10000;
	}
	
	public Man(String name) {
		this();
		this.name = name;
	}
	
	public void buyCoffee(int count) {
//		this.amount = this.amount - COFFEE * count;
//		this.amount -= COFFEE * count;
		this.subAmount(COFFEE, count);
	}
	
	public void buyDonut(int count) {
//		this.amount = this.amount - DONUT * count;
//		this.amount -= DONUT * count;
		this.subAmount(DONUT, count);
	}
	
//	buyCoffee 와 buyDonut 의 코드가 겹치므로 subAmount 함수로 빼줌
	private void subAmount(int price, int count) {
		this.amount -= price * count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return this.name + "님의 잔액은 " + this.amount + "원입니다.";
	}

	public static void main(String[] args) {
		Man hong = new Man("Hong");
		Man john = new Man("John");
		
		hong.buyCoffee(1);
		hong.buyDonut(2);
		
		john.buyCoffee(2);
		john.buyDonut(1);
		
		System.out.println("hong = " + hong.getAmount());
		System.out.println("john = " + john.getAmount());
		System.out.println(hong.toString());
		System.out.println(john.toString());
		
	}

}
