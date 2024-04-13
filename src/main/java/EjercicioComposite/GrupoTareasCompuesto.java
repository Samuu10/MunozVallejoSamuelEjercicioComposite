package EjercicioComposite;

import java.util.ArrayList;
import java.util.List;

public class GrupoTareasCompuesto implements EvaluacionComponente {
    //Atributos
    private List<EvaluacionComponente> actividades;
    private String nombre;

    //Constructor
    public GrupoTareasCompuesto(String nombre) {
        this.nombre = nombre;
        this.actividades = new ArrayList<>();
    }
    @Override
    public void agregarComponente(EvaluacionComponente componente) {
        actividades.add(componente);
    }

    @Override
    public void eliminarComponente(EvaluacionComponente componente) {
        actividades.remove(componente);
    }

    @Override
    public double solicitarEvaluacion() {
        double total = 0;
        for (EvaluacionComponente actividad : actividades) {
            total += actividad.solicitarEvaluacion();
        }
        return total;
    }
}