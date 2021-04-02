class Rectangle {
	private int area;
	private int pointx;
	private int pointy;
	private int sizex;
	private int sizey;
	public Rectangle(int x, int y, int width, int height) {
		area = width * height;
		pointx = x;
		pointy = y;
		sizex = width;
		sizey = height;
	}
	public int square() {
		return area;
	}
	public void show() {
		System.out.println("(" + pointx + "," + pointy + ")에서 크기가 " + sizex + "*" + sizey + "인 사각형");
	}
	public boolean contains(Rectangle r) {
		if(r.pointx + r.sizex < 11 && r.pointy + r.sizey < 11) {
			return true;
		}
		else
			return false;
	}

}
public class area {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}
		if(t.contains(s)) {
			System.out.println("t는 s을 포함합니다.");
		}
	}

}
