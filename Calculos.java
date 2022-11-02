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

    public void compararSalario() {
        String compSalario = "";
        for (Usuario usuario : usuarios) {
            int comparacion = (int) (Math.abs(usuario.getSalario()-datos.getSalarioBase())/datos.getSalarioBase())*100;
            if (usuario.getSalario() < datos.getSalarioBase()){
                compSalario = "Se pudo determinar que en base a su salario actual de Q." + usuario.getSalario() + 
                "no excede el salario base establecido en Guatemala. \nUsted no excede este salario en un " + comparacion + 
                "%.";
            } else if (usuario.getSalario() > datos.getSalarioBase()){
                compSalario =  "Se pudo determinar que en base a su salario actual de Q." + usuario.getSalario() + 
                ", se excede el salario base establecido en Guatemala. \nUsted excede este salario en un " + comparacion + 
                "%.";
            } else {
                compSalario =  "Se pudo determinar que en base a su salario actual de Q." + usuario.getSalario() + 
                "es igual al salario base establecido en Guatemala.";
            }
        }
        System.out.println(compSalario);
    }

    public void compararCanastaBasica(){
        String compCanastaBas = "";
        for (Usuario usuario : usuarios) {
            double canastaSalario = Math.abs(usuario.getSalario()-datos.getPrecioCanBas());
            if (usuario.getSalario() >= datos.getPrecioCanBas()){
                compCanastaBas = "Con su salario satisface exitosamente el precio de la canasta básica de Guatemala." +  
                "Se ve que entre su salario y la canasta básica hay una diferencia de Q. " + canastaSalario + "." +
                "Esto demuestra que su salario es capaz de satisfacer la canasta básica para una persona.";
            } else {
                compCanastaBas = "Con su salario no logra satisfacer el precio de la canasta básica de Guatemala." +  
                "Se ve que entre su salario y la canasta básica hay una diferencia de Q. " + canastaSalario + "." +
                "Esto demuestra que su salario no le alcanza ni para satisfacer la canasta básica para una persona.";
            }
        }
    }

    public void sectorLaboral(){

    }

    public double capitalTotal(){
        double capital = 0;
        for (Usuario usuario : usuarios) {
            capital = usuario.getDinAyuPersona() + usuario.getSalario();
        }
        return capital;
    }

    public void gastosCompartidos(){
        String gastoCompartido = "Con la ayuda financiera recibida, se tiene un capital total de Q." + capitalTotal();
        System.out.println(gastoCompartido);
    }
}






