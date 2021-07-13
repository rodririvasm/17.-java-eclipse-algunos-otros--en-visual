package paquete1;

public class Persona {
	
	String nombre="";
	
	//acceso privado
	private int edad=0;
	
	//modificador protected
	
	protected String domicilio="";
	
	//modificador de acceso publico
	
	public float  estatura=0;
	
	String saludar() {
		
		return "hola,mi nombres es:"+this.nombre+"mi edad es:"+this.edad
				+"mi domicilio es:"+this.domicilio+"mi estatura:"+this.estatura;
	}
}
