package com.mycompany.contabancaria;

import java.util.Scanner;

public class ContaBancaria {
    private int escolha;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso.");
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial:");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Para depositar digite 1");
        System.out.println("Para sacar digite 2");
        conta.setEscolha(scanner.nextInt());

        if (conta.getEscolha() == 1) {
            System.out.println("Digite o valor a depositar:");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
        } else if (conta.getEscolha() == 2) {
            System.out.println("Digite o valor a sacar:");
            double valor = scanner.nextDouble();
            conta.sacar(valor);
        } else {
            System.out.println("Opcao invalida.");
        }

        System.out.println("Saldo final: " + conta.getSaldo());
        scanner.close();
    }
}

