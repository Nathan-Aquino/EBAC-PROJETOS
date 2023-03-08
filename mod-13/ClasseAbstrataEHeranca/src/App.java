public class App {
    public static void main(String[] args) {
        PessoaFisica pessoaF = new PessoaFisica("Nathan", "12345");
        PessoaJuridica pessoaJ = new PessoaJuridica("Teste ltda", "67890");

        System.out.println(pessoaF.getNome() + " é uma pessoa física de cpf: " + pessoaF.getCpf());
        System.out.println(pessoaJ.getNome() + " é uma pessoa jurídica de cnpj: " + pessoaJ.getCnpj());
    }
}
