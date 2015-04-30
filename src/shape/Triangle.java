package shape;

public class Triangle extends Shape implements Drawable{

	private int height;
	private int width;
	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("원을 그립니다.");
	}

	@Override
	public double shapeArea() {
		return (width * height)/2;
	}
	@Override
	public void visible(boolean flag) {
		if (flag == true) {
			draw();
		} else {
			System.out.println("width = " + width + ", height=" + height + "]에 삼각형을 그렸습니다.");
		}
	}
}
