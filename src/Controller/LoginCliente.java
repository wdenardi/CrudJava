package Controller;

import Dao.ClienteDaoImp;
import Model.Cliente;
import Model.Conta;
import java.util.List;

public class LoginCliente {

    public LoginCliente(Conta cl) {

        String email = cl.getEmail();
        int senha = cl.getSenha();

        ClienteDaoImp dao = new ClienteDaoImp();

        dao.validaLogin(cl);
    }

}
