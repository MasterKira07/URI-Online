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
public class URI1020 {
    private static final int[] VALORES = {365, 30, 1};
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int diasIdade = input.nextInt();
		int ano = diasIdade/365;
		
		int mes = (diasIdade - (ano * 365) )/30;
		
		int dias = diasIdade - (ano * 365 + mes * 30);
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");
		
    }
}
