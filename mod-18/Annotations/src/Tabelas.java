public class Tabelas {
    public String nome;

    public Tabelas (String nome){
        this.nome = nome;
    }

    @Tabela(value = "Tabela com Annotation")
    public void criaTabela () {
        System.out.println("Tabela " + this.nome + " criada!");
    }
}
