
package boletin2_10;

import java.util.Scanner;


public class Boletin2_10 {

    
    public static void main(String[] args) {
        float bill100, bill20, bill5, mon1, euros;
        Scanner obx= new Scanner(System.in);
        System.out.println("introduce el numero de billetes de 100 euros : ");
        bill100=obx.nextFloat();
        System.out.println ("introduce el numero de billetes de 20 euros : ");
        bill20=obx.nextFloat();
        System.out.println("introduce el numero de billetes de 5 euros : ");
        bill5=obx.nextFloat();
        System.out.println("introduce el numero de monedas de 1 euro : ");
        mon1=obx.nextFloat();        
        euros=bill100*100+bill20*20+bill5*5+mon1;
        System.out.println("Hay un total de  : "+ euros +" euros ");
    }
    
}
