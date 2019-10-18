package principal;

import processing.core.PImage;

public class EnemigoUno extends Obstaculo {

	private PImage enemigoUno;
	public EnemigoUno(Main app) {
		
		super(app);
		enemigoUno = app.loadImage("EnemigoUno.png");
		
	}

	@Override
	public void pintar() {
				app.image(enemigoUno,x,y);
	}

}
