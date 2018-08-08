public abstract class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa() {
        this.setNome("");
        this.setIdade(0);
    }
    
    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return this.idade;
    }
}
