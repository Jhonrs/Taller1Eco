package principal;

import processing.core.PApplet;

public abstract class Obstaculo{

	protected Main app;
	protected int tiempo;
	protected int x;
	protected int y;
	protected int punt;
	protected int hardcore;
	
	public Obstaculo(Main app) {
		
		this.app=app;
		this.tiempo = tiempo;
		x=(int)app.random(app.width);
		y = 100;
		punt = 0;
		hardcore = 3;
	}
	

	public abstract void pintar();
	
	public void mover() {
		y++;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	

	
	
}
