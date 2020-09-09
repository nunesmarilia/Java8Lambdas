package com.mn;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

    static int numero;
    int somatorio;
    static int var = 1;

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

        /* Exemplo 1
        System.out.println(integers);

        for(Integer inteiro: integers ){
            inteiro = inteiro + 10;
            System.out.println(inteiro);
        }
        */

        //integers.forEach(x -> System.out.println(x));

        /* Exemplo 2
        integers.forEach(x->{
            x = x + 10;
            System.out.println(x);
        }); */

        /* Exemplo 3 - Aceita variavel static da classe para atribuir valor
        int numero = 10;

        integers.forEach(x->{
            x = x + numero;
            System.out.println(x);
        }); */


        LambdaApp app   = new LambdaApp();

        /* Exemplo 4
        integers.forEach(x->{
            numero  = 10;
            x = x + numero;
            app.somatorio   = app.somatorio + x;
            System.out.println(x);
        });

        System.out.println(app.somatorio);
        */

        /* Exemplo 5
        integers.forEach(x->{
            int y   = x/2;
            System.out.println(y);
            numero  = 10;
            x   = x + numero;
            app.somatorio   = app.somatorio + x;
            System.out.println(app.somatorio);
        }); */

        /* Exemplo 6 */
        integers.forEach(x->{
            var++;
            System.out.println(x);
        });

    }
}
