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
public class URI1016 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        int tempo = input.nextInt() * 2;
        
        input.close();
        
        System.out.println(String.format("%d minutos", tempo));
    }
}
