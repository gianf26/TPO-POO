public class Almacenamiento extends Componente{
    private int capacidad;

    public Almacenamiento(String id, String nombre, int precio, int stock, int capacidad) {
        super(id, nombre, precio, stock);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    @Override
    public void mostrarDetalles() {
        System.out.println(getId() + ": " + getNombre() + ", Capacidad: " + capacidad +
                "GB, Precio $ " + getPrecio() + ", Stock " + getStock());
    }
}
