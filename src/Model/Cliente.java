
package Model;


public class Cliente {

    private int id;
    private int renda;
    private int senha;
    private int saldoCredito;
    private String nome;
    private String email;
    private String profissao;
    private String telefone;
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the renda
     */
    public int getRenda() {
        return renda;
    }

    /**
     * @param renda the renda to set
     */
    public void setRenda(int renda) {
        this.renda = renda;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
      /**
     * @return the saldoCredito
     */
    public int getSaldoCredito() {
        return saldoCredito;
    }

    /**
     * @param saldoCredito the saldoCredito to set
     */
    public void setSaldoCredito(int saldoCredito) {
        this.saldoCredito = saldoCredito;
    }

    public String toString() {

        return id + "-" + telefone + "-" + email + "-" + profissao + "-" + renda + "-" + "-" + senha+" "+saldoCredito;
    }

   

}

    

