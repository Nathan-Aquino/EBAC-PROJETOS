package br.com.TDD.dao;

import br.com.TDD.Contrato;

public interface IContratoDao {
    public void salvar (Contrato contrato);

    public void excluir (Integer id);

    public void atualizar (Integer id, String contrato, String cliente);

    public Contrato buscar (Integer id);
}
