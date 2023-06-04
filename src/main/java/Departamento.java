import java.util.ArrayList;

public class Departamento {
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	private Area area;

	public Departamento(ArrayList<Grupo> grupos, Area area) {
		this.grupos = grupos;
		this.area = area;
	}

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}


}