import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Thread;


public class Okul{
    public static void main(String[] args){
        
        ArrayList<String> sinifmevcudu = new ArrayList<String>();
        
        Scanner scanner = new Scanner(System.in);
         
        int x = 0;
        
        try {
            while(x < 1){
                    
                   
                    System.out.println(" Öğrenci ismi giriniz:  ");
                    
                    String ogrenci = scanner.next();
                    while (ogrenci.equals("iptal")){
                        System.out.println("Yoklama iptal edildi.");
                        x++;
                        
                    }
                
                    sinifmevcudu.add(ogrenci);
                    int mevcut = sinifmevcudu.size();
                    
                    System.out.println(" Sınıf mevcudu:  " + mevcut + "'dir" );
                    Thread.sleep(2000);
                }
            }
        catch (Exception e) {
            System.out.println("Yoklama alınamadı.");
        }    
            
        } 
        
    
    }
