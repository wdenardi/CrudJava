/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.ClienteDaoImp;
import Model.Cliente;
import Model.ClienteDeposita;
import Model.Conta;
import javax.swing.JOptionPane;

public class Retirar {
    

    

    
    public void Deposita(ClienteDeposita cp) {

        System.out.print("ENTROU AQUI YTMMM ");
        System.out.print(cp.getRenda());
       
        
        System.out.print(cp.getConta());
        
        ClienteDaoImp dao = new ClienteDaoImp();

        dao.depositaPoupanca(cp);
        
        

    }
    

}
