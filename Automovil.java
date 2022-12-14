public class Automovil {
    private String marca;
    private String linea;
    private String modelo;
    private double gastoGasolina;
    private boolean tenerVehiculo;
    

    public Automovil() {
        marca = "";
        modelo = "";
        linea = "";
        gastoGasolina = 0;
        tenerVehiculo = true;
    }


    public Automovil(String marca, String modelo, String linea, double gastoGasolina, boolean tenerVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.linea = linea;
        this.gastoGasolina = gastoGasolina;
        this.tenerVehiculo = tenerVehiculo;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return this.linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public double getGastoGasolina() {
        return this.gastoGasolina;
    }

    public void setGastoGasolina(double gastoGasolina) {
        this.gastoGasolina = gastoGasolina;
    }


    public boolean isTenerVehiculo() {
        return this.tenerVehiculo;
    }

    public boolean getTenerVehiculo() {
        return this.tenerVehiculo;
    }

    public void setTenerVehiculo(boolean tenerVehiculo) {
        this.tenerVehiculo = tenerVehiculo;
    }


}
