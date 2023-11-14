package com.mycompany.calculadora;

public class Multi {
    
    public static void main(String[] args) {
        Teste calc = new Teste();

        //Teste 1 de multiplicação padrão
        int mult = calc.multiplicar(20,4);
        System.out.println("20 * 4: " + mult);

        //Teste2  de multiplicação com numero negativo
        mult = calc.multiplicar(20,-4);
        System.out.println("20 * (-4): " + mult);
        
        
        //Teste 3 de multiplicação de qualquer numero com zero 
        mult = calc.multiplicar(20,0);
        System.out.println("20 * 0: " + mult);
        
        //Teste 4 de multiplicação de zero com zero
        mult = calc.multiplicar(0,0);
        System.out.println("0 * 0: " + mult);
    }
}