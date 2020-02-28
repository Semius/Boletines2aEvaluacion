package Boletin4;

public class UtilTransformacionDatos {

	public static boolean esValorNumerico(String stringx) {
		boolean resultado = true;
		
		try {
			int x = Integer.valueOf(stringx);
		}
		catch (Exception NumberFormatException){
			System.out.println("No es un número");
			resultado=false;
		}
		
		
		
		return resultado;
	}//esValorNumerico	
	
	public static double obtenerValorDouble(String stringx) throws NumberFormatException  {
		
		double resultado=Double.valueOf(stringx);
		
		
		
		return resultado;
	}//obtenerValorDouble
	
	public static int ValorPositivo(int numero) {
		int x=1;
		
		
		
		try {
			System.out.println("a");
		}
		
		catch (Exception ValorNumericoNegativoException) {
			
		}
		
		
		return x;
		
	}//ValorPositivo
	
	Usuario[] arrayUsuarios= {new Usuario("fer1", "123456"),
			new Usuario("luis86", "000000"),
			new Usuario("ana_cps2002", "AzLmR56"),
			new Usuario("MariaFernandez", "655786995"),
			new Usuario("JZm46Y", "zxcvbnm"),
			new Usuario("___121aZ", "qwerty"),
			new Usuario("M.Rajoy", "password"),
			new Usuario("", "666666"),};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
