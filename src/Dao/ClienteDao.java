/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Cliente;
import Model.ClienteDeposita;
import Model.Conta;

public interface ClienteDao {

    public void validaLogin(Conta cl);

    public void cadastra(Cliente cc);

    public Cliente buscarPorEmail(String email);

    public void tranfereDinheiro(String email);

    public void depositaPoupanca(ClienteDeposita td);

}
