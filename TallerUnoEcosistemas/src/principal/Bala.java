package principal;

import processing.core.PImage;

public class Bala {
	private Main app;
	private Jugador jugador;
	private PImage disparo;
public Bala(Main app, Jugador jugador) {
	this.app = app;
	this.jugador = jugador;
	disparo = app.loadImage("bala");
}

public void pintar() {
	app.image(disparo);
}


}
