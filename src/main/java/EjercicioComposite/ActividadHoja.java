package EjercicioComposite;

public class ActividadHoja implements EvaluacionComponente {
    //Atributos
    private String nombre;
    private double calificacion;
    private double porcentaje;

    //Constructor
    public ActividadHoja(String nombre, double calificacion, double porcentaje){
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.porcentaje = porcentaje;
    }

    @Override
    public void agregarComponente(EvaluacionComponente componente) {
        //No hacemos nada porque no tenemos hijos, pero es necesario implementarlo por la interfaz
    }

    @Override
    public void eliminarComponente(EvaluacionComponente componente) {
        //No hacemos nada porque no tenemos hijos, pero es necesario implementarlo por la interfaz
    }

    @Override
    public double solicitarEvaluacion() {
        return calificacion * porcentaje;
    }
}