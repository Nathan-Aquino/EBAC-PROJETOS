import com.sun.corba.se.spi.orbutil.fsm.FSM;

public abstract class Fabrica {
    public static Fabrica fabricaEscolhida(Funcionario funcionario) {
        switch (funcionario.getCargo()) {
            case "CEO":
            case "Diretor":
                return new Tesla();
            case "Gerente":
                return new Ford();
            case "Analista":
                return new Fiat();
            default:
                return null;
        }
    }

    public Carro criarCarro(){
        Carro carro = retirarCarro();
        return carro;
    }

    abstract public Carro retirarCarro();
}
