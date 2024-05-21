/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jaco
 */
public class Estudiante {
    private String fullName;
    private double note1;
    private double note2;
    private double note3;

    public Estudiante(String fullName, double note1, double note2, double note3) {
        this.fullName = fullName;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(int note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(int note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(int note3) {
        this.note3 = note3;
    }
    
    public double calcularPromedio(){
        double promedio = (note1 + note2 + note3)/3.0 ;
        
        return promedio;
    }
    
    public String clasificar(){
        double promedio = (note1 + note2 + note3)/3.0 ;
        if (promedio <= 3.9) {
            return "INSUFICIENTE";
        } else if (promedio >= 4.0 && promedio < 7.0 ) {
            return "MALO";
        } else if (promedio >= 7.0 && promedio <= 8.0 ) {
            return "BUENO";
        } else if (promedio > 8.0 && promedio <= 10.0 ) {
            return "EXCELENTE";
        } else {
            return "DESCONOCIDO";
        }
    }
}
