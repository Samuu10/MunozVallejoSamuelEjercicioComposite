El objetivo de este ejercicio realizado en clase ha sido comprender el funcionamiento del Patrón Estructural Composite creando un sistema que pueda representar la evaluación de distintas asignaturas en un curso. Cada asignatura está compuesta por una serie de actividades, que pueden ser tareas, exámenes o proyectos. Estas actividades tienen una calificación asociada y contribuyen a la calificación final de la asignatura en función de un porcentaje.

El ejercicio consta de las siguientes clases principales:
- EvaluacionComponente: Interfaz que define el comportamiento básico de un componente evaluativo. Tiene métodos para agregar y eliminar componentes, así como para solicitar la 
  evaluación total.
- GrupoTareasCompuesto: Clase que representa un grupo de actividades compuestas por otras actividades o grupos. Implementa la interfaz EvaluacionComponente.
- ActividadHoja: Clase que representa una actividad individual con una calificación y un porcentaje de contribución a la calificación total. Implementa la interfaz 
  EvaluacionComponente.
- Estudiante: Clase principal que contiene el método main donde se crean instancias de asignaturas y actividades, se agregan componentes a las asignaturas y se solicita la 
  evaluación total de cada asignatura.

Se han añadido Test unitarios para comprobar el correcto funcionamiento del programa


Link al repositorio: 
