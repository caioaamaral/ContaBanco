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
public interface BankOperations {
    int i=0;
    public void abrirConta();
    /*
    public void fecharConta();
    public void saque(int valSaque) throws DigitoFalsoException;
    public void deposito(int valDep);
    public void mensalidade();
    public void getInfo();

*/
    public void menu() throws DigitoFalsoException;
    
}