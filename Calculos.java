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

    public double servicios(){
        double total = 0;
        for (Usuario usuario : usuarios) {
            serviciosGenerales servicios = usuario.getServicio();
            total = servicios.getConsultaMedica() + servicios.getHigiene() + servicios.getMedicina() + servicios.getOcio();
        }
        return total;
    }

    public void serviciosTotales() {
        for (Usuario usuario : usuarios) {
            int porcentajeServicios = (int) (Math.abs(servicios() - usuario.getSalario())/usuario.getSalario())*100;
            System.out.println("En total se tienen gastos de Q." + servicios() + " por higiene, gastos médicos y ocio.");

            if (usuario.getSalario() >= servicios()){
                System.out.println("\nEsto representa un " + porcentajeServicios + "% de su salario.");
                if (servicios() >= 50){
                    System.out.println("Se recomienda que trate de disminuir alguno de estos gastos si es posible porque\n" +
                    "Consumen gran parte de su salario");
                } else {
                    System.out.println("Trate de mantenar sus gastos por esta cantidad, ya que no forma gran parte de su salario");
                }
            } else {
                System.out.println("por favor disminuya lo antes que pueda estos gastos porque representan un riesgo para su vida.\n"
                + "Estos gastos exceden su salario actual en un " + servicios() + "%. De seguir con estos gastos tan altos puede\n llegar a tener problemas financieros a futuro.");
            }
        }
    }
}






