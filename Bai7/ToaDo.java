package Bai7;

public class ToaDo {
		private float x;
		private float y;
		private String name;
		
		public ToaDo() {
		}
		public ToaDo(float x,float y) {
			setX(x);
			setY(y);
		}
		public void setX(float x) {
			this.x = x;
		}
		public void setY(float y) {
			this.y = y;
		}
		public float getX() {
			return x;
		}
		public float getY() {
			return y;
		}
		
}

