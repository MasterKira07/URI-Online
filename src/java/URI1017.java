/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diogoleite.main;

/**
 *
 * @author diogo_leite
 */
public class URI1017 {
    private static final double KM_POR_LITRO = 12.0;
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int tempo = input.nextInt();
        int velocidade = input.nextInt();
        
        double litros = ( tempo * velocidade) / KM_POR_LITRO;
        
        System.out.println(String.format("%.3f", litros));
    }
}
