public class Memoria extends Componente{
    private int capacidad;
    private int frecuencia;

    public Memoria(String id, String nombre, int precio, int stock, int capacidad, int frecuencia) {
        super(id, nombre, precio, stock);
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }


    @Override
    public void mostrarDetalles() {
        System.out.println(getId() + ": " + getNombre() + ", Capacidad: " + capacidad +
                "GB, Frecuencia: " + getFrecuencia() + " MHz, Precio: $" + getPrecio() + ", Stock: " + getStock());
    }
}
