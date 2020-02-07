package Controller;

import Dao.ClienteDaoImp;
import Model.ClienteDeposita;


public class DepositarController {

    public DepositarController(ClienteDeposita cd) {

        
        
        
        ClienteDaoImp dao = new ClienteDaoImp();
        
        dao.depositaPoupanca(cd);
    }

}
