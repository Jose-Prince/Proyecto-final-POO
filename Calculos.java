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
            int comparacion = (int) ((datos.getSalarioBase())/usuario.getSalario())*100;
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
            double servicio = servicios();
            int porcentajeServicios = (int) (servicio/usuario.getSalario())*100;
            System.out.println("En total se tienen gastos de Q." + servicio + " por higiene, gastos médicos y ocio.");

            if (usuario.getSalario() >= servicios()){
                System.out.println("\nEsto representa un " + porcentajeServicios + "% de su salario.");
                if (porcentajeServicios >= 50){
                    System.out.println("Se recomienda que trate de disminuir alguno de estos gastos si es posible porque\n" +
                    "Consumen gran parte de su salario");
                    System.out.println("por favor disminuya lo antes que pueda estos gastos porque representan un riesgo para su vida.\n"
                    + ". De seguir con estos gastos tan altos puede\n llegar a tener problemas financieros a futuro.");
                } else {

                System.out.println("Trate de mantenar sus gastos por esta cantidad, ya que no forma gran parte de su salario");
                }
            }
        }
    }

    public void viviendaGasto(int numPlazos){
        for (Usuario usuario : usuarios) {
            Vivienda estadoVivienda = usuario.getCasa();
            if (estadoVivienda.getAlquiler() == true){
                System.out.println("Actualmente vive en una vivienda con alquiler, en donde el alquiler es de Q." + estadoVivienda.getGastoDomicilio() +
                ".\nEs recomendable que trate de conseguir una vivienda propia para no tener que depender del alquiler, además que \na largo plazo una propiedad propia conlleva menos gastos que pagando un alquiler por alojamiento.");
            } else {
                System.out.println("Actualmente tiene una casa propia.");
                if (numPlazos > 0){
                    System.out.print("Faltan por pagar un total de  " + numPlazos + " y  cada plaza asciende a un total de Q." + estadoVivienda.getGastoDomicilio() +", es recomendable que siempre trate de tener \nen cuenta esta pago para no acumular plazos atrasados.");
                } else {
                    System.out.print(" Y no tiene plazos por lo que no se debe preocupar por posibles plazos pendientes.");
                }
            }
        }
    }

    public void carroGastos(){
        for (Usuario usuario : usuarios) {
            Automovil carro = usuario.getVehiculo();
            serviciosGenerales datos = usuario.getServicio();
            boolean pertenencia = carro.getTenerVehiculo();
            int comparaGastoTransporte = (int) ((datos.getGastoTransporte()/capitalTotal())*100);
            int compararGastosTotalTransporte = (int) (((datos.getGastoTransporte()+carro.getGastoGasolina())/capitalTotal())*100);
            if (pertenencia == true){
                System.out.println("Sus gastos de gasolinas sumados con los gastos de transportes son de Q." + (carro.getGastoGasolina() + datos.getGastoTransporte()) + 
                "Estos representan un " + compararGastosTotalTransporte + "% del capital total.");
                if (compararGastosTotalTransporte >= 50){
                    System.out.println("Se recomienda que empieze a administrar mejor sus gastos en este ámbito \nporque esta gastando una gran parte de su capital en este apartado. Lo mejor seria disminuir cuanto se gasta en gasolina\ny disminuir el uso de transporte público, si es que se usa.");
                } else {
                    System.out.println("Esta administrando bastante bien sus gastos en lo que respecta al consumo \nde gasolina y el uso de transporte público ya que este gasto no es significativo a comparación de su capital total.");
                }
            } else {
                System.out.println("No existen gastos en gasolina pero se tiene que se gastan Q." + datos.getGastoTransporte()+ "en transportes. \nEste gasto representa el " + comparaGastoTransporte +
                "%, de su capital total.");
                if (compararGastosTotalTransporte >= 50){
                    System.out.println("Trate de buscar medios de transportes más económicos, debido a que sus gastos en este ámbito están siendo demasiados gransdes\npara el capital se tiene disponible.");
                } else {
                    System.out.println("Su nivel de gasto entransportes no es excesivo y se mantiene en un buen porcentaje con respecto al capital total.");
                }
            }
        }
    }
}






