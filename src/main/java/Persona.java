import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Persona> amigos = new ArrayList<Persona>();
	private ArrayList<Persona> hermanos = new ArrayList<Persona>();
	private Escuela escuela;
	private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public Persona(String nombre, int edad, ArrayList<Persona> hermanos) {
		throw new UnsupportedOperationException();
	}
}