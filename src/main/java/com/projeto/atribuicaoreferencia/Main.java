package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;

        System.out.println(intA);
        System.out.println(intB);
        System.out.println("=======");
        intA = 2;
        System.out.println(intA);
        System.out.println(intB);

        System.out.println("=======");

        MeuObj objA = new MeuObj(5);
        MeuObj objB = objA;

        System.out.println(objA);
        System.out.println(objB);
        objA.setNum(3);
        System.out.println(objA);
        System.out.println(objB);
    }
}
