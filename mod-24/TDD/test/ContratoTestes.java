import br.com.TDD.Contrato;
import br.com.TDD.dao.ContratoDao;
import br.com.TDD.service.ContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoTestes {

    @Test
    public void testeSalvar () {
        ContratoService service = new ContratoService(new ContratoDao());

        Contrato contrato = new Contrato("Contrato Teste", "Teste");

        service.salvar(contrato);

        Contrato contratoBuscado = service.buscar(contrato.getId());

        Assert.assertTrue(contrato.getContrato().equals(contratoBuscado.getContrato()) && contrato.getCliente().equals(contratoBuscado.getCliente()));
    }

    @Test
    public void testeExcluir () {
        ContratoService service = new ContratoService(new ContratoDao());

        Contrato contrato = new Contrato("Contrato Teste", "Teste");

        service.salvar(contrato);

        service.excluir(contrato.getId());

        Contrato contratoBuscado = service.buscar(contrato.getId());

        Assert.assertTrue(contratoBuscado == null);
    }

    @Test
    public void testeAtualizar () {
        ContratoService service = new ContratoService(new ContratoDao());

        Contrato contrato = new Contrato("Contrato Teste", "Teste");

        service.salvar(contrato);

        service.atualizar(contrato.getId(), "Teste Contrato", "Teste");

        Contrato contratoBuscado = service.buscar(contrato.getId());

        Assert.assertTrue(contratoBuscado.getContrato().equals("Teste Contrato"));
    }

    @Test
    public void testeBuscar () {
        ContratoService service = new ContratoService(new ContratoDao());

        Contrato contrato = new Contrato("Contrato Teste", "Teste");

        service.salvar(contrato);

        Contrato contratoBuscado = service.buscar(contrato.getId());

        Assert.assertTrue(contrato.getContrato().equals(contratoBuscado.getContrato()) && contrato.getCliente().equals(contratoBuscado.getCliente()));
    }
}
