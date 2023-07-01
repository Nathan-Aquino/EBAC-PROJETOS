import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws NoSuchMethodException {
        Tabelas tabela = new Tabelas("Teste");
        tabela.criaTabela();

        Class classe = tabela.getClass();

        Method metodo = classe.getDeclaredMethod("criaTabela", null);

        String nomeAnotacao = metodo.getAnnotation(Tabela.class).value();

        System.out.println("Valor da anotação: " + nomeAnotacao);
    }
}
