/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

import javax.swing.JFrame;

/**
 *
 * @author 66211020764
 */
public class Jokenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tela t = new Tela();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(640, 530);
        t.setVisible(true);
    }
    
}
