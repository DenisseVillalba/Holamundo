# Gestor de Tareas en Java

## Consiste
Esta es una aplicación de escritorio desarrollada en Java que permite gestionar tareas simples. Utiliza el patrón arquitectónico Modelo-Vista-Controlador (MVC) y componentes gráficos de Swing

## Estructura del Proyecto (aplica 3 paquetes)
- Modelo
  - `Tarea`: Representa una tarea con atributos como id, nombre, descripción y estado (pendiente o completada)
  - `GestorTareas`: Gestiona la lógica de negocio, incluyendo almacenamiento y manipulación de tareas

- Vista
  - `MainView`: Interfaz gráfica que incluye un formulario para agregar tareas, una tabla para mostrar las tareas y botones para actualizar, agregar y eliminar tareas

- Controlador
  - `TareasController`: Maneja la interacción entre la vista y el modelo, escuchando eventos de la interfaz gráfica

## Funcionalidades
- **Agregar Tareas**: Permite al usuario crear nuevas tareas mediante un formulario
- **Listar Tareas**: Muestra todas las tareas existentes en una tabla
- **Actualizar Estado de Tareas**: Permite marcar tareas como completadas
- **Eliminar Tareas**: Permite eliminar tareas seleccionadas de la lista

## Funcionamineto del programa
1. Asegúrate de tener Java instalado en tu máquina.
2. Clona este repositorio o descarga los archivos.
4. Ejecuta la clase principal que contiene el método `main`.

## Otros datos
- Java JDK 8 o superior.
- Biblioteca Swing para la interfaz gráfica.

## Documentación
Este proyecto sigue el patrón MVC y utiliza componentes gráficos de Swing para crear una interfaz de usuario intuitiva. La lógica de negocio se gestiona en el modelo, mientras que la vista y el controlador se encargan de la interacción del usuario.
