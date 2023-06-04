import java.util.ArrayList;

public class Condominio {
	private String nombre;
	private ArrayList<Casa> casas = new ArrayList<Casa>();

	public Condominio(String nombre, ArrayList<Casa> casas) {
		this.nombre = nombre;
		this.casas = casas;
	}

	public void agregarCasa(Casa c){
		casas.add(c);
	}

	public void removerCasa(Casa c){
		casas.remove(c);
	}

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Casa> getCasas() {
		return casas;
	}

	public void agregarHabitante(Casa c, Persona p){
		c.getHabitantes().add(p);
	}
	public void removerHabitante(Casa c, Persona p){
		c.getHabitantes().remove(p);
	}
}