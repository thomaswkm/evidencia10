import java.util.ArrayList;

public class Casa {
	private ArrayList<Persona> habitantes = new ArrayList<Persona>();

	public Casa(ArrayList<Persona> habitantes) {
		this.habitantes = habitantes;
	}


	public ArrayList<Persona> getHabitantes() {
		return habitantes;
	}

}