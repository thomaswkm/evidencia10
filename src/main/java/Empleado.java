import java.util.ArrayList;

public class Empleado extends Persona {
	public ArrayList<Empleado> colegas = new ArrayList<Empleado>();

	public Empleado(String nombre, String rut, ArrayList<Persona> amigos, ArrayList<Moto> motos, ArrayList<Empleado> colegas) {
		super(nombre, rut, amigos, motos);
		this.colegas = colegas;
	}


	public ArrayList<Empleado> getColegas() {
		return colegas;
	}
}