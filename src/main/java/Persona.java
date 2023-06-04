import java.util.ArrayList;

public class Persona {
	protected String nombre;
	protected String rut;
	private ArrayList<Persona> amigos = new ArrayList<Persona>();
	private ArrayList<Moto> motos = new ArrayList<Moto>();

	public Persona(String nombre, String rut, ArrayList<Persona> amigos, ArrayList<Moto> motos) {
		this.nombre = nombre;
		this.rut = rut;
		this.amigos = amigos;
		this.motos = motos;
	}

	public void agregarAmigo(Persona p){
		amigos.add(p);
	}
	public void removerAmigo(Persona p){
		amigos.remove(p);
	}

	public void agregarMoto(Moto m){
		motos.add(m);
	}
	public void removerMoto(Moto m){
		motos.remove(m);
	}
	public String getNombre() {
		return this.nombre;
	}

	public String getRut() {
		return this.rut;
	}
}