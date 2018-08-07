public class Cliente{
    
    private String nomeCliente;
    private int processo;
    
    public Cliente (){
    	this.nomeCliente = "";
    	this.processo = 0;
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    
    public void setNumeroProcesso(int numeroProcesso){
        this.processo = numeroProcesso;
    }
    
    public int getNumeroProcesso(){
    	return this.processo;
    }
}
