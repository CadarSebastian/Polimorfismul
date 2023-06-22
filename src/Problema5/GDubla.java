package Problema5;



public class GDubla extends Greutate {
	private Greutate g1,g2;
	
	

	public GDubla(Greutate g1, Greutate g2) {
		super();
		this.g1 = g1;
		this.g2 = g2;
	}

	public Greutate getG1() {
		return g1;
	}

	public void setG1(Greutate g1) {
		this.g1 = g1;
	}

	public Greutate getG2() {
		return g2;
	}

	public void setG2(Greutate g2) {
		this.g2 = g2;
	}

	@Override
	public int capacitate() {
		// TODO Auto-generated method stub
		return g1.capacitate()+g2.capacitate();
	}
	public String toString() {
		return "GDubla"+ capacitate() +"]" ;
	}
	
}