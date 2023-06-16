public abstract class Carro {
    private String nome;
    private Integer potencia;
    private Integer estadoCarro;

    public Carro (String nome, Integer potencia) {
        this.nome = nome;
        this.potencia = potencia;
        this.estadoCarro = 0;
    }

    public void especificacoes () {
        System.out.println("Carro: " + this.nome + " Potência: " + this.potencia + " CV");
    }

    public void ligarCarro() {
        if (this.estadoCarro == 1) {
            System.out.println(this.nome + " já está ligado!");
        } else {
            this.estadoCarro = 1;
            System.out.println(this.nome + " está ligado! VRUM VRUM!!");
        }
    }

    public void DesligarCarro() {
        if (this.estadoCarro == 0) {
            System.out.println(this.nome + " já está Desligado!");
        } else {
            this.estadoCarro = 0;
            System.out.println(this.nome + " está Desligado!");
        }
    }

    public void dirigir () {
        if (this.estadoCarro == 1) {
            System.out.println("Dirigindo e passando a marcha manualmente!");
        } else {
            System.out.println("Ligue o carro antes de dirigir!");
        }
    }
}
