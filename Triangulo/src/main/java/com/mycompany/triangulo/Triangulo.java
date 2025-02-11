

package com.mycompany.triangulo;
import java.util.Scanner;
public class Triangulo {
    int base = 10, altura = 20;
    
    public int getBase(int base){
    return base;
    }
    
    public void setBase(int base){
    this.base = base;
    }
    
     public int getAltura(int altura){
    return base;
    }
    
    public void setAltura(int altura){
    this.altura = altura;
    }
    
    public double calcularArea(){
    return base * altura / 2;
    }
    
    
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("A area e " + triangulo.calcularArea());
    }
}
