import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		int c = (int)s.charAt(0);
		for(int i = c; i >= 97; i--) {
			for(int j = 0; j <= i - 97; j++) {
				char a = (char) (97 + j);
				System.out.print(a);
			}
			System.out.print("\n");
		}
		scanner.close();
}
}
