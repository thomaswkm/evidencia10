public enum Area {
	ADQUISICIONES("Adquisiciones"),
	VENTAS("Ventas"),
	PRODUCCION("Producción"),
	LOGISTICA("Logística"),
	FINANZAS("Finanzas");
	private String area;


	Area(String area) {
		this.area = area;
	}

	public String getArea() {
		return this.area;
	}
}