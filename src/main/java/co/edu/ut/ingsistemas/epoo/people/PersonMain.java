/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.people;

/**
 * Lanzador del programa de ejemplo.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class PersonMain {

    /**
     * Punto de entrada de ejecución del programa.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1. Crear un objeto Person y asignarlo a la variable juan.
        Person juan = new Person(1, "JUAN", "PEREZ");

        // 2. Ejemplo de cómo modificar un valor de los atributos, respetando el pilar de encapsulamiento.
        juan.setId(10);

        // 3. Crear otro objeto Person y asignarlo a la variable pedro.
        Person pedro = new Person(2, "PEDRO", "SUAREZ");

        // 4. Llamar al método o comportamiento obtener nombre completo.
        String pedrosFullName = pedro.getFullName();

        // 5. Imprimir por consola el resultado de de haber llamado al comportamiento getFullName() sobre el objeto Person pedro.
        System.out.println("El nombre completo de pedro es: " + pedrosFullName);
    }
}
