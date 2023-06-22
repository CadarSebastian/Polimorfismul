package Problema5;



public class GSimpla extends Greutate {
	private int capacitate;

	public GSimpla(int capacitate) {
		
		this.capacitate = capacitate;
	}

	@Override
	public int capacitate() {
		return capacitate;
	}
	public String toString() {
		return "GSimpla"+ capacitate() +"]" ;
	}
}
