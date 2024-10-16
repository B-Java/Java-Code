import java.util.Scanner;

public class Milyoner{
    public static void main(String[] args){
        System.out.println("Kim milyoner olmak ister yarışmasına hoşgeldiniz!");
        System.out.println("Lütfen doğru cevabın yanındaki sayıyı giriniz.");

        int puan = 0;

        Scanner scanner = new Scanner(System.in);
                       
        int cevapanahtari[] = {2, 6, 11, 13 ,18};

        //Soru 1
        System.out.println("Soru 1 : Etna yanardağı hangi ülkededir?");
        System.out.println("1-Endonezya   2-İtalya    3-Kolombiya    4-Japonya");
        int cevap1 = scanner.nextInt();
        if( cevap1 == 2 ){
            System.out.println("Doğru cevap.");
            puan++;
        }
        else{
           System.out.println("Yanlış cevap."); 
        } 

        //Soru 2
        System.out.println("Soru 2 : Futbol tarihi boyunca en çok gol atan futbolcu kimdir??");
        System.out.println("5-Pele    6-Ronaldo 7-Maradona    8-Messi   ");
        int cevap2 = scanner.nextInt();
        if(cevap2 == 6 ){
            System.out.println("Doğru cevap.");
            puan++;
        }
        else{
           System.out.println("Yanlış cevap."); 
        }

        //Soru 3
        System.out.println("soru3:  Genç yaşta tahta çıkan, Bağdat ve Revan'ı fetheden ve yeniçeriler tarafından katledilen padişah kimdir.");
        System.out.println("9-4.Murat   10-2.Mahmut   11-genc_osman    12-Yıldırım Bayezid");
        int cevap3 = scanner.nextInt();
        if(cevap3 == 11){
            System.out.println("Doğru cevap.");
            puan++;
        }
        else{
           System.out.println("Yanlış cevap."); 
        }

        //Soru 4
        System.out.println("Soru 4 : Linux terminalinde bilgisayarı yeniden başlatan komut hangisidir?");
        System.out.println("13- reboot   14- shutdown    15- rm -rf    16- mkdir");
        int cevap4 = scanner.nextInt();
        if(cevap4 == 13){
            System.out.println("Doğru cevap.");
            puan++;
        }
        else{
           System.out.println("Yanlış cevap."); 
        }
        
        //soru 5
        System.out.println("soru5: Aşağıdaki kavramlardan hangisi object oriented programlamada erişim belirleme ile ilgilidir??");
        System.out.println("17- Polimorphism   18- encapsulation    19- Inheritance    20- Abstraction");
        
        int cevap5 = scanner.nextInt();
        
        if(cevap5 == 18){
            System.out.println("Doğru cevap.");
            puan++;
        }
        else{
           System.out.println("Yanlış cevap."); 
        }

        System.out.print("Aldığınız puan:  " + puan);

        int ikramiye = puan * 200000;
        System.out.print("  Kazandığınız ödül: " + ikramiye + "   Türk Lirası  ");
    }
}
