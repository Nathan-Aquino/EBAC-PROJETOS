package br.com.TDD;

public class Contrato {

    private Integer id;
    private String contrato;
    private String cliente;

    public Contrato (String contrato, String cliente) {
        this.id = this.id == null ? 1 : this.id++;
        this.contrato = contrato;
        this.cliente = cliente;
    }

    public String getContrato() {
        return contrato;
    }

    public String getCliente() {
        return cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
