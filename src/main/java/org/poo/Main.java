package org.poo;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        System.out.println(operacion.dividir(15, 0));
        System.out.println(operacion.dividir(24, 0));
        System.out.println(operacion.dividir(9, 0));
        System.out.println(operacion.dividir(5, 0));
    }
}