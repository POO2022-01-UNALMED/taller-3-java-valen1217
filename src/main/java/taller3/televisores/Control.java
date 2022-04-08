package taller3.televisores;

public class Control {
	private TV tv;

	
	public void enlazar(TV tele){
		this.tv = tele;
		tele.control = this;
	}
	
	public void setTv(TV televisor) {
		this.tv = televisor;
	}
	
	public TV getTv() {
		return tv;
	}
	
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}

	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {  
		if(canal <1 || canal >120 || this.tv.getEstado() == false) {
			return;
		}
		
		this.tv.setCanal(canal);
	} 
	
}
