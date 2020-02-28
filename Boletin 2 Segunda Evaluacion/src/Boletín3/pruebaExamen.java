package Boletín3;

public class pruebaExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto="texto de ejemplo";
		int x=texto.length();
		char array[]= new char[x];
		int contador=0;
		int recorrerArray=1;
		
		
		while(contador<x) {
			array[contador]=texto.charAt(contador);
			
			
			contador=contador+1;
		}//meter el texto en el array
		
		while(recorrerArray<x) {
			System.out.println(array[recorrerArray]);
			recorrerArray=recorrerArray+2;
		}//imprimir las posiciones pares del array
		
		
		
		
		

		
		
		
	}

}
