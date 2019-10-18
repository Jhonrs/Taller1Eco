package principal;

import processing.core.PImage;

public class NaveDos extends Jugador {
	
	
	private PImage naveDos;
	
	public NaveDos(Main app, int x) {
		super(app,x);
		
		/* Cargar Img*/
		naveDos = app.loadImage("NaveDos.png");
	}

	@Override
	public void pintar() {
		app.image(naveDos, x, y);
		
		
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
		case 'l':
			moverDer = true;
			moverIzq = false;
			break;
		case 'j':
			moverIzq = true;
			moverDer = false;
			break;

		}
		
	}

	public void parar() {
		switch (app.key) {
		case 'l':
			moverDer = false;
			break;
		case 'j':
			moverIzq = false;
		
			break;
	}
	
	}
}
