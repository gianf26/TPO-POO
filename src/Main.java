import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creo un inventario
        Inventario inventario = new Inventario();

        // Asigno el tipo de producto a cada componente
        TipoProducto procesador = new TipoProducto("Procesador");
        TipoProducto almacenamiento = new TipoProducto("Almacenamiento");
        TipoProducto memoria = new TipoProducto("Memoria");

        // Creo algunos componentes
        // Procesadores
        Procesador cpu1 = new Procesador("CPU001", "Intel Core i7", 300, 10, 3.6F, 8);
        Procesador cpu2 = new Procesador("CPU002", "AMD Ryzen 5", 200, 10, 3.4F, 6);
        Procesador cpu3 = new Procesador("CPU003", "Intel Core i3", 150, 30, 3.3F, 4);
        Procesador cpu4 = new Procesador("CPU004", "AMD Ryzen 3", 100, 30, 3.4F, 4);
        // Discos de Almacenamiento
        Almacenamiento disco1 = new Almacenamiento("DSC001", "SSD 240GB Kingston A400", 25, 30, 240);
        Almacenamiento disco2 = new Almacenamiento("DSC002", "SSD 256GB Gigabyte", 20, 20, 256);
        Almacenamiento disco3 = new Almacenamiento("DSC003", "SSD 500GB Samsung", 50, 10, 500);
        // Memorias RAM
        Memoria ram1 = new Memoria("RAM001", "RAM Corsair 8GB 3200 MHz", 30, 20, 8, 3200);
        Memoria ram2 = new Memoria("RAM002", "RAM Kingston 8GB 3200 MHz", 25, 20, 8, 3200);
        Memoria ram3 = new Memoria("RAM003", "RAM Kingston 16GB 5600 MHz", 60, 6, 16, 5600);

        // Agrego componentes al inventario
        inventario.altaComponente(cpu1);
        inventario.altaComponente(cpu2);
        inventario.altaComponente(cpu3);
        inventario.altaComponente(cpu4);
        inventario.altaComponente(disco1);
        inventario.altaComponente(disco2);
        inventario.altaComponente(disco3);
        inventario.altaComponente(ram1);
        inventario.altaComponente(ram2);
        inventario.altaComponente(ram3);

        // Inventario inicial
        Impresor.imprimirInventario(inventario);

        // Modifico un componente
        Procesador cpuModificado = new Procesador("CPU001", "Intel Core i7", 280, 10, 3.6F, 8);
        inventario.modificarComponente("CPU001", cpuModificado);

        // Inventario después de la modificación
        Impresor.imprimirInventario(inventario);

        // Elimino un componente
        inventario.bajaComponente("CPU004");

        // Inventario después de la baja
        Impresor.imprimirInventario(inventario);

        // "Registro" ventas
        Ventas ventas = new Ventas(inventario);
        System.out.println("\nRegistro de ventas:");
        ventas.registrarVenta("CPU001", 5);
        ventas.registrarVenta("RAM001", 6);
        ventas.registrarVenta("DSC001", 1);

        // Mostrar el inventario después de la venta
        Impresor.imprimirInventario(inventario);

        List<Componente> procesadores = inventario.getProductosPorTipo(procesador);
        System.out.println("\nLista de los procesadores con más de 4 núcleos:");
        for (Componente p : procesadores) {
            if (((Procesador) p).tieneMasDe4Nucleos()) {
                p.mostrarDetalles();
            }
        }

        ventas.registrarVenta("CPU002", 3);

        List<Componente> almacenamientos = inventario.getProductosPorTipo(almacenamiento);
        System.out.println("\nLista de los almacenamientos que tienen más de 240GB de capacidad:");
        for (Componente a : almacenamientos){
            if (((Almacenamiento) a).tieneMasDe240Gb()) {
                a.mostrarDetalles();
            }
        }

        ventas.registrarVenta("DSC003", 1);

    }
}
