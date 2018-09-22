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
public class URI1014 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int distancia = input.nextInt();
        double litro = input.nextDouble();
        input.close();
        double kmPorLitro = distancia / litro;
        System.out.println(String.format("%.3f km/l", kmPorLitro));
    }
}
