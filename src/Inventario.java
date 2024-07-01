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
                System.out.println("Componente eliminado: " + componentes.get(i).getNombre());
                componentes.remove(i);
                return;
            }
        }
        System.out.println("Componente no encontrado: " + id);
    }

    @Override
    public void modificarComponente(String id, Componente nuevoComponente) {
        for (int i = 0; i < componentes.size(); i++) {
            if (componentes.get(i).getId().equals(id)) {
                componentes.set(i, nuevoComponente);
                System.out.println("Componente modificado: " + nuevoComponente.getNombre());
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

    public List<Procesador> getProcesadoresMasDe4Nucleos(){
        return componentes.stream()
                .filter(Componente -> Componente instanceof Procesador)
                .map(componente -> (Procesador) componente)
                .filter(Procesador -> Procesador.getNucleos() > 4)
                .collect(Collectors.toList());
    }

    public List<Almacenamiento> getAlmacenamientoMayor240(){
        return componentes.stream()
                .filter(Componente -> Componente instanceof Almacenamiento)
                .map(componente -> (Almacenamiento) componente)
                .filter(almacenamiento -> almacenamiento.getCapacidad() > 240)
                .collect(Collectors.toList());

    }



}
