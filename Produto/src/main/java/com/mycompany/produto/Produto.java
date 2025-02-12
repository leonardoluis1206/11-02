package com.mycompany.produto;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double percentual) {
        return preco - (preco * (percentual / 100));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Produto p = new Produto();
        
        System.out.println("Digite o nome do produto:");
        p.setNome(scanner.nextLine());
        
        System.out.println("Digite o preco do produto:");
        p.setPreco(scanner.nextDouble());
        
        System.out.println("Digite o percentual de desconto:");
        double desconto = scanner.nextDouble();
        
        double precoComDesconto = p.aplicarDesconto(desconto);
        
        System.out.println("Produto: " + p.getNome());
        System.out.println("Preco original: " + p.getPreco());
        System.out.println("Preco com desconto: " + precoComDesconto);
        
        scanner.close();
    }
}