public class Ford extends Fabrica{
    @Override
    public Carro retirarCarro() {
        return new Fusion();
    }
}
