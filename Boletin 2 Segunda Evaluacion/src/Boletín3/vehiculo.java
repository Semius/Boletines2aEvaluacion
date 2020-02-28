package Boletín3;

public class vehiculo {
	private String matricula;
	private String tipo;
	private int vMaxima;
	private conductor conductor;
	

	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	public int getvMaxima() {
		return vMaxima;
	}
	public void setvMaxima(int vMaxima) {
		this.vMaxima=vMaxima;
	}
	
	public conductor getConductor(){
		return conductor;
	}
	public void setConductor(conductor conductor) {
		this.conductor=conductor;
	}
	
	//metodos
	
	public void mostrarDatos() {
		System.out.println(matricula);
		System.out.println(tipo);
		System.out.println(vMaxima);
		System.out.println(conductor);
	}
}
