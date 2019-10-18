package principal;

import processing.core.PImage;

public class EnemigoDos extends Obstaculo {

	private PImage enemigoDos;
	public EnemigoDos(Main app) {
		
		super(app);
		enemigoDos = app.loadImage("EnemigoDos.png");
		
	}

	@Override
	public void pintar() {
		app.image(enemigoDos,x,y);
	}

}