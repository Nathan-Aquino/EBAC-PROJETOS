public class Dachshund {
    public String nome;
    public int idade;

    /**
     * Construtor da classe Dachshund
     *
     * @param nome nome do Dachshund
     * @param idade idade do Dachshund
     */
    public Dachshund(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void latir(){
        System.out.println(this.nome + " está latindo... au au!");
    }

    public void abanarRabo(){
        System.out.println(this.nome  + " está abanando o rabinho!");
    }

    // é costume entre os cachorros cavocar, mas para a raça Dachshund esse costume é elevado devido a origem da raça
    public void cavocarFundo(){
        System.out.println(this.nome  + " está cavando bem fundo!");
    }

    /* Os Dachshund foram criados para caçar texugos, por isso são equipados com patas fortes
    e longas garras prontas para cavocar qualquer terreno onde um desses pode morar
    */
    public void caçarTexugos(){
        System.out.println(this.nome  + " está caçando um texugo!!");
    }
}
