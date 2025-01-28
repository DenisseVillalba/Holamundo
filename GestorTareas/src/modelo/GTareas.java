package modelo;

import java.util.ArrayList;

public class GTareas {
    private ArrayList<Tarea> tareas;
    private int nextId;

    public GTareas() {
        tareas = new ArrayList<>();
        nextId = 1;
    }

    public void agregarTarea(String nombre, String descripcion) {
        Tarea nuevaTarea = new Tarea(nextId++, nombre, descripcion, false);
        tareas.add(nuevaTarea);
    }

    public ArrayList<Tarea> listarTareas() {
        return tareas;
    }

    public void completarTarea(int id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.setCompletada(true);
                break;
            }
        }
    }

    public void eliminarTarea(int id) {
        tareas.removeIf(tarea -> tarea.getId() == id);
    }
}