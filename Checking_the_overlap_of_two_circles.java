import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int xnum1 = scanner.nextInt();
		int ynum1 = scanner.nextInt();
		int radius1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int xnum2 = scanner.nextInt();
		int ynum2 = scanner.nextInt();
		int radius2 = scanner.nextInt();
		
		if((radius1 + radius2) >= Math.sqrt((xnum1 - xnum2)*(xnum1 - xnum2) + (ynum1 - ynum2)*(ynum1 - ynum2))) {
			System.out.print("두 원은 서로 겹친다.");
		}
		else
			System.out.print("두 원은 서로 겹치지 않는다.");
		
		scanner.close();
}
}
