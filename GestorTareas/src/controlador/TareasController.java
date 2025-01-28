
package controlador;

import modelo.GTareas;
import modelo.Tarea;
import vista.ViewGestor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TareasController {
    private GTareas modelo;
    private ViewGestor vista;

    public TareasController(GTareas modelo, ViewGestor vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.setAgregarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTarea();
            }
        });

        vista.setActualizarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTarea();
            }
        });

        vista.setEliminarButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTarea();
            }
        });
    }

    private void agregarTarea() {
        String nombre = vista.getNombre();
        String descripcion = vista.getDescripcion();
        modelo.agregarTarea(nombre, descripcion);
        // Agregar la nueva tarea a la vista
        Tarea nuevaTarea = modelo.listarTareas().get(modelo.listarTareas().size() - 1);
        vista.agregarTareaATabla(nuevaTarea);
    }

    private void actualizarTarea() {
        int id = vista.getSelectedTareaId();
        if (id != -1) {
            modelo.completarTarea(id);
            vista.actualizarTareaEnTabla(id, true);
        }
    }

    private void eliminarTarea() {
        int id = vista.getSelectedTareaId();
        if (id != -1) {
            modelo.eliminarTarea(id);
            vista.eliminarTareaDeTabla(id);
        }
    }
}