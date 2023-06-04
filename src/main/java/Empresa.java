import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public Empresa(String nombre, ArrayList<Departamento> departamentos) {
		this.nombre = nombre;
		this.departamentos = departamentos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void agregarDepartamento(Departamento d){
		if(departamentos.size()<5){
			departamentos.add(d);
		}else{
			System.out.println("No puedes agregar más departamentos");
		}
	}

	public void removerDepartamento(Departamento d){
		departamentos.remove(d);
	}

	public void agregarGrupo(Departamento d, Grupo g){
		d.getGrupos().add(g);
	}

	public void removerGrupo(Departamento d, Grupo g){
		d.getGrupos().remove(g);
	}

	public void agregarEmpleados(Grupo g, Empleado e1, Empleado e2, Empleado e3, Empleado e4, Empleado e5){
		if(g.getEmpleados().size()==0){
			g.getEmpleados().add(e1);
			g.getEmpleados().add(e2);
			g.getEmpleados().add(e3);
			g.getEmpleados().add(e4);
			g.getEmpleados().add(e5);
		}
	}

	public void removerEmpleado(Grupo g, Empleado e){
		g.getEmpleados().remove(e);
	}

	public void agregarColegas(Grupo g){
		for (Empleado e: g.getEmpleados()) {
			for (int i = 0; i < g.getEmpleados().size(); i++) {
				if(!e.equals(g.getEmpleados().get(i))){
					e.getColegas().add(g.getEmpleados().get(i));
				}
			}
		}
	}


}