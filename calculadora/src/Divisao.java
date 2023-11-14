package com.mycompany.calculadora;

public class Divisao {

    public static void main(String[] args) {
        Teste calc = new Teste();

        // Teste - 1 divisão padrão
        int div = calc.dividir(10, 2);
        System.out.println("Resultado de 10/2 " + div);

        // Teste - 2 dividendo igual ao divisor
        div = calc.dividir(10, 10);
        System.out.println("10 / 10: " + div);
        
        // Teste - 3 divisão com divisão maior que dividendo
        div = calc.dividir(10, 20);
        System.out.println("10 / 20: " + div);

        // Teste - 4 divisão com zero
        div = calc.dividir(0,10);
        System.out.println("0 / 10: " + div);

       
        // Teste - 5 divisão com divisor negativo
        div = calc.dividir(10, -10);
        System.out.println("10 / -10: " + div);
    }
}