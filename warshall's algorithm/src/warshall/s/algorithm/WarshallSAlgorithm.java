/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warshall.s.algorithm;

import java.util.Scanner;

/**
 *
 * @author Muhammad Haris Zafar
 */
public class WarshallSAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number of elements in set: ");
        int n=in.nextInt();
        int [][] A=new int[n][n];
        int c=0;
        for (int i =0; i < n; i++){
            for (int j = 0; j < n; j++) {
                 A [i][j]=in.nextInt();
            }
        }
        c=trans(A,n);
        if (c!=0) {
            A=warshall(A,n);
            System.out.println("Transitive Closure:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
    public static int trans(int B[][],int n){
    int c=0;
       for (int i =0; i < n; i++){
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(B[i][j]==1){
                        if(B[j][k]==1){
                            if(B[i][k]!=1){
                                c++;
                            }
                        }
                    }
                }
            }
        }
        if(c==0){
            System.out.println("Transitive");
        }
        else{
            System.out.println("Not Transitive");
        }
        return c;
    }   
    public static int[][] warshall(int C[][],int n){
        int [][] M=new int [n][n];
        int [][] W=new int [n][n];
        int [] arr=new int [n];
        int l=0,sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=i;
        }
        while(l<n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                    }
                }
            }
            l++;
        }
        return C;
    }
}