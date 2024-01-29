package services;

import entities.Cliente;
import entities.Empresa;

public class TransacaoServiceImpl implements TransacaoService {
    private BancoDados bancoDados;

    public TransacaoServiceImpl(BancoDados bancoDados) {
        this.bancoDados = bancoDados;
    }

    @Override
    public boolean realizarTransacao(Cliente clienteTransacao, Empresa empresa, double valor, String tipo) {
        if (tipo.equals("DEPOSITO")) {
            empresa.depositar(valor);
        } else if (tipo.equals("SAQUE")) {
            empresa.sacar(valor);
        }

        bancoDados.atualizarSaldoEmpresa(empresa, valor);
        return false;
    }
}
