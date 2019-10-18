package principal;

import java.util.ArrayList;

import processing.core.PFont;
import processing.core.PImage;

public class Logica {

	private Main app;
	private int pantalla;
	private PImage inicio;
	private PImage juego;
	private NaveUno player1;
	private NaveDos player2;
	private Contador contador;
	private ArrayList<Obstaculo>obstaculos;
	private PFont font;


	public Logica(Main app) {
		this.app = app;
		inicio = app.loadImage("inicio.png");
		juego = app.loadImage("juego.png");
		
		// Cargar fuente
		
		this.font = this.app.createFont("space age.ttf", 30);
		player1 = new NaveUno(app, 56);
		player2 = new NaveDos(app, 956);
		contador = new Contador();
		contador.start();
		System.out.println(contador);
		// Arraylist de obstaculos
		obstaculos = new ArrayList<Obstaculo>();
		for (int i = 0; i < obstaculos.size(); i++) {
			obstaculos.add(new EnemigoUno(app));
		}
		
		for (int i = 0; i < obstaculos.size(); i++) {
			obstaculos.add(new EnemigoDos(app));
		}
		
		for (int i = 0; i < obstaculos.size(); i++) {
			obstaculos.add(new Roca(app));
		}
	}

	public void pintar() {

		switch (pantalla) {
		case 0:
			app.imageMode(app.CORNER);
			app.image(inicio, 0, 0);

			break;

		case 1:
			app.imageMode(app.CORNER);
			app.image(juego, 0, 0);
			player1.pintar();
			player2.pintar();
			
			for (int i = 0; i < obstaculos.size(); i++) {
				obstaculos.get(i).pintar();
			}
			
			app.fill(0);
			app.textSize(30);
			app.text(contador.contador,568, 72);
			/*if(contador == 0) {
				contador.stop();
			}*/
			break;

		}

	}

	public void mouse() {
		System.out.println("x" + app.mouseX + " " + "y" + app.mouseY);
		switch (pantalla) {
		case 0:

			if (app.mouseX > 348 && app.mouseY > 480 && app.mouseX < 805 && app.mouseY < 598) {
				pantalla = 1;
				
				for (int i = 0; i < obstaculos.size(); i++) {
					obstaculos.get(i).mover();
				}
			}
			break;
		case 1:
			pantalla = 0;
			break;
		}
	}

	public void teclado() {
		
		
		if (pantalla == 1) {
			player1.mover();
			player2.mover();
			
		}
	}

	public void soltarTeclado() {
		if (pantalla == 1) {
			player1.parar();
			player2.parar();
			
		}
	}
}
