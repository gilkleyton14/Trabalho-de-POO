public class Processo {
    private int numero;
    private String titulo;
    
    public Processo() {
    }
    
    public Processo(int numero, String titulo) {
        this.setNumero(numero);
        this.setTitulo(titulo);
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
}
