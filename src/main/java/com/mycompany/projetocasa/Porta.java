/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocasa;

/**
 *
 * @author Alunos
 */
public class Porta {
    private boolean aberta;
    private String cor;
    double altura;
    double comprimento;

    public Porta() {
        this.aberta = false; 
        this.cor = "branca"; 
        this.altura = 2.0; 
        this.comprimento = 0.8;
    }

    public void abrir() {
        aberta = true;
    }

    public void fechar() {
        aberta = false;
    }

    public void pintar(String c) {
        cor = c;
    }

    public boolean estaAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    public double getAltura() {
        return altura;
    }

    public double getComprimento() {
        return comprimento;
    }
}

