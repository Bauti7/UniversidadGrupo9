
package universidadgrupo9.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo9.entidades.Alumno;
import universidadgrupo9.entidades.Inscripcion;
import universidadgrupo9.entidades.Materia;

public class InscripcionData {
    
    private Connection con = null;
    
    private MateriaData md = new MateriaData();
    private AlumnoData ad = new AlumnoData();
    
    private MateriaData matData;
    private AlumnoData aluData;
    
    public InscripcionData(){
    
        this.con = Conexion.getConexion();
    
    }
    
    //--------------Guardar Inscripcion-----------------------------------
    
    public void guardarInscripcion(Inscripcion insc){
    
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria)"
                + "VALUES (?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
       
            ps.setInt(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
            
                insc.setIdInscripto(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Inscripción registrada");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        
        }
       
    }
    
      //--------------Actualizar Nota-----------------------------------
    
    public void actualizarNota( int idAlumno, int idMateria, int nota){
    
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ?"
                + " AND idMateria = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int actualizar = ps.executeUpdate();
            
            if(actualizar > 0){
            
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        
        }
        
    }
    
      //--------------Borrar Inscripción-----------------------------------
    
    public void borrarInscripcion(int idAlumno, int idMateria){
    
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int borrar = ps.executeUpdate();
            
            if(borrar > 0){
            
                JOptionPane.showMessageDialog(null, "Inscripción eliminada exitósamente");
                
            }else{
            
                JOptionPane.showMessageDialog(null, "No existe esa Inscripción");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        
        }                 
    }
    
      //--------------Obtener Inscripciones-----------------------------------
    
    public List<Inscripcion> obtenerInscripciones(){
    
        String sql = "SELECT * FROM inscripcion";
        
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Inscripcion ins = new Inscripcion();
                
                ins.setIdInscripto(rs.getInt("idInscripto"));
                
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getInt("nota"));
                
                inscripciones.add(ins);
                
                ps.close();
                
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        
        }
        
        return inscripciones;
        
    }
       
      //--------------Obtener Inscripciones Por ID-----------------------------------
    
    public List<Inscripcion> obtenerInscripcionesPorId(int idAlumno){
    
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        
        ArrayList<Inscripcion> inscripciones = new ArrayList();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Inscripcion ins = new Inscripcion();
                
                ins.setIdInscripto(rs.getInt("idInscripto"));
                
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = md.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getInt("nota"));
                
                inscripciones.add(ins);
                
                ps.close();
                
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        
        }
        
        return inscripciones;
        
    }
    
      //--------------Obtener Materia Cursada-----------------------------------
    
    public List<Materia> obtenerMateriaCursada(int idAlumno){
    
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"
                + " materia WHERE inscripcion.idMateria = materia.idMateria "
                + "AND inscripcion.idAlumno = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                
                materias.add(materia);
                           
            }
            
           ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        
        }
        
        return materias;
    
    }
    
      //--------------Obtener Materias No Cursadas-----------------------------------
    
    
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno){
    
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1,idAlumno);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                
                materias.add(materia);
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        
        }
        
        return materias;
    
    }
    
      //--------------Obtener Alumnos Por Materia-----------------------------------
    
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria){
    
        ArrayList<Alumno> alumnosMateria = new ArrayList<>();
        
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaDeNacimiento, estado "
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno "
                + "AND idMateria = ? AND a.estado = 1";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Alumno alumno = new Alumno();
                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaN(rs.getDate("fechaDeNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                
                alumnosMateria.add(alumno);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        
        
        }
        
        return alumnosMateria;
        
    }
    
}
