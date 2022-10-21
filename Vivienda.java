public class Vivienda {
    private int habitantes;
    private double comida;
    private boolean alquiler;
    private int gastoDomicilio;


    public Vivienda() {
        habitantes = 0;
        comida = 0;
        gastoDomicilio = 0;
    }


    public Vivienda(int habitantes, double comida, boolean alquiler, int gastoDomicilio) {
        this.habitantes = habitantes;
        this.comida = comida;
        this.alquiler = alquiler;
        this.gastoDomicilio = gastoDomicilio;
    }


    public int getHabitantes() {
        return this.habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public double getComida() {
        return this.comida;
    }

    public void setComida(double comida) {
        this.comida = comida;
    }

    public boolean isAlquiler() {
        return this.alquiler;
    }

    public boolean getAlquiler() {
        return this.alquiler;
    }

    public void setAlquiler(boolean alquiler) {
        this.alquiler = alquiler;
    }

    public int getGastoDomicilio() {
        return this.gastoDomicilio;
    }

    public void setGastoDomicilio(int gastoDomicilio) {
        this.gastoDomicilio = gastoDomicilio;
    }

}
