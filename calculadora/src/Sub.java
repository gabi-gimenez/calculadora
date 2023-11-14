package com.mycompany.calculadora;

public class Sub {

  public static void main(String[] args) {
    Teste calc = new Teste();

    // Teste 1 de subtrair numero maior com menor
    int sub = calc.subtrair(30, 10);
    System.out.println("30 - 10: " + sub);

    // Teste 2 de subtrair numero inteiro com numero negativo
    sub = calc.subtrair(30, -10);
    System.out.println("30 + 10: " + sub);
    
   // Teste 3  de subtrair numero inteiro com zero
     sub = calc.subtrair(30, 0);
    System.out.println("30 - 0: " + sub);
    

    // Teste 4 de substrair zero com zero
    sub = calc.subtrair(0, 0);
    System.out.println("0 - 0: " + sub);


    // Teste 5 de subtrair numeros iguais
    sub = calc.subtrair(30, 30);
    System.out.println("30 - 30: " + sub);
  }
}
