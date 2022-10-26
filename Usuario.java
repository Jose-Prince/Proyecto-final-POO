public class Usuario{

//--------------------------------------- Atributos -----------------------------------------
    private String nombre;
    private int edad;
    private String sexo;
    private long dpi;
    private boolean estadoLaboral;
    private double salario;
    private double dinAyuPersona;
    private Automovil vehiculo;
    private Vivienda casa;
    private serviciosGenerales servicio;
//-------------------------------------------------------------------------------------------


//------------------------------------ Empty Constructor ------------------------------------
    public Usuario(){
        nombre = "";
        edad = 0;
        sexo = "";
        dpi = 0;
        estadoLaboral = false;
        salario = 0;
        dinAyuPersona = 0;
    }
//-------------------------------------------------------------------------------------------


//----------------------------- Constructor using all fields --------------------------------

    public Usuario(String nombre, int edad, String sexo, long dpi, boolean estadoLaboral, 
    double salario, double dinAyuPersona , Automovil vehiculo, Vivienda casa, serviciosGenerales servicio){
         this.nombre = nombre;
         this.edad = edad;
         this.sexo = sexo;
         this.dpi = dpi;
         this.estadoLaboral = estadoLaboral;
         this.salario = salario;
         this.dinAyuPersona = dinAyuPersona;
         this.vehiculo = vehiculo;
         this.casa = casa;
         this.servicio = servicio;
    }
//-------------------------------------------------------------------------------------------


//------------------------------------- Getters y Setters -----------------------------------


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getDpi() {
        return this.dpi;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public boolean isEstadoLaboral() {
        return this.estadoLaboral;
    }

    public boolean getEstadoLaboral() {
        return this.estadoLaboral;
    }

    public void setEstadoLaboral(boolean estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double getDinAyuPersona() {
        return this.dinAyuPersona;
    }

    public void setDinAyuPersona(double dinAyuPersona) {
        this.dinAyuPersona = dinAyuPersona;
    }


    public Automovil getVehiculo() {
        return this.vehiculo;
    }

    public void setVehiculo(Automovil vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vivienda getCasa() {
        return this.casa;
    }

    public void setCasa(Vivienda casa) {
        this.casa = casa;
    }

    public serviciosGenerales getServicio() {
        return this.servicio;
    }

    public void setServicio(serviciosGenerales servicio) {
        this.servicio = servicio;
    }

//-------------------------------------------------------------------------------------------


//--------------------------------------- Métodos -------------------------------------------

    public void definirCarro(String marca, int modelo, String linea, double gastoGasolina){
        Automovil carro = new Automovil(marca, modelo, linea, gastoGasolina);
    }

    public void definirVivienda(int habitantes, double comida, boolean alquiler, int gastoDomicilio){
        Vivienda hogar = new Vivienda(habitantes, comida, alquiler, gastoDomicilio);
    }

    public void servicios(int colegiaturas, double consultaMedica, double medicina, double seguro, double ocio){
        serviciosGenerales gastos = new serviciosGenerales(colegiaturas, consultaMedica, medicina, seguro, ocio);
    }

//-------------------------------------------------------------------------------------------


//--------------------------------------- ToString ------------------------------------------

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", sexo='" + getSexo() + "'" +
            ", dpi='" + getDpi() + "'" +
            ", estadoLaboral='" + isEstadoLaboral() + "'" +
            ", salario='" + getSalario() + "'" + 
            ", dinAyuPersona=" + getDinAyuPersona() +
            ", vehiculo='" + getVehiculo() + "'" +
            ", casa='" + getCasa() + "'" +
            ", servicio='" + getServicio() + "'" + 
            "}";
    }

//-------------------------------------------------------------------------------------------


}