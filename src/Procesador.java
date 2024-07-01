public class Procesador extends Componente {
    private float frecuencia;
    private int nucleos;

    public Procesador(String id, String nombre, int precio, int stock, float frecuencia, int nucleos){
        super(id, nombre, precio, stock);
        this.frecuencia = frecuencia;
        this.nucleos = nucleos;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(getId() + ": " + getNombre() + ", Frecuencia: " + frecuencia +
                " GHz, Núcleos: " + nucleos + ", Precio: $" + getPrecio() + ", Stock: " + getStock());
    }


}
