
package universidadgrupo9;

import java.sql.*;
import java.time.LocalDate;
import universidadgrupo9.accesoADatos.*;
import universidadgrupo9.accesoADatos.Conexion;
import universidadgrupo9.accesoADatos.MateriaData;
import universidadgrupo9.entidades.Alumno;
import universidadgrupo9.entidades.Inscripcion;
import universidadgrupo9.entidades.Materia;

public class UniversidadGrupo9 {

    public static void main(String[] args) {
        
        //Alumno carlos = new Alumno(11,41789231,"Gómez","Juan carlos",LocalDate.of(2000, 1, 26),true);
        
        //AlumnoData alu = new AlumnoData();
        
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

//        System.out.println("-------- Lista de Alumnos --------");
//
//        for(Alumno alumno:alu.listarAlumnos()){
//         
//        System.out.println(" ");
//        System.out.println("DNI: " + alumno.getDni());
//        System.out.println("Apellido: " + alumno.getApellido());
//        System.out.println("Nombre: " + alumno.getNombre());
//        System.out.println("Fecha de Nacimiento: " + alumno.getFechaN());
//        System.out.println(" ");
//         
//         }

          
          //Materia materia = new Materia(4,"WEB", 4, true);
          
          //MateriaData mat = new MateriaData();
          
          // ---------- GUARDAR MATERIA ----------
//          
//        mat.guardarMateria(materia);

          // ---------- BUSCAR MATERIA ----------
          
//        Materia materias = mat.buscarMateria(1);
//          
//        if(materias != null){
//          
//        System.out.println("-------- Busqueda de Materia --------");
//        System.out.println(" ");
//        System.out.println("ID: " + materias.getIdMateria());
//        System.out.println("Nombre: " + materias.getNombre());
//        System.out.println("Año: : " + materias.getAño());     
//          
//        }

          // ---------- MODIFICAR MATERIA ----------

          //mat.modificarMateria(materia);
          
          // ---------- ELIMINAR MATERIA ----------
          
          //mat.eliminarMateria(9);
          
          // ---------- LISTAR MATERIAS ----------
          
//          System.out.println(" ---------- Listado de Materias ---------- ");
//          
//          for(Materia materia:mat.listarMaterias()){
//          
//              System.out.println(" ");
//              System.out.println("ID materia : " + materia.getIdMateria());
//              System.out.println("Nombre : " + materia.getNombre());
//              System.out.println("Año : " + materia.getAño());
//              System.out.println("Estado : " + materia.isEstado());
//              System.out.println(" ");
//          
//          }



            //---------- ETAPA 2 ----------
            
            

            AlumnoData alu = new AlumnoData();
            MateriaData mater = new MateriaData();
            InscripcionData id = new InscripcionData();
            
            Alumno bauti = alu.buscarAlumno(10);
            Materia mate = mater.buscarMateria(2);
            
            Inscripcion insc = new Inscripcion(9,bauti,mate);
            
            // ---------- GUARDAR INSCRIPCIÓN ----------
            
            //id.guardarInscripcion(insc);
            
            
            // ---------- ACTUALIZAR NOTA ----------
            
            //id.actualizarNota(7, 10, 2);
            
            
            // ---------- BORRAR INSCRIPCIÓN ----------
            
            //id.borrarInscripcion(10, 2);
            
            
            // ---------- LISTAR INSCRIPCIONES ----------
            
            
//            System.out.println("---------- Listado de Inscripciones ----------");
//            
//            for(Inscripcion inscrip : id.obtenerInscripciones()){
//            
//                System.out.println(" ");
//                System.out.println("ID: " + inscrip.getIdInscripto());
//                System.out.println("Apellido: " + inscrip.getAlumno().getApellido());
//                System.out.println("Nombre: " + inscrip.getAlumno().getNombre());
//                System.out.println("Materia: " + inscrip.getMateria().getNombre());
//                System.out.println("Nota: " + inscrip.getNota());
//                System.out.println(" ");
//            
//            }


            // ---------- LISTAR INSCRIPCIONES POR ID ----------
            
//            System.out.println("---------- Listado de Inscripciones por ID ----------");
//            for(Inscripcion idinsc : id.obtenerInscripcionesPorId(8)){
//            
//                System.out.println(" ");
//                System.out.println("ID Inscripto: " + idinsc.getIdInscripto());
//                System.out.println("Apellido: " + idinsc.getAlumno().getApellido());
//                System.out.println("Nombre: " + idinsc.getAlumno().getNombre());
//                System.out.println("Materia: " + idinsc.getMateria().getNombre());
//                System.out.println("Nota: " + idinsc.getNota());
//                System.out.println(" ");
//                
//            }


            // ---------- LISTAR MATERIAS CURSADAS POR ID ----------
            
//            System.out.println("---------- Listado de Materias Cursadas por ID ----------");
//            
//            for(Materia materiacursada : id.obtenerMateriaCursada(8)){
//            
//                System.out.println(" ");
//                System.out.println("ID Materia: " + materiacursada.getIdMateria());
//                System.out.println("Nombre: " + materiacursada.getNombre());
//                System.out.println("Año: " + materiacursada.getAño());
//                System.out.println(" ");
//            
//            }

            // ---------- LISTAR MATERIAS NO CURSADAS POR ID ----------

//              System.out.println("---------- Listado de Materias no Cursadas por ID ----------");
//            
//            for(Materia materianocursada : id.obtenerMateriasNoCursadas(8)){
//                
//                System.out.println(" ");
//                System.out.println("Nombre de Materia: " + materianocursada.getNombre());
//                
//            }

            // ---------- LISTAR ALUMNOS POR MATERIAS ----------
          
//             System.out.println("---------- Listado de Alumnos por Materia ----------"); 
//             
//             for(Alumno alumno : id.obtenerAlumnosPorMateria(2)){
//             
//                 System.out.println(" ");
//                 System.out.println("ID: " + alumno.getIdAlumno());
//                 System.out.println("DNI: " + alumno.getDni());
//                 System.out.println("Nombre: " + alumno.getNombre());
//                 System.out.println("Apellido: " + alumno.getApellido());
//                 System.out.println("Fecha de Nacimiento: " + alumno.getFechaN());
//                 System.out.println("Estado: " + alumno.isEstado());
//                 System.out.println(" ");
//                 
//             }

    }
    
}
