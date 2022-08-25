package Bai7;

public class Toado {
	private String tenToaDo = "";
	private int X;
	private int Y;
	
	public void setTenToaDo(String tenToaDo) {
		this.tenToaDo = tenToaDo;
	}
	
	public void setX(int x) {
		this.X = x;
	}
	
	public void setY(int y) {
		this.Y = y;
	}
	
	public String getTenToaDo() {
		return tenToaDo;
	}
	
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	
	public Toado() {
		
	}
	
	public Toado(int x, int y, String ten) {
		this.X = x;
		this.Y = y;
		this.tenToaDo = ten;
	}
	public double getDistance(Toado temp) {
		return Math.sqrt(Math.pow(this.X - temp.X,2) + Math.pow(this.Y - temp.Y, 2));
	}
	public String toString() {
		return tenToaDo + "(" + X + ", " + Y + ")";
	}
}
