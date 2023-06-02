public class Fiat extends Fabrica{
    @Override
    public Carro retirarCarro() {
        return new Uno();
    }
}
