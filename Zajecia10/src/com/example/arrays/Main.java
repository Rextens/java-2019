package com.example.arrays;

public class Main {

    public static void wyswietl(double tablica[]){
        for(int i=0;i<tablica.length;i++)
            System.out.println("Element["+i+"]="+tablica[i]);
    }

    public static double sumaElementow(double zmienna[]){
        double suma = 0;

        for(int i=0;i<zmienna.length;i++){
            suma = suma + zmienna[i];
        }
        return suma;
    }

    public static void main(String[] args) {
	    double tablica[] = new double[5];

	    for(int i=0;i<tablica.length;i++)
	        tablica[i] = i;

	    wyswietl(tablica);

	    double suma = sumaElementow(tablica);

	    System.out.println("Suma elementów: "+suma);

    }
}
