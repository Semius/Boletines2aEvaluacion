package Boletín3;

public class coche extends vehiculo {
	
	private int numeroPlazas;
	
	public coche(String matricula, int vMaxima, String tipo, int numeroPlazas) {
		
		this.setMatricula(matricula);
		this.setvMaxima(vMaxima);
		this.setTipo(tipo);
		this.numeroPlazas=numeroPlazas;
	
	}
	
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroplazas(int numeroPlazas) {
		this.numeroPlazas=numeroPlazas;
	}
	
	public void mostrarDatos() {
		System.out.println(numeroPlazas);
		super.mostrarDatos();
		
	}
	
	
	
}