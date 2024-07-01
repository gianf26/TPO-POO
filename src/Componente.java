public abstract class Componente {
    private String id;
    private String nombre;
    private int precio;
    private int stock;

    public Componente(String id, String nombre, int precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void incrementarStock(int cantidad){
        this.stock += cantidad;
    }

    public void decrementarStock(int cantidad){
        this.stock -= cantidad;
    }

    // Método abstracto
    public abstract void mostrarDetalles();

}
