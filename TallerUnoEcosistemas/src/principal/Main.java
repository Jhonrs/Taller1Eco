package principal;

import processing.core.PApplet;

public class Main extends PApplet {
	
	private Logica logica;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("principal.Main");
	}

	public void settings() {
		size(1200,700);
	}


	public void setup() {
		
		logica= new Logica(this);
	}

	public void draw() {
		logica.pintar();
	}

	public void mousePressed() {
		logica.mouse();
	}
	
	public void keyPressed() {
		logica.teclado();
	}
	
	public void keyReleased() {
		logica.soltarTeclado();
	}

}

