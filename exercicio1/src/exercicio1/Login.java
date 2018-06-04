/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static exercicio1.Console.*;
//import static exercicio1.Console.answerFor;

/**
 *
 * @author Caio Amaral
 */
public class Login {

    private String user;
    private String password;
    private String countNumber;
    private ArrayList<Login> loginList = new ArrayList<>();

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(String countNumber) {
        this.countNumber = countNumber;
    }

    public String formatString(String str) {  //Os bancos seguem regras diferentes para compor seus números
        return str;                           //Inclusive o modulo 10 e modulo 11 são implementados de forma diferente, existem sites que fazem a validação como o PagueSeguro, por plugins
    }

    public void makeCountNumber() {
        String str = "";
        StringBuilder strBuilder = new StringBuilder(str);
        Random generator = new Random();        //Os bancos seguem regras diferentes para compor seus números
        int[] conta = new int[10];               //Inclusive o modulo 10 e modulo 11 são implementados de forma diferente,
        for (int i = 0; i < 10; i++) {          //existem sites que fazem a validação como o PagueSeguro, por plugins
            conta[i] = generator.nextInt(10);     //Esse exempplo de número de conta não possui os dígitos verificadores.
            strBuilder.append(Integer.toString(conta[i]));
        }
        str = strBuilder.toString();
        this.setCountNumber(str);
    }

    public void makePassword() {
        //A senha deve possuir 6 digitos
        String str = "";
        StringBuilder strBuilder = new StringBuilder(str);
        Random generator = new Random();
        int[] senha = new int[6];
        for (int i = 0; i < 6; i++) {
            senha[i] = generator.nextInt(10);
            strBuilder.append(Integer.toString(senha[i]));
        }
        str = strBuilder.toString();
        this.setPassword(str);
        //passwordList.add(l);
    }

    public void makeUser() {
        boolean logic = true;
        int i = 1;
        String usuario = null;
        usuario = answerFor("Digite o nome do titular da conta bancária:", usuario);
        //System.out.println("Digite o nome do titular da conta bancária:");
        //Scanner scan = getInput();
        //String usuario = scan.nextLine();
        String[] substrings = usuario.split(" ");
        inputloop:
        while (logic) {
            i = 1;
            for (String s : substrings) {
                logic = s.matches("[A-Z][a-z]*");
                if (logic == false) {
                    System.out.println("Error: Digito Inválido.");
                    logic = true;
                } else {
                    if (i == substrings.length) {
                        if (logic) {
                            this.setUser(usuario);
                            //loginList.add(l);
                        }
                        break inputloop;
                    }
                    i++;
                }
            }
        }
    }

    public void doLogin() {
        String numeroConta = null;
        boolean logic;
        Login l = new Login();
        if (this.user.equals("UserMaster")) {
            numeroConta = answerFor("Digite seu número de conta", numeroConta);
            inputloop:
            while (true) {
                for (int i = 0; i < loginList.size(); i++) {
                    if (numeroConta.equals(loginList.get(i).countNumber)) {
                        logic = true;
                        l = loginList.get(i);
                        System.out.println("Bem vindo " + l.getUser());
                        break inputloop;
                    } else if (i == loginList.size() - 1) {
                        System.out.println("Conta não encontrada");
                        logic = false;
                        break inputloop;
                    }
                }
            }

        } else {
            numeroConta = answerFor("Digite seu número de conta", numeroConta);
            inputloop:
            while (true) {
                for (int i = 0; i < loginList.size(); i++) {
                    if (numeroConta.equals(loginList.get(i).countNumber)) {
                        logic = true;
                        l = loginList.get(i);
                        System.out.println("Bem vindo " + l.getUser());
                        break inputloop;
                    } else if (i == loginList.size() - 1) {
                        System.out.println("Conta não encontrada");
                        logic = false;
                    }
                }
            }
        }

    }

    public void checkPass() {
        String senha = null;
        boolean logic;
        Login l = new Login();
        int n = 0;
        if (this.user.equals("UserMaster")) {
            inputloop:
            while (true) {
                if (n == 3) {
                    System.out.println("Operação Cancelada, a conta será bloqueada.");
                    break inputloop;
                }
                senha = answerFor("Digite sua senha", senha);
                if (senha.equals(this.password)) {
                    System.out.println("Operação Autorizada, ADM");
                    break inputloop;
                } else {
                    System.out.println("senha incorreta");
                    logic = false;
                    n++;
                    System.out.println("Mais " + (3 - n) + " tentativas e irá bloquear.");
                }

            }

        } else {
            inputloop:
            while (true) {
                if (n == 3) {
                    System.out.println("Operação Cancelada, a conta será bloqueada.");
                    break inputloop;
                }
                senha = answerFor("Digite sua senha", senha);
                if (senha.equals(this.password)) {
                    System.out.println("Operação Autorizada");
                    break inputloop;
                } else {
                    System.out.println("senha incorreta");
                    logic = false;
                    n++;
                    System.out.println("Mais " + (3 - n) + " tentativas e irá bloquear.");
                }

            }
        }

    }

    public void newAccount() {
        this.makeUser();
        this.makePassword();
        this.makeCountNumber();
        System.out.println("Titular " + this.getUser() + "\nSenha:" + this.getPassword() + "\nNumero de Conta: " + this.getCountNumber());
        loginList.add(this);
    }

    public void setAdm() {
        this.setUser("UserMaster");
        this.setPassword("123456");
        this.setCountNumber("0");
        loginList.add(this);
    }
}
