package principal;

import processing.core.PImage;

public class Roca extends Obstaculo {

	private PImage roca;
	public Roca(Main app) {
		
		super(app);
		roca = app.loadImage("Roca.png");
		
	}

	@Override
	public void pintar() {
				app.image(roca,x,y);
	}

}
