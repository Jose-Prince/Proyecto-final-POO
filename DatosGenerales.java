//Universidad del Valle de Guatemala



public class DatosGenerales {
    private double salarioBase;
    private int PrecioCanBas;
    private double promGastoGasolina;
    private double gastoMedico;
    private double viviendaGeneral;


    public DatosGenerales(){
        salarioBase = 1403.2;
        PrecioCanBas = 3218;
        promGastoGasolina = 0;
        gastoMedico = 0;
        viviendaGeneral = 0;
    }

    public DatosGenerales(int salarioBase, int PrecioCanBas, double promGastoGasolina, double gastoMedico,double viviendaGeneral){
        this.salarioBase = salarioBase;
        this.PrecioCanBas = PrecioCanBas;
        this.promGastoGasolina = promGastoGasolina;
        this.gastoMedico = gastoMedico;
        this.viviendaGeneral = viviendaGeneral;
    }


    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getPrecioCanBas() {
        return this.PrecioCanBas;
    }

    public void setPrecioCanBas(int PrecioCanBas) {
        this.PrecioCanBas = PrecioCanBas;
    }

    public double getPromGastoGasolina() {
        return this.promGastoGasolina;
    }

    public void setPromGastoGasolina(double promGastoGasolina) {
        this.promGastoGasolina = promGastoGasolina;
    }

    public double getGastoMedico() {
        return this.gastoMedico;
    }

    public void setGastoMedico(double gastoMedico) {
        this.gastoMedico = gastoMedico;
    }

    public double getViviendaGeneral() {
        return this.viviendaGeneral;
    }

    public void setViviendaGeneral(double viviendaGeneral) {
        this.viviendaGeneral = viviendaGeneral;
    }

    
}
