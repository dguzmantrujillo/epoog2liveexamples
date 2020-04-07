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
public class Time {

    /**
     * hour - Parte hora del tiempo.
     */
    private int hour;

    /**
     * minute - Parte minuto del tiempo.
     */
    private int minute;

    /**
     * second - Parte segundo del tiempo.
     */
    private int second;

    /**
     * Inicializa un objeto tiempo según sus partes.
     *
     * @param hour Parte hora.
     * @param minute Parte minuto.
     * @param second Parte segundo.
     */
    public Time(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    /**
     * Obtiene el valor de la parte hora.
     *
     * @return Valor de la parte hora.
     */
    public int getHour() {
        return hour;
    }

    /**
     * Establece el valor de la parte hora.
     *
     * @param hour Parte hora.
     * @throws IllegalArgumentException Si el valor hora no está en el rango [0,
     * 23].
     */
    public final void setHour(int hour) {
        if (!(0 <= hour && hour <= 23)) {
            throw new IllegalArgumentException("Invalid hour");
        }

        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public final void setMinute(int minute) {

        if (!(0 <= minute && minute <= 59)) {
            throw new IllegalArgumentException("Invalid minute");
        }

        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public final void setSecond(int second) {

        if (!(0 <= second && second <= 59)) {
            throw new IllegalArgumentException("Invalid second");
        }

        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    @Override
    public String toString() {
        return "" + hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        if (this.second == 59) {
            this.incrementMinute();
            this.second = 0;
        } else {
            this.second++;
        }
        return this;
    }

    private void incrementMinute() {
        if (this.minute == 59) {
            this.incrementHour();
            this.minute = 0;
        } else {
            this.minute++;
        }
    }

    private void incrementHour() {
        if (this.hour == 23) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else {
            this.hour++;
        }
    }
}
