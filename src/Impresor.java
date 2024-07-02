public class Impresor {
    public static void imprimirInventario(Inventario inventario) {
        System.out.println("\nInventario:");
        for (Componente componente : inventario.getComponentes()) {
            componente.mostrarDetalles();
        }
    }
}
