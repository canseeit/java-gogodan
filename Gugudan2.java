import java.util.Scanner;

public class Gugudan2 {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은 ? : ");
		Scanner scanner = new Scanner(System.in);
		
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for (int h = 2; h < first+1; h++) {
			for (int i = 1; i < second+1; i++) {
				System.out.println(h * i);
			}
		}
	}

}
