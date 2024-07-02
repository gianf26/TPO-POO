import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventario implements Inventariable{
    private ArrayList<Componente> componentes;

    public Inventario(){
        this.componentes = new ArrayList<>();
    }

    @Override
    public void altaComponente(Componente componente) {
        componentes.add(componente);
        System.out.println("Componente agregado: " + componente.getNombre());
    }

    @Override
    public void bajaComponente(String id) {
        for (int i = 0; i < componentes.size(); i++) {
            if (componentes.get(i).getId().equals(id)) {
                System.out.println("\nComponente eliminado: " + componentes.get(i).getId() + ", " + componentes.get(i).getNombre());
                componentes.remove(i);
                return;
            }
        }
        System.out.println("\nComponente no encontrado: " + id);
    }

    @Override
    public void modificarComponente(String id, Componente nuevoComponente) {
        for (int i = 0; i < componentes.size(); i++) {
            if (componentes.get(i).getId().equals(id)) {
                componentes.set(i, nuevoComponente);
                System.out.println("\nComponente modificado: " + nuevoComponente.getId() + ", " + nuevoComponente.getNombre());
                return;
            }
        }
        System.out.println("Componente no encontrado: " + id);
    }

    public void mostrarInventario() {
        for (Componente componente : componentes) {
            componente.mostrarDetalles();
        }
    }

    public ArrayList<Componente> getComponentes(){
        return this.componentes;
    }

    public List<Componente> getProductosPorTipo(TipoProducto tipoProducto){
        return componentes
                .stream()
                .filter(Componente -> Componente.getTipoComponente().equals(tipoProducto.getTipo()))
                .collect(Collectors.toList());

    }

}
