package Problema5;

import java.util.ArrayList;



public class ColectieGreutati {

	
	private int limita;
	private ArrayList<Greutate>colectie;
	
	public ColectieGreutati(int limit) {
		if(limita <=0)
			limita=1;
		this.limita = limita;
		colectie = new ArrayList<Greutate>();
	}
	public boolean adaugaGreutate(Greutate g) {
		if(colectie.size() == limita) {
			System.out.println("S-a atins limitra de greutati suportate");
		return false;
		}
		return colectie.add(g);
	}
	
	public double medie() {
		double media=capacitateTotala()/colectie.size();
		return media;
	}
	public int capacitateTotala() {
		int capacitate=0;
		for(Greutate g:colectie)
			capacitate +=g.capacitate();
		return capacitate;
	}




	public static void main(String[] args) {
Greutate gs1= new GSimpla(10);
Greutate gs2=new GSimpla(5);

GDubla gd=new GDubla(gs1,gs2);
System.out.println(gd);

ArrayList<Greutate>gLista = new ArrayList<Greutate>();
gLista.add(gs1);
gLista.add(gs2);
gLista.add(gd);



GMultipla gm = new GMultipla(gLista);
System.out.println(gm);

ColectieGreutati colectie = new ColectieGreutati(5);
colectie.adaugaGreutate(gs1);
colectie.adaugaGreutate(gs2);
colectie.adaugaGreutate(gd);
colectie.adaugaGreutate(gm);
System.out.println(colectie.capacitateTotala());
System.out.println("Greutate mdeie: "+ colectie.medie());
	}

}