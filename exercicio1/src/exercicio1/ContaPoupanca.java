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
public class ContaPoupanca extends Banco implements BankOperations {

    
    @Override
    public void abrirConta(){
        //System.out.println(value);
        login.newAccount();
        this.setTipo("cp");
        this.setDono(login.getUser());
        this.setNumero(login.getCountNumber());
        this.setSaldo(100);
        this.setStatus(true);
        System.out.println("Conta criada com sucesso: \n");
        this.getInfo();
    }

 /*   
    @Override
    public void fecharConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saque(int valSaque) throws DigitoFalsoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deposito(int valDep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mensalidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //public abstract void menu();
    */
}
