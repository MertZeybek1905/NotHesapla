import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main1 {
    public static String NotHesapla(String isim,int vize1,int vize2,int finalNot){
      String sonuc="" ;
      Double notlar = (vize1*0.3)+(vize2*0.3)+ (finalNot*0.4);
      if(notlar>90){
          sonuc= isim+ "AA aldi";
      }
      else if(notlar>80){
        sonuc= isim+ "BA aldi";
      }
     else if(notlar>90){
        sonuc= isim+ "BC aldi";
    }
   else if(notlar>75){
        sonuc= isim+ "CC aldi";
    }
     else if(notlar>65){
        sonuc= isim+ "CD aldi";
    }
    else if(notlar>60){
        sonuc= isim+ "DC aldi";
    }
    else if(notlar>50){
        sonuc= isim+ "DD aldi";
    }
    else{
        sonuc = isim + " FF aldi";
    }
      return sonuc;

    }
   public static void main(String[] args) throws IOException {
    try(Scanner scanner = new Scanner(new FileReader("Notlar.txt"));
     FileWriter writer = new FileWriter("harfnotları.txt")){
         while(scanner.hasNextLine()){
             String ogrencinot = scanner.nextLine();
             String[] ogrencibilgi= ogrencinot.split(",");
             String isim = ogrencibilgi[0];
             int vize1= Integer.valueOf(ogrencibilgi[1]);
             int vize2= Integer.valueOf(ogrencibilgi[2]);
             int FinalNot= Integer.valueOf(ogrencibilgi[3]);
             String cıktı = NotHesapla(isim, vize1, vize2, FinalNot);

            writer.write(cıktı+"\n");
             
         }
     }
    }
}
