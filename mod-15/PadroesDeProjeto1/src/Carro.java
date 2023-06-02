abstract public class Carro {
    public String nome;
    public Integer potencia;
    private Integer estadoCarro;

    public Carro (String nome, Integer potencia) {
        this.nome = nome;
        this.potencia = potencia;
        this.estadoCarro = 0;
    }

    public String getNome () {
        return this.nome;
    }

    public String getPotencia () {
        return this.potencia + " CV";
    }

    public String ligarCarro() {
        if (this.estadoCarro == 1) {
            return this.nome + " já está ligado!";
        } else {
            this.estadoCarro = 1;
            return this.nome + " está ligado! VRUM VRUM!!";
        }
    }

    public String DesligarCarro() {
        if (this.estadoCarro == 0) {
            return this.nome + " já está Desligado!";
        } else {
            this.estadoCarro = 0;
            return this.nome + " está Desligado!";
        }
    }
}
