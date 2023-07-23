package br.com.TDD.dao;

import br.com.TDD.Contrato;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContratoDao implements IContratoDao{

    private List<Contrato> contratos = new ArrayList<Contrato>();

    @Override
    public void salvar(Contrato contrato) {
        this.contratos.add(contrato);
    }

    @Override
    public void excluir(Integer id) {
        final int[] index = new int[1];
        this.contratos.forEach(contrato -> {
            if (contrato.getId().equals(id)) {
                index[0] = this.contratos.indexOf(contrato);
            }
        });
        this.contratos.remove(index[0]);
    }

    @Override
    public void atualizar(Integer id, String contrato, String cliente) {
        Contrato contratoBuscado = this.buscar(id);

        contratoBuscado.setContrato(contrato);
        contratoBuscado.setCliente(cliente);
    }

    @Override
    public Contrato buscar(Integer id) {
        List<Contrato> contratoBuscado = this.contratos.stream().filter(contrato -> contrato.getId().equals(id)).collect(Collectors.toList());
        return contratoBuscado.size() != 0? contratoBuscado.get(0) : null;
    }
}
