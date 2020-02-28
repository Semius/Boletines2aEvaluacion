package Boletín3;

public class camion extends vehiculo {
	private int altura;
	private remolque remolque;
	
	public camion(String matricula, int vMaxima, remolque remolque) {
		this.setMatricula(matricula);
		this.setvMaxima(vMaxima);
		this.setRemolque(remolque);
	}
	
	public int getAltura(){
		return altura;
	}
	public void setAltura(int altura) {
		this.altura=altura;
	}
	
	
	public remolque getRemolque() {
		return remolque;
	}
	public void setRemolque(remolque remolque) {
		this.remolque=remolque;
	}
	
	public void mostrarDatos() {
		System.out.println(altura);
		super.mostrarDatos();
	}
	
}
