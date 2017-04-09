package com.company;


import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
//	    // write your code here
//        Animal a = new Human();
//        a.cry();
//        Animal b = new Animal() {
//            @Override
//            public void cry() {
//                System.out.println("anyone cry");
//            }
//        };
//        b.cry();
//        LightA l = new LightA();
//        //Light l = new LightA();  cant find l.flag??
//        l.open();
//        l.cutoff();
//        System.out.println(l.flag);
//        double n, total;
//        int m;
//        Scanner scan = new Scanner(System.in);
//        while(scan.hasNextInt()){
//            n = (double)scan.nextInt();
//            m = scan.nextInt();
//            total = 0;
//            while (m > 0){
//                total += n;
//                n = Math.sqrt(n);
//                m--;
//            }
//            System.out.println(String.format("%.2f", total));
        Scanner scan =  new Scanner(System.in);
        String tag = Integer.toString(scan.nextInt());
        File f = new File("xxx.txt");
        boolean flag = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String tmp = br.readLine();
            while (tmp != null){
                String[] s = tmp.split(" ");
                for (String str:s){
                    if (str.equals(tag)){
                        flag = true;
                        break;
                    }
                }
                tmp = br.readLine();
            }
            System.out.println(flag);
            }catch (Exception e){

        }finally {
            //ioclose
        }

    }
}
