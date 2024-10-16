import java.util.Random;
import java.util.Scanner;

//Kullanıcı 1 ile 10 arasında belirlenen random sayıyı tahmin etmeye çalışır. 

public class Sayi{
    
   public static void main(String[] args){  

    System.out.println("1-10 arası sayı tahmin edin.");

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    
    Random random = new Random();
    int y = random.nextInt(100);
    
    if(x == y){
        System.out.println("Doğru");
    }
    else{
        System.out.println("Yanlış");
    }
      
    
 }
    
    
    
    
}

