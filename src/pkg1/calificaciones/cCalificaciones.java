
package pkg1.calificaciones;

import javax.swing.JOptionPane;

public class cCalificaciones {
    // define variables
    String Nombre_Estudiante;
    double Promedio_Tareas;
    double Examen_1;
    double Examen_2;
    double Proyecto_1;
    double Proyecto_2;
    double Nota_Final;
   
    //define constructores 
    public cCalificaciones() {
    }
    
    public cCalificaciones(String Nombre_Estudiante, double Promedio_Tareas, double Examen_1, double Examen_2, double Proyecto_1, double Proyecto_2, double Nota_Final) {
        this.Nombre_Estudiante = Nombre_Estudiante;
        this.Promedio_Tareas = Promedio_Tareas;
        this.Examen_1 = Examen_1;
        this.Examen_2 = Examen_2;
        this.Proyecto_1 = Proyecto_1;
        this.Proyecto_2 = Proyecto_2;
        this.Nota_Final = Nota_Final;
    }
    //define setters y getters
    
 
    public String getNombre_Estudiante() {
        return Nombre_Estudiante;
    }

    public void setNombre_Estudiante(String Nombre_Estudiante) {
        this.Nombre_Estudiante = Nombre_Estudiante;
    }

    public double getPromedio_Tareas() {
        return Promedio_Tareas;
    }

    public void setPromedio_Tareas(double Promedio_Tareas) {
        this.Promedio_Tareas = Promedio_Tareas;
    }

    public double getExamen_1() {
        return Examen_1;
    }

    public void setExamen_1(double Examen_1) {
        this.Examen_1 = Examen_1;
    }

    public double getExamen_2() {
        return Examen_2;
    }

    public void setExamen_2(double Examen_2) {
        this.Examen_2 = Examen_2;
    }

    public double getProyecto_1() {
        return Proyecto_1;
    }

    public void setProyecto_1(double Proyecto_1) {
        this.Proyecto_1 = Proyecto_1;
    }

    public double getProyecto_2() {
        return Proyecto_2;
    }

    public void setProyecto_2(double Proyecto_2) {
        this.Proyecto_2 = Proyecto_2;
    }

    public double getNota_Final() {
        return Nota_Final;
    }

    public void setNota_Final(double Nota_Final) {
        this.Nota_Final = Nota_Final;
    }
    //métodos  es void porque no devuelve
    public void CalcularTareas ()
    {
    char MasTareas ; 
    double Tarea , SumaTareas = 0 ;
    int ContadorTareas = 0; 
    
    MasTareas = 's'; 
    while ( MasTareas == 's')
        {
        Tarea = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota de Tarea"));
        SumaTareas = SumaTareas + Tarea ;
        ContadorTareas =ContadorTareas + 1 ;
        
        MasTareas = JOptionPane.showInputDialog("¿Más tareas qué procesar? s/n ").charAt(0) ;
        }
    Promedio_Tareas = SumaTareas / ContadorTareas ;
    }
    
    public void CalcularNotaFinal ()
    {
    
        Nota_Final = Promedio_Tareas * 0.2 +
                    Examen_1 * 0.15 +
                    Examen_2 * 0.15 +
                    Proyecto_1 * 0.2 + 
                    Proyecto_2 * 0.3 ;
    }

    
}
