package EjercicioComposite;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    public static void main(String[] args) {
        GrupoTareasCompuesto bbdd = new GrupoTareasCompuesto("Asigatura Base de Datos");

        ActividadHoja trabajoFinalBBDD = new ActividadHoja("Trabajo Final", 10, 0.5);
        ActividadHoja examenFinalBBDD = new ActividadHoja("Examen Final", 8, 0.5);

        bbdd.agregarComponente(trabajoFinalBBDD);
        bbdd.agregarComponente(examenFinalBBDD);

        System.out.println("Nota de Bases de Datos: " + String.format("%.2f", bbdd.solicitarEvaluacion()));


        
        GrupoTareasCompuesto ssoo = new GrupoTareasCompuesto("Asigatura Sistemas Operativos");

        ActividadHoja examenFinalSSOO = new ActividadHoja("Trabajo Final", 9, 0.4);
        List<ActividadHoja> sesionesLaboratorioSSOO = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ActividadHoja sesionLaboratorio = new ActividadHoja("Sesión de Laboratorio " + i, Math.random()*10, 0.15);
            sesionesLaboratorioSSOO.add(sesionLaboratorio);
            ssoo.agregarComponente(sesionLaboratorio);
        }
        ssoo.agregarComponente(examenFinalSSOO);

        System.out.println("Nota de Sistemas Operativos: " + String.format("%.2f", ssoo.solicitarEvaluacion()));



        GrupoTareasCompuesto tdp = new GrupoTareasCompuesto("Asigatura Técnicas de Programación");

        ActividadHoja examenParcialTDP = new ActividadHoja("Examen Parcial", 7, 0.4);
        ActividadHoja proyectoSemestralTDP = new ActividadHoja("Proyecto Semestral", 8, 0.4);
        for(int i = 0; i < 10; i++){
            ActividadHoja tareaSemanal = new ActividadHoja("Tarea " + i, Math.random()*10, 0.02);
            tdp.agregarComponente(tareaSemanal);
        }
        tdp.agregarComponente(examenParcialTDP);
        tdp.agregarComponente(proyectoSemestralTDP);

        System.out.println("Nota de Técnicas de Programación: " + String.format("%.2f", tdp.solicitarEvaluacion()));
    }
}