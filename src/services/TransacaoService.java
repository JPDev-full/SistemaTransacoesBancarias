package services;

import entities.Cliente;
import entities.Empresa;

public interface TransacaoService {
    boolean realizarTransacao(Cliente clienteTransacao, Empresa empresa, double valorTransacao, String tipoTransacao);
}
