public class Ventas implements Vendible {
    private Inventario inventario;

    public Ventas(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public void registrarVenta(String id, int cantidad) {
        // Buscar el componente en el inventario
        Componente componente = null;
        for (Componente c : inventario.getComponentes()) {
            if (c.getId().equals(id)) {
                componente = c;
                break;
            }
        }


        if (componente != null) {
            if (componente.getStock() > cantidad) {
                // Registrar la venta
                System.out.println("Venta registrada: " + componente.getNombre() + ", Cantidad: " + cantidad);

                // Actualizar el inventario
                componente.decrementarStock(cantidad);
                System.out.println("Stock actualizado. Nuevo stock de " + componente.getNombre() + ": " + componente.getStock());
            } else {
                System.out.println("Stock insuficiente para el componente" + componente.getNombre());
            }
        } else {
                System.out.println("Componente no encontrado en el inventario: " + id);
            }
        }
}

