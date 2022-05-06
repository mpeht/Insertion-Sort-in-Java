/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theinsertionsort;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class TheInsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        int size, i, num;
        System.out.println("Enter a size of vector");
        size = in.nextInt();
        int vet[] = new int[size];
        System.out.println("Enter the" + size + " nubers in the vector:");
        for (i = 0; i < vet.length; i++) {
            vet[i] = in.nextInt();
        }
        insertionSort(vet);
    }

    private static void insertionSort(int[] vet) {
        int i;
        int size = vet.length;  
        for (int j = 1; j < size; j++) {  
            int aux = vet[j];  
            i = j - 1;  
            while ( (i > -1) && (vet[i] > aux ) ) {  
                vet[i+1] = vet[i];  
                i--;  
            }  
            vet[i+1] = aux;  
        }  
        for (int j = 0; j < vet.length; ++j) {
            System.out.print(vet[j] + " ");
        }
    }
    }
    
