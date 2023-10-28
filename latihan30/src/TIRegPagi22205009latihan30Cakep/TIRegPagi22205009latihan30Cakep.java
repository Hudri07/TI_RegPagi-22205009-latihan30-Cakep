/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIRegPagi22205009latihan30Cakep;
import java.util.Scanner;

/**
 *
 * @author Axioo
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * 
 * 
 */
public class TIRegPagi22205009latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String penutup = "\u001b[0m";
        String foregroundMerah = "\u001b[31m";
        String foregroundHijau = "\u001b[32m";
        String foregroundKuning = "\u001b[33m";
        String foregroundBiru = "\u001b[34m";
        String foregroundUngu = "\u001b[35m";
        String foregroundCyan = "\u001b[36m";
        
        Scanner scanner = new Scanner (System.in);
        System.out.print(foregroundMerah+"Kamu "+penutup+
                foregroundHijau+"ngerjain sendiri "+penutup+
                foregroundKuning+"latihan 17 sampe "+penutup+
                foregroundBiru+"latihan 30 ini?\n"+penutup);
        System.out.print(foregroundBiru+"Jawab "+penutup+
                foregroundMerah+"(Yoi/Enggak) "+penutup+": ");
        String jawab = scanner.next();
        
        if (jawab.equals("Yoi")) {
            System.out.println(foregroundMerah+"\nCakep Bener."+penutup+
                    foregroundUngu+" Good Job"+penutup);
        }else {
            System.out.println(foregroundMerah+"\nTetep cakep sih."+penutup+
                               foregroundCyan+"\nSing penting paham konsep nya yee."+penutup+
                               "\nKeep the code works dude");
        }
    }
}
 