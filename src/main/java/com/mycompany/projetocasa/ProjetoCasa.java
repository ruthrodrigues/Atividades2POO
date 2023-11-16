/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetocasa;

/**
 *
 * @author Alunos
 */
public class ProjetoCasa {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("azul");

        minhaCasa.pintar("verde");
        System.out.println("Cor da casa: " + minhaCasa.getCor());

        Porta porta1 = minhaCasa.getPorta1();
        Porta porta2 = minhaCasa.getPorta2();

        porta1.abrir();
        porta2.abrir();
        System.out.println("Número de portas abertas: " + minhaCasa.quantPortasAbertas());

        porta1.fechar();
        System.out.println("Número de portas abertas: " + minhaCasa.quantPortasAbertas());
    }
}
