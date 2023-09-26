package universidadgrupo58.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import universidadgrupo58.entidades.Admin;
import universidadgrupo58.vistas.Main;

public class AdminData {

    private Connection con=null;
    
    public AdminData(){
    
    con=Conexion.getConexion();
    }
    
    public Admin buscarAdmin(String usuario, String password){
        
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
               JOptionPane.showMessageDialog(null,"Usuario no encontrado"); 
            }
            ps.close(); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de acceso -Login-");
        }
        return admin;
    }

    
}
