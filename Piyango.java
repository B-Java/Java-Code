import java.util.Random;

public class Piyango {
    public static void main(String[] args){
 
        //milli piyango idaresinin çekilişi
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int c = random.nextInt();
        int d = random.nextInt();
        int e = random.nextInt();
        int f = random.nextInt();
        
        //müşterinin bileti
        Random bilet = new Random();
        int x = bilet.nextInt();
        int y = bilet.nextInt();
        int z = bilet.nextInt();
        int q = bilet.nextInt();
        int w = bilet.nextInt();
        int r = bilet.nextInt();

        if(f == r){
            if (e == w){
                if (d == q){
                    if (c == z){
                        if (b == y){
                            if (a == x){
                                System.out.println("Büyük ikramiyeyi kazandınız.");
                            }
                            else{
                            System.out.println("400 lira kazandınız");
                            }
                        }
                        else{
                        System.out.println("300 lira kazandınız");
                        }
                    }
                    else{
                    System.out.println("200 lira kazandınız");
                    }
                }
                else{
                    System.out.println("100 lira kazandınız");
                }
            }
            else{
                System.out.println("Amorti");
            }
        }
        else{
            System.out.println("Hiçbir şey kazanamadınız.");
        }
    }
}
    
   
  
 
        

