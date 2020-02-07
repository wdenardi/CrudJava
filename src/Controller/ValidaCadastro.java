package Controller;

import Dao.ClienteDaoImp;
import Model.Cliente;
import View.cadastro;
import javax.swing.JOptionPane;

public class ValidaCadastro {

    public ValidaCadastro(Cliente cc) {

        String nome = cc.getNome();
        String email = cc.getEmail();
        int renda = cc.getRenda();
        int senha = cc.getSenha();
        String tel = cc.getTelefone();
        String prof = cc.getProfissao();

        if ("".equals(nome) || ("".equals(email)) || ("".equals(renda)) || ("".equals(senha)) || ("".equals(prof)) || ("".equals(tel))) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos");

        } else {
            ClienteDaoImp dao = new ClienteDaoImp();

            dao.cadastra(cc);

        }

    }

}
