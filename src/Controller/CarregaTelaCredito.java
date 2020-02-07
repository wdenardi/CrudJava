package Controller;

import Dao.ClienteDaoImp;
import Model.Cliente;
import java.util.List;
import Controller.CarregaTelaCredito;
import Dao.ClienteDao;
import Model.Conta;
import View.telaCredito;

public class CarregaTelaCredito {
    
    public Cliente c = null;
    public ClienteDaoImp dao;
    
    public CarregaTelaCredito(Conta cl) {
        
        dao = new ClienteDaoImp();
        
    }
    
    public Cliente buscarPorEmail(String email) {
        
        System.out.println("ENTROUU AQUI");
        
        c = dao.buscarPorEmail(email);
        if (c != null) {
            
            new telaCredito(c).setVisible(true);
            
        } else {
            System.out.print("Nenhum cliente foi encontrado");
        }
        System.out.println(c.getEmail());
        return c;
        
    }
    
}
