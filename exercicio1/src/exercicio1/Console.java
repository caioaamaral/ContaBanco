/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Caio Amaral
 */
public class Console {

    public static String answerFor(String mensagem, String str) {
        System.out.println(mensagem);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int answerFor(String mensagem, int i) {
        System.out.println(mensagem);
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static double answerFor(String mensagem, double b) {
        System.out.println(mensagem);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static float answerFor(String mensagem, float f) {
        System.out.println(mensagem);
        Scanner scan = new Scanner(System.in);
        return scan.nextFloat();
    }
}
