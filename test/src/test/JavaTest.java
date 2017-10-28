package test;

public class JavaTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力");

		int input = new java.util.Scanner(System.in).nextInt();

		for (int x : numbers){
			if(x == input){
				System.out.println("あたり");
			}
		}


	}

}
