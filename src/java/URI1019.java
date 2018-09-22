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
public class URI1019 {
    private static final int[] VALORES = {3600, 60, 1};
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int segundos = input.nextInt();
        int[] horario = new int[3];
        
        for(int i = 0; i < horario.length; i++){
            horario[i] = segundos / VALORES[i];
            segundos %= VALORES[i];
        }
        
        System.out.println(String.format("%d:%d:%d", horario[0], horario[1], horario[2]));
        
    }
}
