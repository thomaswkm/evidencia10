import java.util.ArrayList;

public class Mascota {
	protected String nombre;
	protected String color;
	protected ArrayList<Persona> dueño = new ArrayList<Persona>();

	public String getNombre() {
		return this.nombre;
	}

	public String getColor() {
		return this.color;
	}

	public void comer() {
		throw new UnsupportedOperationException();
	}

	public Mascota(String nombre, String color) {
		throw new UnsupportedOperationException();
	}
}