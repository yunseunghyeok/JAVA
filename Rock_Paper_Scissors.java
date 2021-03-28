import java.util.Scanner;
public class java {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String user;
		String stop = "그만";
		String str[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		do {
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			int n = (int)(Math.random()*3);
			if(str[n].equals("가위")) {
				if(user.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
				else if(user.equals("바위"))
					System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				else if(user.equals("보"))
					System.out.println("사용자 = 보, 컴퓨터 = 가위, 사용자가 졌습니다.");
			}
			
			else if (str[n].equals("바위")) {
				if(user.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 바위, 사용자가 졌습니다.");
				else if(user.equals("바위"))
					System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
				else if(user.equals("보"))
					System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
			}
			
			else if (str[n].equals("보")) {
				if(user.equals("가위"))
					System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
				else if(user.equals("바위"))
					System.out.println("사용자 = 바위, 컴퓨터 = 보, 사용자가 졌습니다.");
				else if(user.equals("보"))
					System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
			}
			
		}while(user.compareTo(stop) != 0);
		System.out.println("게임을 종료합니다...");
		scanner.close();
	}

}
