import java.util.ArrayList;

public class Advogado extends Cliente{
   
    private ArrayList<Cliente> clientes;
    
    public Advogado(){
    	this.clientes = new ArrayList<Cliente>();
    }
    
    
    public void setClientes(ArrayList<Cliente> novoCliente){
        this.clientes = novoCliente;
    }
     
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
} 
    
    
    

