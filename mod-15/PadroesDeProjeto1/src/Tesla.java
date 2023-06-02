public class Tesla extends Fabrica{
    @Override
    public Carro retirarCarro() {
        return new ModelS();
    }
}
