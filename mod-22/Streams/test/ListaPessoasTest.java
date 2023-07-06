import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaPessoasTest {
    @Test
    public void listaPessoasTest () {

        List<String> lista = new ArrayList<String>();
        Map<String, String> mapSexo = new HashMap<>();

        lista.add("Adriana-f");
        lista.add("Ricardo-m");
        lista.add("Fernanda-f");

        lista.forEach((pessoa) -> {
            String[] auxArray = pessoa.split("-");
            mapSexo.put(auxArray[0], auxArray[1]);
        });

        List<String> listaMasculina = App.listaPessoas('m', lista);
        List<String> listaFeminina = App.listaPessoas('f', lista);

        boolean apenasHomens = listaMasculina.stream().allMatch( pessoa -> mapSexo.containsKey(pessoa) && mapSexo.get(pessoa).equals("m") );
        Assert.assertTrue(apenasHomens);

        boolean apenasMulheres = listaFeminina.stream().allMatch( pessoa -> mapSexo.containsKey(pessoa) && mapSexo.get(pessoa).equals("f") );
        Assert.assertTrue(apenasMulheres);
    }
}
