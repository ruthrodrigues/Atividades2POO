/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocasa;

/**
 *
 * @author Alunos
 */
public class Casa {
    private String cor;
    private final Porta porta1;
    private final Porta porta2;

    // Construtor para inicializar a Casa com a cor e duas portas
    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta(); // Inicializa a porta1
        this.porta2 = new Porta(); // Inicializa a porta2
    }

    // Método para pintar a casa com uma cor especificada
    public void pintar(String c) {
        cor = c;
    }

    // Método para obter o número de portas abertas na casa
    public int quantPortasAbertas() {
        int quantAbertas = 0;

        if (porta1.estaAberta()) {
            quantAbertas++;
        }

        if (porta2.estaAberta()) {
            quantAbertas++;
        }

        return quantAbertas;
    }

    // Métodos para obter informações sobre a casa
    public String getCor() {
        return cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }
}
