public class Automovil {
    private String marca;
    private int modelo;
    private String linea;
    private double gastoGasolina;
    private boolean tenerVehiculo;
    

    public Automovil() {
        marca = "";
        modelo = 0;
        linea = "";
        gastoGasolina = 0;
        tenerVehiculo = true;
    }


    public Automovil(String marca, int modelo, String linea, double gastoGasolina, boolean tenerVehiculo) {
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

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
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
