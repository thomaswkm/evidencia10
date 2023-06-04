import java.util.ArrayList;

public class Grupo {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public Grupo(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

}