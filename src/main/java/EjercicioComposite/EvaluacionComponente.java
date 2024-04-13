package EjercicioComposite;

public interface EvaluacionComponente {
    void agregarComponente(EvaluacionComponente componente);
    void eliminarComponente(EvaluacionComponente componente);
    double solicitarEvaluacion();
}