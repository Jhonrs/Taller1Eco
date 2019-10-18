package principal;

public abstract class Jugador {
	protected Main app;
	protected int x;
	protected int y;
	protected boolean moverIzq;
	protected boolean moverDer;
	
	public Jugador(Main app, int x){
		this.app=app;
		this.x = x;
		y = 500;
		moverIzq = false;
		moverDer = false;
	}
	
	public abstract void pintar();
	
	public abstract void mover();
	
	public abstract void parar();
}