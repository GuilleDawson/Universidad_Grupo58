package universidadgrupo58.accesoADatos;

import java.sql.Connection;

public class InscripcionData {


    private Connection con=null;
    
    public InscripcionData(){
    
    con=Conexion.getConexion();
    AlumnoData AluData;
    MateriaData MatData;
    }    
    
    
        
}
