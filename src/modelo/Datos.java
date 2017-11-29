package modelo;

public class Datos {
	private  String[] diasSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo" };
    private Estudiante[] estudiantes;
    private   int numEstudiantes = 30;
	// Declarar propiedad private,un array  de Estudiantes
	// crea getter/setter
	// en el constructor de esta clase, INICIALIZAR dicho array 
	private String [] equipos = {"RMA","BCN","LPA","VAL","SEV"};
	private String [][] resultados = {
			{"","3-2","3-1","1-2","1-1"},
			{"1-2","","3-1","1-2","1-1"},
			{"2-2","3-2","","2-2","1-1"},
			{"1-0","3-2","3-1","","2-1"},
			{"0-1","1-2","3-1","0-2",""}
	};
	//El orden de los equipos es RMA, BCN SEV, VAL, UDLP
	private int [][] puntosJornada = {{3,1,1,0,1},{3,3,0,0,3},{1,1,1,0,1},{3,1,3,1,1},{1,1,1,0,3}};
	private Equipo [] listadoEquipo = {new Equipo("RMA",0), new Equipo("BCN",0), new Equipo("SEV",0),new Equipo("VAL",0), new Equipo("UDLP",0)};
	public Datos() {
		
	// INICIALIZA AQUI EL ARRAY estudiantes....
	estudiantes = new Estudiante[numEstudiantes];
	Estudiante est1 = new Estudiante(12);
	est1.setNombre("Pedro Perez");
	Estudiante est2 = new Estudiante(12);
	est2.setNombre("Maria Navarro");
	
	
	estudiantes[0]= est1;
	estudiantes[1]= est2;

	}

	public Estudiante[] getEstudiantes() {
		return this.estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public  String[] getDiasSemana() {
		return diasSemana;
	}

	public  void setDiasSemana(String[] diasSemana) {
		diasSemana = diasSemana;
	}

	public String[] getEquipos() {
		return equipos;
	}

	public void setEquipos(String[] equipos) {
		this.equipos = equipos;
	}

	public String[][] getResultados() {
		return resultados;
	}

	public void setResultados(String[][] resultados) {
		this.resultados = resultados;
	}

	public int[][] getPuntosJornada() {
		return puntosJornada;
	}

	public void setPuntosJornada(int[][] puntosJornada) {
		this.puntosJornada = puntosJornada;
	}

	public Equipo[] getListadoEquipo() {
		return listadoEquipo;
	}

	public void setListadoEquipo(Equipo[] listadoEquipo) {
		this.listadoEquipo = listadoEquipo;
	}

}
