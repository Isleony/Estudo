package org.example;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        this.saldo -= valor;
        return false;
    }

    public boolean transferir(double valor, ContaBancaria destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    class Banco {
        List<ContaBancaria> contas;

        public Banco() {
            this.contas = new ArrayList<>();
        }

        public void adicionarConta(ContaBancaria conta) {
            this.contas.add(conta);
        }

        public ContaBancaria buscarConta(String numeroConta) {
            for (ContaBancaria conta : contas) {
                if (conta.numeroConta.equals(numeroConta)) {
                    return conta;
                }
            }
            return null;
        }

        public void listarContas() {
            for (ContaBancaria conta : contas) {
                System.out.println("Titular" + titular + ", Número da Conta: " + conta.numeroConta + ", Saldo: " + conta.saldo);
                {

                }
            }
        }
    }
    public class Main {
        public void main(String[] args) {
            Banco banco = new Banco();

            ContaBancaria conta1 = new ContaBancaria("João", "12345", 1000.0);
            ContaBancaria conta2 = new ContaBancaria("Maria", "67890", 500.0);

            banco.adicionarConta(conta1);
            banco.adicionarConta(conta2);

            // Testando depósitos
            conta1.depositar(500.0);
            System.out.println("Saldo de João após depósito: " + conta1.saldo); // Saída: 1500.0

            // Testando saques
            boolean saqueRealizado = conta1.sacar(200.0);
            System.out.println("Saque de João foi realizado: " + saqueRealizado); // Saída: true
            System.out.println("Saldo de João após saque: " + conta1.saldo); // Saída: 1300.0

            // Testando transferências
            boolean transferenciaRealizada = conta1.transferir(300.0, conta2);
            System.out.println("Transferência de João para Maria foi realizada: " + transferenciaRealizada); // Saída: true
            System.out.println("Saldo de João após transferência: " + conta1.saldo); // Saída: 1000.0
            System.out.println("Saldo de Maria após receber transferência: " + conta2.saldo); // Saída: 800.0

            // Listando contas
            banco.listarContas();
        }
    }
}
