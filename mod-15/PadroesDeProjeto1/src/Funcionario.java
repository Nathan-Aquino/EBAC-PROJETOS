public class Funcionario {
    public String name;
    public Integer idade;
    private String cargo;

    public Funcionario (String name, Integer idade, int cargo) {
        this.name = name;
        this.idade = idade;
        this.cargo = Cargos.cargoEscolhido(cargo);
    }

    public String getCargo() {
        return this.cargo;
    }
}
