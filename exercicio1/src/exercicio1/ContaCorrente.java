/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Caio Amaral
 */
public class ContaCorrente extends Banco implements BankOperations {

    @Override
    public void abrirConta(){
        //System.out.println(value);
        login.newAccount();
        this.setTipo("cc");
        this.setDono(login.getUser());
        this.setSenha(login.getPassword());
        this.setNumero(login.getCountNumber());
        this.setSaldo(150);
        this.setStatus(true);
        System.out.println("Conta criada com sucesso: \n");
        this.getInfo();
    }
    /*
    @Override
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

    @Override
    public abstract void fecharConta();

    @Override
    public abstract void saque(int valSaque) throws DigitoFalsoException;

    @Override
    public abstract void deposito(int valDep);


*/
    

    
/*
    @Override
    public abstract void menu() throws DigitoFalsoException;
*/
//public abstract void menu();
}
