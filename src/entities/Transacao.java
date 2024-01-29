package entities;

public class Transacao {
    private Cliente cliente;
    private Empresa empresa;
    private double valor;
    private String tipo;

    public Transacao(Cliente cliente, Empresa empresa, double valor, String tipo) {
        this.cliente = cliente;
        this.empresa = empresa;
        this.valor = valor;
        this.tipo = tipo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
}
