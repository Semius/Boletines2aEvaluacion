package Boletin4;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringx= "1000";
		boolean esNumero;
		double x=0;
		
		
		esNumero=UtilTransformacionDatos.esValorNumerico(stringx);
		
		try {
			double numero=Double.valueOf(stringx);
		}
		catch (Exception NumberFormatException) {
			/*System.out.println("No has insertado un número");*/
		}
		if(esNumero==true) {
			x=UtilTransformacionDatos.obtenerValorDouble(stringx);
			System.out.println(x);
			}
		
	}

}