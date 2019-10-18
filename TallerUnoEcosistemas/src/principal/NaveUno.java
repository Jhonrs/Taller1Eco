package principal;

import processing.core.PImage;

public class NaveUno extends Jugador {
	
	
	private PImage naveUno;
	
	public NaveUno(Main app, int x) {
		super(app,x);
		
		/* Cargar Img*/
		naveUno = app.loadImage("NaveUno.png");
	}

	@Override
	public void pintar() {
		app.image(naveUno, x, y);
		
		
		if (moverIzq && x > 15) {
			x -= 14;
		}
		
		if (moverDer && x < 1100) {
			x += 14;
		}
	}

	@Override
	public void mover() {
		switch (app.key) {
		case 'd':
			moverDer = true;
			moverIzq = false;
			break;
		case 'a':
			moverIzq = true;
			moverDer = false;
			break;

		}
		
	}

	public void parar() {
		switch (app.key) {
		case 'd':
			moverDer = false;
			break;
		case 'a':
			moverIzq = false;
		
			break;
	}
	
	}
}
