package EjercicioCompositeTest;

import EjercicioComposite.ActividadHoja;
import EjercicioComposite.GrupoTareasCompuesto;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestComposite {

    @Test
    public void solicitarEvaluacionActividadHoja() {
        ActividadHoja actividad = new ActividadHoja("Test", 10, 0.5);
        double expected = 5.0;
        double actual = actividad.solicitarEvaluacion();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void solicitarEvaluacionGrupoTareasCompuesto() {
        GrupoTareasCompuesto grupo = new GrupoTareasCompuesto("Test");
        ActividadHoja actividad1 = new ActividadHoja("Test1", 10, 0.5);
        ActividadHoja actividad2 = new ActividadHoja("Test2", 8, 0.5);
        grupo.agregarComponente(actividad1);
        grupo.agregarComponente(actividad2);
        double expected = 9.0;
        double actual = grupo.solicitarEvaluacion();
        assertEquals(expected, actual, 0.01);
    }
}