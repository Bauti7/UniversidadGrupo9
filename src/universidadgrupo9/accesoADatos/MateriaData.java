
package universidadgrupo9.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo9.entidades.Materia;

public class MateriaData {
    
    private Connection con = null;
    
    public MateriaData(){
    
        con = Conexion.getConexion();
    
    }
    
      //--------------Guardar Materia-----------------------------------
    
    public void guardarMateria(Materia materia){
    
        String sql = "INSERT INTO materia (nombre, año, estado)"
                + "VALUE (?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
            
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia agregada exitósamente");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
            
        }
         
    }
    
      //--------------Buscar Materia-----------------------------------
    
    public Materia buscarMateria(int id){
    
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ?";
        
        Materia materia = null;
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            
                materia = new Materia();
                
                materia.setIdMateria(id);
                
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
            
            }else{
            
                JOptionPane.showMessageDialog(null, "No existe una materia con ese ID");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        
        }
        
        return materia;
    
    }
    
      //--------------Modificar Materia-----------------------------------
    
    public void modificarMateria(Materia materia){
    
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            
            int modificar = ps.executeUpdate();
            
            if(modificar == 1){
            
                JOptionPane.showMessageDialog(null, "Materia modificada exitósamente");
                
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
       
        }
        
    }
    
      //--------------Eliminar Materia-----------------------------------
    
    public void eliminarMateria(int id){
    
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int eliminar = ps.executeUpdate();
            
            if(eliminar == 1){
            
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        
        }
    
    }
    
      //--------------Listar Materias-----------------------------------
    
    public List<Materia> listarMaterias(){
    
        String sql = "SELECT idMateria, nombre, año FROM materia WHERE estado = 1";
        
        ArrayList<Materia> materias = new ArrayList();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);
                
                materias.add(materia);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        
        }
        
        return materias;
        
    }
    
    
}
