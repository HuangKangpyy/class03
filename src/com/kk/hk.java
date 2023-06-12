package com.kk;
package cn.campsg.java.experiment;

import java.util.Scanner;
public class hk {
    /*public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int year =Scanner.nextInt();
        for (int year=1000;year<num;year++){
            if (year%4=0){
            }

        }

    }
}*/

    public static void main(String[] args) {
        int[] ages = getAges();
        int adults = getAdultsCount(ages);
        System.out.println("200个用户中，共有 :" + adults + "成年人");
    }
    public static int [] getAges(){
        int[] ages=new int[200];
        for(int i=0;i<ages.length;i++)
            ages[i]=(int)(Math.random()*61);
        return ages;
    }
    public static int getAdultsCount(Count(int[] ages){
        int adult=0;
        for (int i=0;i< ages().length;i++){
            if(ages[i]>=18){
                adult++;
            }
        }
        return adult;
    }
}



