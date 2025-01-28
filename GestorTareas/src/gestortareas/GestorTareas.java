package gestortareas;

import modelo.GTareas;
import vista.ViewGestor;
import controlador.TareasController; // Importa el controlador desde el paquete correcto

public class GestorTareas {
    public static void main(String[] args) {
        GTareas modelo = new GTareas();
        ViewGestor vista = new ViewGestor();
        TareasController control = new TareasController(modelo, vista);

        vista.setVisible(true);
    }
}
