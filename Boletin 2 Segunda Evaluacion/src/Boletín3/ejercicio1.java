package Boletín3;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        coche coche1 = new coche("ABCD",10,"10",10);
        
        conductor conductor1= new conductor("48158489M","Juan");
        coche1.setConductor(conductor1);
        
        remolque remolque1= new remolque();
        
        camion camion1= new camion("45158Z",5,remolque1);
        
        coche1.mostrarDatos();
        camion1.mostrarDatos();
	}

}
