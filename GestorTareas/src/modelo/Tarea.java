
package modelo;

public class Tarea {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean completada;

    public Tarea(int id, String nombre, String descripcion, boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}