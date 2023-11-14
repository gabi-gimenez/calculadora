package com.mycompany.calculadora;

public class Soma {
    
    public static void main(String[] args) {
        Teste calc = new Teste();

        //Teste 1 de somar com dois números
        int soma = calc.somar(10,10);
        System.out.println("10 +10: " + soma);

        //Teste 2 de somar um numero com numero negativo
        soma = calc.somar(10,-1);
        System.out.println("10 -1: " + soma);
      
        //Teste 3 de somar numero com zero
        soma = calc.somar(10,0);
        System.out.println("10 + 0: " + soma);

        //Teste 4 de somar zero com zero
        soma = calc.somar(0,0);
        System.out.println("0 + 0: " + soma);
         

    }
    
}
