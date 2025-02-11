package com.mycompany.circulo;
import java.util.Scanner;

public class Circulo {
    private int raio = 5;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return raio * raio * Math.PI;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo1 = new Circulo();
        
        System.out.println("Seu perímetro é: " + circulo1.calcularPerimetro());
        System.out.println("Sua área é: " + circulo1.calcularArea());
        
        scanner.close();
    }
}