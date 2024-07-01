public interface Inventariable {
    void altaComponente(Componente componente);
    void bajaComponente(String id);
    void modificarComponente(String id, Componente componente);
}
