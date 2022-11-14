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
            int comparacion = (int) ((datos.getSalarioBase()/usuario.getSalario())*100);
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
        return compSalario;
    }

    public String compararCanastaBasica(){
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
        return compCanastaBas;
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

    public String gastosCompartidos(){
        String gastoCompartido = "Con la ayuda financiera recibida, se tiene un capital total de Q." + capitalTotal();
        return gastoCompartido;
    }

    public double servicios(){
        double total = 0;
        for (Usuario usuario : usuarios) {
            serviciosGenerales servicios = usuario.getServicio();
            total = servicios.getConsultaMedica() + servicios.getHigiene() + servicios.getMedicina() + servicios.getOcio();
        }
        return total;
    }

    public String serviciosTotales() {
        String registroServicio = "";
        for (Usuario usuario : usuarios) {
            double servicio = servicios();
            int porcentajeServicios = (int) ((servicio/usuario.getSalario())*100);
            registroServicio = "En total se tienen gastos de Q." + servicio + " por higiene, gastos médicos y ocio.";

            if (usuario.getSalario() >= servicios()){
                System.out.println("\nEsto representa un " + porcentajeServicios + "% de su salario.");
                if (porcentajeServicios >= 50){
                    registroServicio += "Se recomienda que trate de disminuir alguno de estos gastos si es posible porque\n" +
                    "Consumen gran parte de su salario. por favor disminuya lo antes que pueda estos gastos \nporque representan un riesgo para su vida.\n"
                    + ". De seguir con estos gastos tan altos puede\n llegar a tener problemas financieros a futuro.";
                } else {

                registroServicio += "Trate de mantenar sus gastos por esta cantidad, ya que no forma gran parte de su salario";
                }
            }
        }
        return registroServicio;
    }

    public String viviendaGasto(){
        String viviendaRegistro = "";
        for (Usuario usuario : usuarios) {
            Vivienda estadoVivienda = usuario.getCasa();
            if (estadoVivienda.getAlquiler() == true){
                viviendaRegistro += "Actualmente vive en una vivienda con alquiler, en donde el alquiler es de Q." + estadoVivienda.getGastoDomicilio() +
                ".\nEs recomendable que trate de conseguir una vivienda propia para no tener que depender del alquiler, además que \na largo plazo una propiedad propia conlleva menos gastos que pagando un alquiler por alojamiento.";
            } else {
                viviendaRegistro += "Actualmente tiene una casa propia. Y se tienen gasto para la propiedad de Q. " + estadoVivienda.getGastoDomicilio() + ".";
            }
        }
        return viviendaRegistro;
    }

    public String carroGastos(){
        String registroCarro = "";
        for (Usuario usuario : usuarios) {
            Automovil carro = usuario.getVehiculo();
            serviciosGenerales datos = usuario.getServicio();
            boolean pertenencia = carro.getTenerVehiculo();
            int comparaGastoTransporte = (int) ((datos.getGastoTransporte()/capitalTotal())*100);
            int compararGastosTotalTransporte = (int) (((datos.getGastoTransporte()+carro.getGastoGasolina())/capitalTotal())*100);
            if (pertenencia == true){
                registroCarro += "Sus gastos de gasolinas sumados con los gastos de transportes son de Q." + (carro.getGastoGasolina() + datos.getGastoTransporte()) + 
                "Estos representan un " + compararGastosTotalTransporte + "% del capital total.";
                if (compararGastosTotalTransporte >= 50){
                    registroCarro += "Se recomienda que empieze a administrar mejor sus gastos en este ámbito \nporque esta gastando una gran parte de su capital en este apartado. Lo mejor seria disminuir cuanto se gasta en gasolina\ny disminuir el uso de transporte público, si es que se usa.";
                } else {
                    registroCarro += "Esta administrando bastante bien sus gastos en lo que respecta al consumo \nde gasolina y el uso de transporte público ya que este gasto no es significativo a comparación de su capital total.";
                }
            } else {
                registroCarro += "No existen gastos en gasolina pero se tiene que se gastan Q." + datos.getGastoTransporte()+ "en transportes. \nEste gasto representa el " + comparaGastoTransporte +
                "%, de su capital total.";
                if (compararGastosTotalTransporte >= 50){
                    registroCarro += "Trate de buscar medios de transportes más económicos, debido a que sus gastos en este ámbito están siendo demasiados gransdes\npara el capital se tiene disponible.";
                } else {
                    registroCarro += "Su nivel de gasto entransportes no es excesivo y se mantiene en un buen porcentaje con respecto al capital total.";
                }
            }
        }
        return registroCarro;
    }

    public String crearInforme(String nombre, int edad, String sexo, long dpi, int habitantes, boolean gastoCompartido,
    double aporteDin, double alimentacion, boolean alquiler, double domicilio, boolean trabajo, double salario,
    boolean vehiculo, String marca, String modelo, String linea, double gasolina, double educacion, 
    double consultaMedica, double medicina, double ocio, double higiene, double transporte){
        Vivienda casa = new Vivienda(habitantes, alimentacion, alquiler, domicilio);
        Automovil carro = new Automovil(marca, modelo, linea, gasolina,vehiculo);
        serviciosGenerales servicios = new serviciosGenerales(educacion, consultaMedica, medicina, ocio, higiene,transporte);
        agregarUsuario(nombre, edad, sexo, dpi, trabajo, salario, aporteDin, carro, casa, servicios);
        String informe = compararSalario() + compararCanastaBasica() + gastosCompartidos() + serviciosTotales() + viviendaGasto() + carroGastos();
        return informe;
    }
}






