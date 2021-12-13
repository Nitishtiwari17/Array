package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] z=new int[20];
        int pos=0;
        int neg=0;
        int odd=0;
        int even=0;
        int zero=0;
        for(int i=0;i<z.length;i++){
            System.out.println("print the value of z["+i+"]");
            z[i]=sc.nextInt();
            if(z[i]>0) {
                pos++;
            }
            else if(z[i]<0) {
                neg++;
            }
            else {
                zero++;
            }
            if(z[i]%2==0){
                even++;
            }
        }
        System.out.println("positive:"+pos+"\nNegative:"+neg+"\nzen:"+zero+"\nodd:"+odd+"\nneven::"+even);

	// write your code here
    }
}
