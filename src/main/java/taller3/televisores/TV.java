package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado; 
	private int volumen = 1;
	Control control;
	private static int numTv; 
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTv++;/*ojo*/
	}

	public void setMarca(Marca marca) {  
		this.marca = marca;
	}  
	
	public void setControl(Control control) {  
		this.control = control;
	} 
 
	public void setPrecio(int precio) {  
		this.precio = precio;
	} 
	
	public void setVolumen(int volumen) {  
		this.volumen = volumen;
	} 
	
	public void setCanal(int canal) { 
		if(canal <1 || canal >120) {
			return;
		}
		this.canal = canal;
	} 
 
	public Marca getMarca() {  
		return marca;  
	}  
	
	public Control getControl() {  
		return control;  
	}  
	
	public int getPrecio() {  
		return precio;  
	}  
	
	public int getVolumen() {  
		return volumen;  
	}  
	
	public int getCanal() {  

		return canal;  
	}  
	
	public boolean getEstado() {
		return estado;
	}
	
	public static int getNumTV() {
		return numTv;
	}
	
	public static void setNumTV(int num) {  
		TV.numTv = num;
	} 

	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public void canalUp() {
		if(this.estado = true) {
			if(this.canal +1 < 1 && this.canal+1 < 120) {
				return;
			}
			this.canal++;
		}
	}
	
	public void canalDown() {
		if(this.estado = true) {
			if(this.canal+1 < 1 || this.canal+1 > 120) {
				return;
			}
		this.canal--;
		}
	}
	
	public void volumenUp() {
		if(this.estado = true) {
			if(this.volumen+1 < 0 || this.volumen+1 >7) {
				return;
			}
			this.volumen++;
		}
	}

	public void volumenDown() {
		if(this.estado = true) {
			if(this.volumen+1 < 0 || this.volumen+1 >7) {
				return;
			}
			this.volumen--;
		}
	}

}
