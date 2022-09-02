
public abstract class Doctor {

	//atributos
	String nombre;
	
	
	//metodo abstracto para atender a un paciente
	public abstract void tratarPAciente();


	public Doctor(String nombre) {
		super();
		this.nombre = nombre;
	}



	
	
	
}//Cierre class doctor

////////////////////////////////////////////
class Pediatra extends Doctor{

	public Pediatra(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tratarPAciente() {
		System.out.println("El pediatra te regala una paleta");
	}//Método de tratar paciente de un pediatra
	
}//cierre class pediatra

/////////////////////////////////////////////////
class Cardiologo extends Doctor{

	public Cardiologo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tratarPAciente() {
		System.out.println("El cardiologo nos coloca muchos cables en nuestro coranzoncito");
		
	}
}//cierre clase cardiologo

////////////////////////////////////////////////
class Nutriologo extends Doctor{

	public Nutriologo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tratarPAciente() {
		System.out.println("La nutriologa nos regaña por tomar coca");
		
	}
	
}//cierre class nutriologo

////////////////////////////////////////////////

class TestDoctor {
	public static void main (String args[]) {
		Cardiologo Felipe = new Cardiologo("Felipe");
		System.out.println(Felipe.nombre);
		Felipe.tratarPAciente();
		
		Pediatra Berenice = new Pediatra("Berenice");
		System.out.println(Berenice.nombre);
		Berenice.tratarPAciente();
		
		Nutriologo Sara = new Nutriologo("Sara");
		System.out.println(Sara.nombre);
		Sara.tratarPAciente();
		
		
	}//cierre main
}//cierre class test doctor



