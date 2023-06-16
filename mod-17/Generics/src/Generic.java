import java.util.ArrayList;
import java.util.List;

public class Generic<T> {
    private List<T> lista;

    public Generic () {
        this.lista = new ArrayList<T>();
    }

    public void adiciona (T obj) {
        this.lista.add(obj);
    }

    public List<T> retornaLista () {
        return this.lista;
    }
}
