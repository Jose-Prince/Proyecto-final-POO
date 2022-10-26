public class serviciosGenerales{
    private double colegiaturas;
    private double consultaMedica;
    private double medicina;
    private double seguro;
    private double ocio;


    public serviciosGenerales() {
        colegiaturas = 0;
        consultaMedica = 0;
        medicina = 0;
        seguro = 0;
        ocio = 0;    
    }


    public serviciosGenerales(double colegiaturas, double consultaMedica, double medicina, double seguro, double ocio) {
        this.colegiaturas = colegiaturas;
        this.consultaMedica = consultaMedica;
        this.medicina = medicina;
        this.seguro = seguro;
        this.ocio = ocio;
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

    public double getSeguro() {
        return this.seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getOcio() {
        return this.ocio;
    }

    public void setOcio(double ocio) {
        this.ocio = ocio;
    }


}