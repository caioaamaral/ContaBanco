/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Caio Amaral
 */
public class Exercicio1 extends Banco {

    //Scanner var;
    //String num;
    //int value;
    //List<ContaBanco> list = new ArrayList<>();
    //int n = 0;

    /*public static Scanner getInput() {
        Scanner var = new Scanner(System.in);
        return var;
    }

    /*public void menu() {
        boolean logos = false;
        while (logos == false) {
            System.out.println("1. Abertura e Fechamento de Contas.");
            System.out.println("2. Saque.");
            System.out.println("3. Depósito.");
            System.out.println("4. Consulta ao Saldo.");
            System.out.println("5. Simulação de um mês.");
            var = new Scanner(System.in);
            num = var.nextLine();
            if (num.equals("1") || num.equals("2") || num.equals("3") || num.equals("4") || num.equals("5")) {
                logos = true;
            } else {
                logos = false;
                System.out.println("Valor não permitido, favor digitar corretamente");
            }
        }
        value = Integer.parseInt(num);
        logos = true;
        //System.out.println(value);
        boolean looping1 = true;
        while (looping1) {
            switch (value) {
                case 1:
                    System.out.println("1- Abertura de Conta\n2-Fechamento de Conta");
                    var = getInput();
                    String valor = var.nextLine();
                    boolean looping2 = true;
                    while (looping2) {
                        switch (valor) {
                            case "1":
                                looping2 = false;
                                System.out.println("Digite nome do dono da conta.");
                                conta.abrirConta();
                                for (int i = 0; i < 20; i++) {
                                    System.out.println();
                                }
                                System.out.println("###########");
                                break;
                            case "2":
                                looping2 = false;
                                System.out.println("Digite o número da conta que deseja encerrar:");
                                conta.fecharConta();
                                break;
                            default:
                                System.out.println("ERROR: Por favor, digite 1 ou 2");
                                break;
                        }
                    }
                    menu();
                    break;

                case 2:
                    boolean logic = false;
                    System.out.println("Digite o número da conta:");
                    try {
                        conta.saque();
                    } catch (DigitoFalsoException e) {
                        System.out.println(e.getMessage());
                        logic = true;
                    }
                    /*if (conta.getStatus() == true) {
                        conta.saque();
                     */
                    /* } else {

                    while (logic) {
                        var = getInput();
                        String scan = var.nextLine();
                        System.out.println(scan);
                        if (scan.equals("S")) {
                            value = 1;
                            System.out.println("entrei aqui");
                            logic = false;
                            logos = false;
                            break;
                        } else if (scan.equals("N")) {
                            logic = false;
                            System.out.println("entrei ou aqui");
                            logos = true;
                            break;
                        } else {
                            System.out.println("Error: Por favor digite S ou N");
                            System.out.println(scan);
                        }
                    }
                    //}
                    if (logos == false) {
                        looping1 = true;
                    } else {
                        menu();
                        break;
                    }

                case 3:
                    System.out.println("Digite o número da conta:");
                    conta.deposito();
                    logos = false;
                    menu();
                    break;

                case 4:
                    System.out.println("Digite o número da conta:");                    
                    conta.getInfo();
                    logos = false;
                    menu();
                    break;

                case 5:
                    logos = false;
                    looping1 = false;
                    //System.out.println("final" + value);
                    break;

            }
        }

    } */

    public static void main(String[] args) throws Exception {
        Banco conta = new Banco();
        conta.menu();
        //conta.adm.doLogin();
        //conta.adm.checkPass();
        //conta.login.newAccount();
        //conta.login.doLogin();
        //conta.login.checkPass();
    }

}
