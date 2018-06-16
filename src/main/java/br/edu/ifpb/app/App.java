/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.app;

import br.edu.ifpb.entidade.Cifra;

/**
 *
 * @author mathe
 */
public class App {
    public static void main(String[] args) {
        Cifra cifra = new Cifra();
        for (int i = 0; i < 26; i++) {
            System.out.println(i+": "+cifra.descriptografa("P16M13B2", i));
        }
    }
}
