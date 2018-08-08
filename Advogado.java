import java.util.ArrayList;

public class Advogado extends Pessoa{
   
    private ArrayList<Cliente> clientes;
    
    public Advogado() {
        super();
        this.clientes = new ArrayList<Cliente>();
    }
    
    public Advogado(String nome, int idade, ArrayList<Cliente> clientes){
        super(nome, idade);
        this.clientes = clientes;
    }
    
    public void setClientes(ArrayList<Cliente> novoCliente){
        this.clientes = novoCliente;
    }
     
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
} 
    
    
    

