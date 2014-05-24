package test;

public class Cordonne {
	int x ;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Cordonne(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Cordonne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public  int  somme() {
		return x+y;
	}

}
