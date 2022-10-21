//import java.util.ArrayList;

public class Calculos {

//private ArrayList <Usuario> usuario;
private Usuario usuario;
private DatosGenerales datos;

public Calculos(){
    usuario = new Usuario();
    //usuario = new ArrayList<Usuario>();
    datos = new DatosGenerales();
}

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /*public ArrayList<Usuario> getUsuario() {
        return this.usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }*/

    public DatosGenerales getDatos() {
        return this.datos;
    }

    public void setDatos(DatosGenerales datos) {
        this.datos = datos;
    }

    /*public void agregarUsuario(String nombre, int edad, String sexo, long dpi, boolean estadoLaboral, 
    double salario, Automovil vehiculo, Vivienda casa, serviciosGenerales servicio){
        Usuario nuevoUsuario = new Usuario(nombre, edad, sexo, dpi, estadoLaboral, salario, vehiculo, casa, servicio);
        usuario.add(nuevoUsuario);
    }*/

    public void agregarUsuario(String nombre, int edad, String sexo, long dpi, boolean estadoLaboral, 
    double salario, Automovil vehiculo, Vivienda casa, serviciosGenerales servicio) {
        Usuario newUser = new Usuario(nombre, edad, sexo, dpi, estadoLaboral, salario, vehiculo, casa, servicio);
    }
}






