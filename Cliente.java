public class Cliente extends Pessoa{
    
    private Processo processo;
    
    public Cliente() {
        super();
    }
    
    public Cliente(String nome, int idade, Processo processo) {
        super(nome, idade);
        this.processo = processo;
    }
    
    public void setProcesso(Processo processo) {
        this.processo = processo;
    }
    
    public Processo getProcesso() {
        return this.processo;
    }
}
