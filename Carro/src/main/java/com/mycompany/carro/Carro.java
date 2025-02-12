package com.mycompany.carro;
import java.util.Scanner;


public class Carro {
    public String modelo;
    public int ano;
   
    public String getModelo  (){
    return modelo;
    }
   
    public void setModelo (String modelo){
    this.modelo = modelo;
    }
    
    public int getAno  (){
    return ano;
    }
   
    public void setAno (int ano){
    this.ano = ano;
    }
   
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Qual o ano do carro?");
        carro.setAno(scanner.nextInt());
        System.out.println("Qual é o modelo do veículo?");
        carro.setModelo(scanner.next());
       
        System.out.println("O ano do carro é: " + carro.getAno());
        System.out.println("O moledo do carro é: " + carro.getModelo());
       
       
    }
   
}