package org.poo;

public class Operacion {
    public int dividir(int a , int b){
        try {
            return a/b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
