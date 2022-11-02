import java.util.ArrayList;

public class Calculos {

private ArrayList <Usuario> usuarios;
private DatosGenerales datos;

public Calculos(){
    usuarios = new ArrayList<Usuario>();
    datos = new DatosGenerales();
}

    public ArrayList<Usuario> getUsuario() {
        return this.usuarios;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuarios = usuario;
    }

    public DatosGenerales getDatos() {
        return this.datos;
    }

    public void setDatos(DatosGenerales datos) {
        this.datos = datos;
    }

    public void agregarUsuario(String nombre, int edad, String sexo, long dpi, boolean estadoLaboral, 
    double salario, double dinAyuPersona, Automovil vehiculo, Vivienda casa, serviciosGenerales servicio){
        Usuario nuevoUsuario = new Usuario(nombre, edad, sexo, dpi, estadoLaboral, salario, dinAyuPersona, vehiculo, casa, servicio);
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario agregado");
    }

    public String compararSalario() {
        String compSalario = "";
        for (Usuario usuario : usuarios) {
            int comparacion = (int) Math.abs(((usuario.getSalario()-datos.getSalarioBase())/datos.getSalarioBase())*100);
            if (usuario.getSalario() < datos.getSalarioBase()){
                compSalario = "Se pudo determinar que en base a su salario actual de Q." + usuario.getSalario() + 
                "no excede el salario base establecido en Guatemala. \nUsted excede este salario en un " + comparacion + 
                "%.";
            } else if (usuario.getSalario() > datos.getSalarioBase()){
                compSalario =  "Se pudo determinar que en base a su salario actual de Q." + usuario.getSalario() + 
                "excede el salario base establecido en Guatemala. \nUsted no excede este salario en un " + comparacion + 
                "%.";
            } else {
                compSalario =  "Se pudo determinar que en base a su salario actual de Q." + usuario.getSalario() + 
                "es igual al salario base establecido en Guatemala.";
            }
        }
        return compSalario;
    }
    public void comparar(){
        System.out.println("Aparece por favor");
    }
}






