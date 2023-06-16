public class ModelS extends Carro{
    private boolean modoDeDirigir;

    public ModelS (boolean modoDeDirigir) {
        super("Model S", 1034);
        this.modoDeDirigir = modoDeDirigir;
    }

    @Override
    public void dirigir() {
        if (this.modoDeDirigir) {
            System.out.println("Você pode relaxar! O piloto automático está ativo.");
        } else {
            System.out.println("Dirigindo enquanto a marcha é passada automáticamente!");
        }
    }

    public void ativarDesativarPilotoAutomatico () {
        this.modoDeDirigir = !this.modoDeDirigir;
    }
}
