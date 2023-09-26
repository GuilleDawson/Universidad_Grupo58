package universidadgrupo58.entidades;

public class Admin {
    private String usuario; //apellido alumno O usuario admin
    private String password; //dni alumno O password admin
    private static boolean levelAdmin = false;
    private static boolean levelAlu = false;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {
    }

    public boolean isLevelAdmin() {
        return levelAdmin;
    }

    public void setLevelAdmin(boolean levelAdmin) {
        this.levelAdmin = levelAdmin;
    }

    public boolean isLevelAlu() {
        return levelAlu;
    }

    public void setLevelAlu(boolean levelAlu) {
        this.levelAlu = levelAlu;
    }

}
