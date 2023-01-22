import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은 ?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		for(int j = 2; j < number+1; j++) {
			for(int i = 1; i < number+1; i++) {
			System.out.println(j * i);
			}
		}
		// 반복문 속의 반복문
	}

}
