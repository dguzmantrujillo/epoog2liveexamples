/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ejemplo de Programación Orientada a Objetos en lenguaje de programación (JavaScript) que no requiere el uso de clases --al estilo de Smalltalk--.
 * @type {person}
 */
var person = {firstName: "John", lastName: "Doe", id: 5566, fullName: function () {
        return this.firstName + " " + this.lastName;
    }};

var fullName = person.fullName();
console.info(fullName);