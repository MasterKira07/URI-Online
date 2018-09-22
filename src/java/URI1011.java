package br.com.diogoleite.main;

import java.util.Scanner;

/**
 *
 * @author diogo_leite
 */
public class URI1011 {
    private static double PI = 3.14159;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        double volume = (4/3.0) * PI * Math.pow(raio, 3);
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}
