package Entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @luis pires 27/05/2020
 */
public class Funcoes {
    
    double valor1;
    double valor2;

    public double mult(double valor1, double valor2) {
        return valor1 * valor2;
    }

    
    public double div(double valor1, double valor2) {
        return valor1 / valor2;
    }
    
    public double sub(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }
    
    public double porcentagem(double val, double porcentagem){
        
        return val * porcentagem/100;
    }

}
