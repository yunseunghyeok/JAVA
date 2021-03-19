import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int number = scanner.nextInt();
		
		if((number % 10) == (number / 10)) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
	}
}
