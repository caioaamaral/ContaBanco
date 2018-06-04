/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static exercicio1.Console.*;

/**
 *
 * @author Caio Amaral
 */
public class Banco implements BankOperations {

    private String tipo, dono, numero, senha;
    int n = 0;
    float saldo;
    boolean status;
    Scanner var;
    String num;
    Login login = new Login();
    Login adm = new Login();
    BankOperations api;
    List<Banco> list = new ArrayList<>();
    List<BankOperations> bancoDados = new ArrayList<>();

    public static Scanner getInput() {
        Scanner var = new Scanner(System.in);
        return var;
    }

    public Banco() {
        this.status = false;
        this.saldo = 0;
        adm.setAdm();
    }
    

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
/*
    public void abrirConta(int i) {
        //System.out.println(value);
        login.newAccount();
        var = getInput();
        String dono = var.nextLine();
        this.setDono(dono);
        boolean logos = false;
        while (logos == false) {
            System.out.println("1. Para Conta-Corrente\n2. Para Conta Poupança");
            var = getInput();
            String scan = var.nextLine();
            if (scan.equals("1") || scan.equals("2")) {
                logos = true;
                if (scan.equals("1")) {
                    this.setTipo("cc");
                    this.setSaldo(150);
                } else if (scan.equals("2")) {
                    this.setTipo("cp");
                    this.setSaldo(100);
                }
            }
        }
        this.setStatus(true);
        //this.setNumero(i);
        System.out.println("Conta criada com sucesso: \n");
        this.getInfo();
    }

    public void fecharConta() {
        Banco conta = new Banco();
        var = getInput();
        int number = var.nextInt();
        conta = list.get(number - 1);
        conta.setStatus(false);
    }

    public void saque(int valSaque) throws DigitoFalsoException {
        if (this.getStatus() == true) {
            if (valSaque > 0) {
                if (valSaque <= this.getSaldo()) {
                    setSaldo(this.getSaldo() - valSaque);
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else {
                throw new DigitoFalsoException("Operação Impossível: Não é possível sacar número negativo");
            }

        } else {
            throw new DigitoFalsoException("Operação Impossível: Conta se encontra fechada, deseja abrir nova conta? \n S - sim\n N - não");
        }

    }

    public void deposito(int valDep) {
        if (this.getStatus() == true) {
            setSaldo(this.getSaldo() - valDep);
        } else {
            System.out.println("Conta Fechada ou Inexistente.");
        }
    }

    public void mensalidade() {
        /* to do Sugestão: Renomear essa classe a Banco
                // A classe Banco perde todas as operações bancárias, mantendo somente seus getters e setters
                //
                // Criar a nova classe Login,
                //                              que teria os dados da conta: Atributos de Login
                //                                                   {NomeUser; Senha; ContaNumber}
                //                                                
                //                              e também geraria o número de conta, usaria mask e trataria exceções de preenchimento de formulário
                //                              bem como teria um método autenticar, para permitir as operações bancárias
                // 
                // Criar a interface BankOperations
                //             essa classe terá o método menu();
                //             terá também os métodos {abrirConta, fecharConta, etc)
                //
                // Além disso, criar duas novas classes: ContaCorrente e ContaPoupança
                //                                      cada classe salva numa list diferente
                //
                // Essas duas classes compartilham da mesma interface, implementando métodos abstratos:
                //                                                  {saque, deposito, abrirConta, fecharConta, mensalidade)
                // Além de ter os atributos da classe Banco
                //                  {dono, contaNumber, status, tipo, saldo}
                //
                //
                // Banco agrega Login implementa BankOperations
                // ContaCorrente e ContaPoupança extends Banco 
         
    }
*/
    public void getInfo() {

        for (int i = 0; i < 5; i++) {
            System.out.println();
        }
        System.out.println("################");
        System.out.println("Dono: " + this.getDono()
                + "\nSenha: " + this.getSenha()
                + "\nNumero de Conta: " + this.getNumero()
                + "\nStatus: " + this.getStatus() 
                + "\nTipo: " + this.getTipo() 
                + "\nSaldo: R$ " + this.getSaldo());
        
        System.out.println("################");

        for (int i = 0; i < 5; i++) {
            System.out.println();
        }

    }

    public void geradorContas(BankOperations newConta) {
        newConta.abrirConta();
    }

