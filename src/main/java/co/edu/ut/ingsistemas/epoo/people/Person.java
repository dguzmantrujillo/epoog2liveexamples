/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.people;

/**
 * Ejemplo de Programación Orientada a Objetos en lenguaje de programación
 * (Java) que requiere el uso de clases --al estilo de Simula 67--.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class Person {

    /**
     * id - Identificador de la persona.
     */
    private long id;

    /**
     * firstName - Nombres.
     */
    private String firstName;

    /**
     * lastName - Apellidos.
     */
    private String lastName;

    /**
     * Método constructor para inicializar un objeto tipo Person.
     *
     * @param id Identificador de la persona.
     * @param firstName Nombres.
     * @param lastName Apellidos.
     */
    public Person(long id, String firstName, String lastName) {
        // La palabra this indica "este objeto". Se usa en este contexto para diferenciar el atributo de las variables locales cuando se llaman igual.
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Obtiene el identificador de la persona.
     * @return Identificador.
     */
    public long getId() {
        return id;
    }

    /**
     * Establece el identificador de la persona.
     * @param id Identificador a establecer.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obtiene los nombres de la persona.
     * @return Nombres.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece los nombres de la persona.
     * @param firstName Nombres a establecer.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtiene los apellidos de la persona.
     * @return Apellidos de la persona.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece los apellidos de la persona.
     * @param lastName Apellidos a establecer.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtiene el nombre completo de la persona.
     * @return Nombre completo=firstName+lastName.
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}