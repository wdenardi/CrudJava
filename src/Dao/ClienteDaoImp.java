package Dao;

import Connect.ConnectionFactory;
import Model.Cliente;
import Model.Conta;
import View.cadastro;
import View.login;
import View.telaCredito;
import Controller.CarregaTelaCredito;
import Model.ClienteDeposita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author William Denardi
 */
public class ClienteDaoImp implements ClienteDao {

    @Override
    public void validaLogin(Conta cl) {

        String email = cl.getEmail();
        int senha = (cl.getSenha());

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {

            stm = con.prepareStatement("SELECT * FROM dados_usuario WHERE email = ? and senha = ?");
            stm.setString(1, email);
            stm.setInt(2, senha);

            rs = stm.executeQuery();

            if (rs.next()) {
                System.out.println("Login valido");

                CarregaTelaCredito tct = new CarregaTelaCredito(cl);
                tct.buscarPorEmail(email);

            } else {
                JOptionPane.showMessageDialog(null, "\"Usuario ou senha incorretos", "Login Falhou", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void cadastra(Cliente cc) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("INSERT INTO dados_usuario(nome,email,telefone,profissao,renda,senha,limite) VALUES( ?,  ?,  ?,  ?,  ?, ?, ?) ");

            stm.setString(1, cc.getNome());
            stm.setString(2, cc.getEmail());
            stm.setString(3, cc.getTelefone());
            stm.setString(4, cc.getProfissao());
            stm.setInt(5, cc.getRenda());
            stm.setInt(6, cc.getSenha());
            stm.setInt(7, cc.getSaldoCredito());
            stm.executeUpdate();

            JOptionPane.showMessageDialog(null, "\"Cadastrado com sucesso", "Efeutar Login", 2);
            new login().setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Cliente buscarPorEmail(String email) {
        String sql = "SELECT * FROM dados_usuario WHERE email = ? ";
        Cliente c = new Cliente();
        try {

            Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt("num_conta"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setRenda(rs.getInt("renda"));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return c;
    }

    @Override
    public void depositaPoupanca(ClienteDeposita cd) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        System.out.println("Depositar Etapa 1");
        System.out.println(cd.getConta());
        System.out.println(cd.getRenda());
        
        try {
            System.out.println("Depositar Etapa 2");
        System.out.println(cd.getConta());
        System.out.println(cd.getRenda());
            
            stm = con.prepareStatement("UPDATE dados_usuario SET renda = renda + ? WHERE(conta = *)");
            stm.setInt(1, cd.getRenda());
            stm.setInt(2, cd.getConta());
            
            System.out.println("Depositar Etapa 3");
        System.out.println(cd.getConta());
        System.out.println(cd.getRenda());
            
            JOptionPane.showMessageDialog(null, "Valor retirado com sucesso");
            JOptionPane.showMessageDialog(null, "sessão encerrada");
            
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void excluir(Conta c) {

        System.out.print("Entrou aqui DAOOOOOO");

        String sql = "DELETE FROM dados_usuario WHERE email = ?;";
        try {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, String.valueOf(c.getEmail()));
            ps.execute();
            ps.close();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public Cliente buscaLimite(String email) {
        String sql = "SELECT * FROM dados_usuario WHERE email = ? ";
        Cliente c = new Cliente();
        try {

            Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setSaldoCredito(rs.getInt("limite"));
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return c;
    }

    @Override
    public void tranfereDinheiro(String email) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("");

            JOptionPane.showMessageDialog(null, "Tranferido com sucesso");
            JOptionPane.showMessageDialog(null, "sessão encerrada");

            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
