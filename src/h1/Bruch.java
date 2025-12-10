package h1;

public class Bruch {
	public int zaehler;
	public int nenner;
	
	public Bruch (int zahler, int nenner, int zaehler) {	
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
		
	private int ggT(int x, int y) {
		
		x = Math.abs(x);
		y = Math.abs(y);
		
		while (y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}	
		return x;
	}
	
	public void shorten () {
		
		if (zaehler == 0) {
			nenner = 1;
			return;
		}
		
	int teiler = ggT(zaehler, nenner);
	
	if (teiler != 0 && teiler != 1) {
		zaehler = zaehler / teiler;
		zaehler = nenner / teiler;
		}
	}
	
	public boolean hasSameValueAs(Bruch b) {
		
		return this.zaehler * b.nenner == b.nenner * this.nenner;
	}
	
	public String toString() {
		return zaehler + "/" + nenner;
	}
	
}
