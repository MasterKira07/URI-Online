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
public class URI1018 {
    private static final int[] VALORES = {100, 50, 20, 10, 5, 2, 1};
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int cedulas = input.nextInt();
        int valor = cedulas;
        input.close();
        int[] qtdCedulas = new int[7];
        for(int i = 0; i < qtdCedulas.length; i++){
            qtdCedulas[i] = quantidadeCedulas(cedulas, VALORES[i]);
            cedulas = tiraValor(cedulas, VALORES[i]);
        }
        System.out.println(valor);
        System.out.println(String.format("%d nota(s) de R$ 100,00",  qtdCedulas[0]));
        System.out.println(String.format("%d nota(s) de R$ 50,00",  qtdCedulas[1]));
        System.out.println(String.format("%d nota(s) de R$ 20,00",  qtdCedulas[2]));
        System.out.println(String.format("%d nota(s) de R$ 10,00",  qtdCedulas[3]));
        System.out.println(String.format("%d nota(s) de R$ 5,00",  qtdCedulas[4]));
        System.out.println(String.format("%d nota(s) de R$ 2,00",  qtdCedulas[5]));
        System.out.println(String.format("%d nota(s) de R$ 1,00",  qtdCedulas[6]));
    }
    
    public static int quantidadeCedulas(int cedulas, int valorCedula){
        return cedulas / valorCedula;
    }
    
    public static int tiraValor(int cedulas, int valorCedula){
        return cedulas % valorCedula;
    }
}
