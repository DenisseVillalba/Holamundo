/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestortareas;

import Controller.ControlTarea;
import View.GestorVista;
import Model.GestorTareas1;
/**
 *
 * @author USUARIO
 */
public class GestorTareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el modelo y la vista
        GestorTareas1 model = new GestorTareas1();
        GestorVista view = new GestorVista();

        // Crear el controlador
        new ControlTarea(model, view);

        // Mostrar la vista
        view.setVisible(true);
    }
    }
