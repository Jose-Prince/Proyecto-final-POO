public class serviciosGenerales{
    private double colegiaturas;
    private double consultaMedica;
    private double medicina;
    private double ocio;
    private double higiene;
    private double gastoTransporte;


    public serviciosGenerales() {
        colegiaturas = 0;
        consultaMedica = 0;
        medicina = 0;
        ocio = 0;    
        higiene = 0;
        gastoTransporte = 0;
    }


    public serviciosGenerales(double colegiaturas, double consultaMedica, double medicina, double ocio, double higiene, double gastoTransporte) {
        this.colegiaturas = colegiaturas;
        this.consultaMedica = consultaMedica;
        this.medicina = medicina;
        this.ocio = ocio;
        this.higiene = higiene;
        this.gastoTransporte = gastoTransporte;
    }


    public double getColegiaturas() {
        return this.colegiaturas;
    }

    public void setColegiaturas(double colegiaturas) {
        this.colegiaturas = colegiaturas;
    }

    public double getConsultaMedica() {
        return this.consultaMedica;
    }

    public void setConsultaMedica(double consultaMedica) {
        this.consultaMedica = consultaMedica;
    }

    public double getMedicina() {
        return this.medicina;
    }

    public void setMedicina(double medicina) {
        this.medicina = medicina;
    }

    public double getOcio() {
        return this.ocio;
    }

    public void setOcio(double ocio) {
        this.ocio = ocio;
    }

    public double getHigiene() {
        return this.higiene;
    }

    public void setHigiene(double higiene) {
        this.higiene = higiene;
    }


    public double getGastoTransporte() {
        return this.gastoTransporte;
    }

    public void setGastoTransporte(double gastoTransporte) {
        this.gastoTransporte = gastoTransporte;
    }

}