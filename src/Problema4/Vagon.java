package Problema4;

public abstract class Vagon {
public int pasageri;
public int colete;
public Vagon(int pasageri, int colete) {
	this.pasageri = pasageri;
	this.colete = colete;
}
public int getPasageri() {
	return pasageri;
}
public void setPasageri(int pasageri) {
	this.pasageri = pasageri;
}
public int getColete() {
	return colete;
}
public void setColete(int colete) {
	this.colete = colete;
}


}
