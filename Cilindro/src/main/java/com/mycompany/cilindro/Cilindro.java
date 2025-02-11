package com.mycompany.cilindro;

public class Cilindro {
    double raio = 12, altura = 24;
    
    public double getRaio(double raio){
    return raio;
    }
    
    public void setRaio(double raio){
    this.raio = raio;
    }
    
    public double getAltura(double altura){
    return altura;
    }
    
    public void setAltura(double altura){
    this.altura = altura;
    }
    
    public double calcularVolume(){
    return Math.PI * raio * raio * altura;
    }
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        System.out.println("o raio e " + cilindro.calcularVolume());
    }
}
