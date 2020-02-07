package Controller;

import Dao.ClienteDaoImp;
import Model.Conta;

public class Desativar {

  

    public Desativar(Conta c) {

        
        System.out.print("Entrou aqui controller");
        
        ClienteDaoImp dao = new ClienteDaoImp();

        dao.excluir(c);

    }

    
}
