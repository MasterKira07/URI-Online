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
public class URI1015 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] pontoA = new double[2];
        double[] pontoB = new double[2];
        
        pontoA[0] = input.nextDouble();
        pontoA[1] = input.nextDouble();
        
        pontoB[0] = input.nextDouble();
        pontoB[1] = input.nextDouble();
        
        input.close();
        double distancia = Math.sqrt(Math.pow(pontoB[0] - pontoA[0],2) + Math.pow(pontoB[1] - pontoA[1], 2));
        
        System.out.println(String.format("%.4f", distancia));
    }
}
