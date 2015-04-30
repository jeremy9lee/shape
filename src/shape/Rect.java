package shape;

public class Rect extends Shape implements Drawable{
	
	private int width;
	private int height;
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw(){
		System.out.println("사각형을 그립니다.");
	}

	@Override
	public double shapeArea() {
		return width * height;
	}

	@Override
	public void visible(boolean flag) {
		if (flag == true) {
			draw();
		} else {
			System.out.println("width = " + width + ", height=" + height + "]에 사각형을 그렸습니다.");
		}
	}
}
