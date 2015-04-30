package shape;

public class PointApp {

	public static void main(String[] args) {
		/*
		 * Point point = new Point();
		 * 
		 * point.setX(2); point.setY(5); point.show();
		 * 
		 * point.setX(10); point.setY(23); point.show();
		 */

		ColorPoint point4 = new ColorPoint(10, 50, "red");
		// point4.setColor("red");
		// point4.setX(10);
		// point4.setY(50);
		point4.show();

		// 인터페이스 테스트
		Drawable drawable = new Point(10, 20);
		drawable.draw();

		// instanceof 테스트
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		System.out.println(c instanceof Visible);

		// Error
		// System.out.println(c instanceof Rect);

		Shape s = c;
		System.out.println(s instanceof Rect);
	
	
	}
}
