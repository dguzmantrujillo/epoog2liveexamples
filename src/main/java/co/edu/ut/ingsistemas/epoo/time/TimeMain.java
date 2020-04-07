/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.epoo.time;

/**
 *
 * @author dguzm
 */
public class TimeMain {

    public static void main(String[] args) {

        Time time = new Time(25, 1, 59);
        System.out.println("Actual time: " + time);
        Time timeAfterOneSecond = time.nextSecond();
        System.out.println("Actual time after one second: " + timeAfterOneSecond);

    }
}
