
package universidadgrupo9;

import java.sql.*;
import java.time.LocalDate;
import universidadgrupo9.accesoADatos.AlumnoData;
import universidadgrupo9.accesoADatos.Conexion;
import universidadgrupo9.entidades.Alumno;

public class UniversidadGrupo9 {

    public static void main(String[] args) {
        
        Alumno carlos = new Alumno(11,41789231,"Gómez","Juan carlos",LocalDate.of(2000, 1, 26),true);
        
        AlumnoData alu = new AlumnoData();
        
        // ---------- GUARDAR ALUMNO ----------
        
        //alu.guardarAlumno(carlos);
        
        // ---------- MODIFICAR ALUMNO ----------
        
        //alu.modificarAlumno(carlos);
        
        // ---------- ELIMIAR ALUMNO ----------
        
        //alu.eliminarAlumno(11);
        
        // ---------- ENCONTRAR ALUMNO POR ID ----------
        
        //Alumno alumnoEncontrado = alu.buscarAlumno(8);
        
        // ---------- ENCONTRAR ALUMNO POR DNI ----------
        
        //Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(1234);
              
//        
//        if(alumnoEncontrado != null){
//        
//        System.out.println("-------- Búsqueda de Alumno --------");
//        System.out.println(" ");
//        System.out.println("DNI: " + alumnoEncontrado.getDni());
//        System.out.println("Apellido: " + alumnoEncontrado.getApellido());
//        System.out.println("Nombre: " + alumnoEncontrado.getNombre());
//        System.out.println("Fecha de Nacimiento: " + alumnoEncontrado.getFechaN());
//        
//        }


         // ---------- LISTAR ALUMNOS ----------

            System.out.println("-------- Lista de Alumnos --------");

         for(Alumno alumno:alu.listarAlumnos()){
         
            System.out.println(" ");
            System.out.println("DNI: " + alumno.getDni());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Fecha de Nacimiento: " + alumno.getFechaN());
            System.out.println(" ");
         
         }

    }
    
}
