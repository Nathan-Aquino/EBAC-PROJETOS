package br.com.TDD.service;

import br.com.TDD.Contrato;
import br.com.TDD.dao.ContratoDao;
import br.com.TDD.dao.IContratoDao;

public class ContratoService {

    private IContratoDao contratoDao;

    public ContratoService (IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    public void salvar(Contrato contrato) {
        contratoDao.salvar(contrato);
    }


    public void excluir(Integer id) {
        contratoDao.excluir(id);
    }


    public void atualizar(Integer id, String contrato, String cliente) {
        contratoDao.atualizar(id, contrato, cliente);
    }


    public Contrato buscar(Integer id) {
        return contratoDao.buscar(id);
    }
}