    @Override
    public void menu() throws DigitoFalsoException {
        adm.setAdm();
        Banco conta = new Banco();
        inputloop:
        while (true) {
            //Banco conta = new Banco();
            boolean looping1 = true;
            inputloop1:
            while (true) {
                System.out.println("1. Abertura e Fechamento de Contas.");
                System.out.println("2. Saque.");
                System.out.println("3. Depósito.");
                System.out.println("4. Consulta ao Saldo.");
                System.out.println("5. Simulação de um mês.");
                var = new Scanner(System.in);
                num = var.nextLine();

                if (num.equals("1") || num.equals("2") || num.equals("3") || num.equals("4") || num.equals("5")) {
                    looping1 = false;
                    break inputloop1;
                } else {
                    throw new DigitoFalsoException("Valor não permitido, favor digitar corretamente");
                }
            }
            
            //value = Integer.parseInt(num);
            //logos = true;
            //System.out.println(value);
            boolean looping2 = true;
            inputloop2:
            while (true) {
                switch (num) {
                    case "1":
                        System.out.println("1- Abertura de Conta\n2 -Fechamento de Conta");
                        var = getInput();
                        String valor = var.nextLine();
                        boolean looping3 = true;
                        while (looping3) {
                            switch (valor) {
                                case "1":
                                    looping3 = false;
                                    System.out.println("Abertura de conta.");
                                    valor = answerFor("1 - Conta Corrente\n2- Conta-Poupança", valor);
                                    inputloop3:
                                    while (true) {
                                        switch (valor) {
                                            case "1":
                                                ContaCorrente cc = new ContaCorrente();
                                                cc.abrirConta();
                                                list.add(cc);
                                                break inputloop3;
                                            case "2":
                                                ContaPoupanca cp = new ContaPoupanca();
                                                cp.abrirConta();
                                                list.add(cp);
                                                break inputloop3;
                                            default:
                                                System.out.println("ERROR: Por favor, digite 1 ou 2");
                                                break;
                                        }
                                    }
                                    //conta = new Banco();
                                    n++;
                                    //conta.abrirConta(n);
                                    //conta.geradorContas(conta);
                                    //list.add(conta);
                                    System.out.println("###########");
                                    for (int i = 0; i < 3; i++) {
                                        System.out.println();
                                    }
                                    looping2 = false;
                                    break inputloop2;
                                case "2":
                                    looping3 = false;
                                    System.out.println("Digite o número da conta que deseja encerrar:");
                                    //conta.fecharConta();
                                    break;
                                default:
                                    System.out.println("ERROR: Por favor, digite 1 ou 2");
                                    break;
                            }
                        }
                        break;

                    case "2":
                        boolean logic = false;
                        int numberr =0;
                        numberr = answerFor("Digite o número da conta:", numberr);
                        
                        
                        System.out.println("Digite o número da conta:");
                        var = getInput();
                        numberr = var.nextInt();
                        System.out.println(numberr);
                        list.get(numberr - 1).getInfo();
                        /*conta = list.get(number - 1);
                        try {
                            System.out.println("Digite o valor que deseja sacar");
                            var = getInput();
                            int valSaque = var.nextInt();
                            conta.saque(valSaque);
                            list.add(number - 1, conta);
                        } catch (DigitoFalsoException e) {
                            System.out.println(e.getMessage());
                            logic = true;
                        }
                        */
                        /*if (conta.getStatus() == true) {
                        conta.saque();
                         */
                        // } else {
                        while (logic) {
                            var = getInput();
                            String scan = var.nextLine();
                            System.out.println(scan);
                            if (scan.equals("S")) {
                                num = "1";
                                System.out.println("entrei aqui");
                                logic = false;
                                looping2 = true;
                                break;
                            } else if (scan.equals("N")) {
                                logic = false;
                                System.out.println("entrei ou aqui");
                                break;
                            } else {
                                System.out.println("Error: Por favor digite S ou N");
                                System.out.println(scan);
                            }
                        }
                        if (logic == false) {
                            looping2 = false;
                        }
                        break;

                    case "3":
                        System.out.println("Digite o número da conta:");
                        var = getInput();
                        numberr = var.nextInt();
                        //conta = list.get(number - 1);
                        System.out.println("Insira o valor a ser depositado");
                        var = getInput();
                        int valDep = var.nextInt();
                        //conta.deposito(valDep);
                        looping2 = false;
                        break;

                    case "4":
                        String number = null;
                        number = answerFor("Digite o número da conta:", number);
                        
                        for (int i = 0; i< list.size(); i++){
                            if ( number.equals(list.get(i).getNumero()) ){
                                conta = list.get(i);
                                conta.getInfo();
                                break inputloop2;
                            }
                            else if(i == list.size()- 1 ){
                                System.out.println("Conta Inexistente");
                                break;
                            }
                        }
                        
                        //System.out.println("Digite o número da conta:");
                        //var = getInput();
                        //numberr = var.nextInt();
                        //conta = list.get(number - 1);
                        //conta.getInfo();
                        looping2 = false;
                        break;

                    case "5":
                        looping2 = false;
                        //System.out.println("final" + value);
                        break inputloop;

                }
            }
        }
    }

    @Override
    public void abrirConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
