/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearstominutes;
import java.util.Scanner;
/**
 *
 * @author Richard Shiawase
 */
public class YearsToMinutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long konstanta = 525600;
        System.out.print("Masukkan tahun: ");
        int years = sc.nextInt();
        long minutes = years * 525600;
        System.out.println("Kamu sudah hidup "+minutes+" menit");
        
    }
    
}
