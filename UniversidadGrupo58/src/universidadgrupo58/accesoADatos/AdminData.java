package universidadgrupo58.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import universidadgrupo58.entidades.Admin;

public class AdminData {

    private Connection con=null;
    
    public AdminData(){
    
    con=Conexion.getConexion();
    }
    
    public Admin buscarAdminA(String usuario, String password){
        
        String sql="SELECT admin, password FROM admin WHERE admin = ? AND password = ?";
        Admin admin = new Admin();
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            admin.setLevelAdmin(true);
            admin.setPassword(password);
            admin.setUsuario(usuario);
            } else {
                admin.setLevelAdmin(false);
               }
            ps.close(); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de acceso -Login-");
        }
        return admin;
    }
    public Admin buscarAdminB(String usuario, String password){
        Admin admin = new Admin();
        String sql2="SELECT dni, apellido FROM alumno WHERE dni = ? AND apellido = ?";
        try {
            int pas = Integer.parseInt(password);
            PreparedStatement ps2= con.prepareStatement(sql2);
            ps2.setInt(1, pas);
            ps2.setString(2, usuario);
            ResultSet rs=ps2.executeQuery();
            if(rs.next()){
                admin.setUsuario(usuario);
                admin.setPassword(password);
                admin.setLevelAlu(true);
            } else {
               admin.setLevelAlu(false);
            }
            ps2.close(); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
        } catch (NumberFormatException nfe){
            //por si el pass es letra y pasa al modulo alumno que parsea a int
        }
        return admin;
    }
}
