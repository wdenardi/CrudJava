
package Model;

public class ClienteDeposita {
    
    
       private int conta;
    
        private int renda;

  

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
     * @return the conta
     */
    public int getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(int conta) {
        this.conta = conta;
    }
    
      public String toString() {

        return  conta + "-" + renda;
    }

    
}
