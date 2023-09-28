package com.company;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     int Years;
        Scanner inp=new Scanner(System.in);

        System.out.print("Yıl Giriniz:");
        Years=inp.nextInt();
        if(Years>1000){
            if(Years%4==0) System.out.println(Years+" "+"Artık Bir Yıldır...");
            else System.out.println(Years+" "+"Artık Bir Yıl Değildir...");
        }
        else System.out.println("Hatalı Giriş Yaptınız Lütfen Tekrar Deneyeniz...");
    }
}
