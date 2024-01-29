package entities;

public class Empresa extends Usuario {
    private String cnpj;
    private double saldo;

    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    @Override
    public String getIdentificacao() {
        return cnpj;
    }
}
