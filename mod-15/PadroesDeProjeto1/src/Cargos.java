public enum Cargos {
    CEO(1),
    Diretor(2),
    Gerente(3),
    Analista(4);

    private final int index;

    private Cargos (int index) {
        this.index = index;
    }

    public static String cargoEscolhido (int num) {
        for (Cargos cargo : Cargos.values()) {
            if (cargo.index == num) {
                return cargo.toString();
            }
        }
        throw new IllegalArgumentException("Cargo Inválido!");
    }

}
