
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Tarea;
import View.GestorVista;
import Model.GestorTareas1;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlTarea {
    private GestorTareas1 modelo;
    private GestorVista vista;

    public ControlTarea(GestorTareas1 modelo, GestorVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        // Vincular los botones de la vista con sus eventos
        vista.getBtnAgregar().addActionListener(e -> agregarTarea());
        vista.getBtnCompletar().addActionListener(e -> completarTarea());
        vista.getBtnEliminar().addActionListener(e -> eliminarTarea());
    }

    private void agregarTarea() {
        String nombre = vista.getNombreTarea().getText();
        String descripcion = vista.getDescripcionTarea().getText();

        if (!nombre.isEmpty() && !descripcion.isEmpty()) {
            int nuevoId = modelo.getTareas().size() + 1;
            modelo.agregarTarea(new Tarea(nuevoId, nombre, descripcion));
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(vista, "Llene todos los campos.");
        }
}
    private void completarTarea() {
        int fila = vista.getTablaTareas().getSelectedRow();
        if (fila != -1) {
            int id = (int) vista.getModeloTabla().getValueAt(fila, 0);
            modelo.completarTarea(id);
            actualizarTabla();
        }
    }

    private void eliminarTarea() {
       int fila = vista.getTablaTareas().getSelectedRow();
        if (fila != -1) {
            int id = (int) vista.getModeloTabla().getValueAt(fila, 0);
            modelo.eliminarTarea(id);
            actualizarTabla();
        }
    }

    private void actualizarTabla() {
        // Obtener el modelo de la tabla
        DefaultTableModel modeloTabla = vista.getModeloTabla();
    modeloTabla.setRowCount(0); // Limpiar la tabla

    for (Tarea tarea : modelo.getTareas()) {
        // Agregar una fila por cada tarea
        modeloTabla.addRow(new Object[]{
            tarea.getId(),
            tarea.getNombre(),
            tarea.getDescripcion(),
            tarea.isCompletada() ? "Sí" : "No"
            });
        }
    }
}
