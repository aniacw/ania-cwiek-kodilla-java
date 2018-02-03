package com.kodilla.stream.array;

import java.util.stream.IntStream;
/*
public final interface ArrayOperations {

     static int getAverage(int[] numbers) {
         int array[] = IntStream.range(0, numbers.length)
                 .filter(n -> numbers.get(n));
         System.out.println(array);
         int array2 = IntStream.range(0, array.length)
                 .average();

     }

    }

*/
//    Metoda getAverage(int[] numbers) powinna:
//        - przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
//        wyświetlić kolejne elementy tablicy,
// a następnie:
//        - przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive),
//        a także kolektora average() obliczyć średnią. Na korrńcu metoda powinna zwracać średnią jako wynik typu double.