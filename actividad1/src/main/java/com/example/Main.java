package com.example;

public class Main {
    public static void main(String[] args) {
        //4.a) --------------------------
        byte edad = 25;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Pérez";
        boolean esMayorDeEdad = true;

        //4.b) --------------------------

        Byte edadObj = Byte.valueOf(edad);
        byte edadByte = edadObj;
        Double salarioObj = Double.valueOf(salario);
        System.out.println(nombre.toString());

        //4.c) --------------------------

        int salarioEnt = (int) salario;
        System.out.println(salarioEnt);
        long codigoPostalLargo = (long) codigoPostal;
        System.out.println(codigoPostalLargo);

        /* Lo que sucede al hacer el Casteo en la variables, es que cambia
        su valor de tipo de dato. 
        
        En el caso del salario, se convierte a un
        entero y asi los decimales se eliminan. 
        
        Y con el codigoPostalLargo,
        se convierte a un long y se pueden añadir muchos mas números que
        en vez de usar short */

        //4.d) --------------------------

        String numeroStr = "12345678";
        int numeroInt = Integer.parseInt(numeroStr);
        String decimalStr = "3.14159";
        double decimalValor = Double.parseDouble(decimalStr);
        System.out.println(numeroInt);
        System.out.println(decimalValor);
    }
}