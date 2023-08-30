
package pkg1.calificaciones;

import javax.swing.JOptionPane;

public class Calificaciones {

    public static void main(String[] args) {
        char MasEstudiantes ; 
        cCalificaciones objCalificaciones = new cCalificaciones() ;
        
        MasEstudiantes = 's';
        while (MasEstudiantes == 's')
        {
            //carga de datos en la instancia del objeto
        objCalificaciones.setNombre_Estudiante(JOptionPane.showInputDialog("Ingrese nombre del estudiante: "));
        objCalificaciones.CalcularTareas();
        objCalificaciones.setExamen_1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de Examen 1: ")));
        objCalificaciones.setExamen_2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de Examen 2: ")));
        objCalificaciones.setProyecto_1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de Proyecto 1: ")));
        objCalificaciones.setProyecto_2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota de Proyecto 2: ")));
            
        //procesa los datos cargados
        objCalificaciones.CalcularNotaFinal();
            JOptionPane.showMessageDialog(null, "Estudiante " + objCalificaciones.getNombre_Estudiante() 
                                                            + " Nota Final: " + objCalificaciones.getNota_Final()
            
                                                        );
        
        MasEstudiantes = JOptionPane.showInputDialog("¿Más estudiantes que procesar? s/n").charAt (0);
        }
    }
    
}
