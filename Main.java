import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
    int x = 10;
    int y = 5;
    String takim[] = {" Beşiktaş "," Galatasaray "," Fenerbahçe "};    
        
    while(x>4){
            x--;
            System.out.println("while");
            
        }

    if ( y == 10 ){
            System.out.println("if");
        }
    else if( y == 5 ){
            
            System.out.print("Bu sezon " +  takim[1] + " ve " +  takim[2] +  "lige galibiyet ile başlamıştır.");
        }
    else{
            System.out.println("else");
        }       
        
    for (int i = 0 ; i <= takim.length ; i++){
        System.out.println(takim[0]);
        }
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Yaşınızı girin. ");
    int abc = scanner.nextInt();
    
    if(abc > 65){
        System.out.println("Emekliliğe hak kazandınız");
    }
    else{
        System.out.println("Çalışan sınıfındasınız");
    }
    
    scanner.close();
    
    }
}
        